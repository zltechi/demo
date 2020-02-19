package com.lohtech.user.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.lohtech.model.user.dao.UmsAdminMapper;
import com.lohtech.model.user.entity.UmsAdmin;
import com.lohtech.model.user.entity.UmsAdminExample;
import com.lohtech.model.user.entity.UmsPermission;
import com.lohtech.security.util.JwtUtil;
import com.lohtech.user.dao.UmsAdminRoleRelationDao;
import com.lohtech.user.dto.UmsAdminParam;
import com.lohtech.user.service.UmsAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    private JwtUtil jwtUtil;

    @Resource
    UmsAdminMapper adminMapper;

    @Autowired
    UmsAdminRoleRelationDao adminRoleRelationDao;

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsAdmin> adminList = adminMapper.selectByExample(example);
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public UmsAdmin register(UmsAdminParam param) {
        UmsAdmin admin = new UmsAdmin();
        BeanUtil.copyProperties(param, admin);
        admin.setCreateTime(new Date());
        admin.setStatus(1);

        //NOTE 查重名
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(admin.getUsername());
        List<UmsAdmin> umsAdminList = adminMapper.selectByExample(example);
        if (umsAdminList.size() > 0) {
            return null;
        }

        //NOTE 密码加密 && 保存
        String encodePassword = passwordEncoder.encode(admin.getPassword());
        admin.setPassword(encodePassword);
        adminMapper.insert(admin);

        return admin;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = loadUserByUsername(username);
            if (! passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }

            UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(auth);
            token = jwtUtil.generateToken(userDetails);
            //NOTE 插入log表
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常：{}", e.getMessage());
        }

        return token;
    }

    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        return adminRoleRelationDao.getPermissionList(adminId);
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        UmsAdmin admin = getAdminByUsername(username);
        if (admin != null) {
            List<UmsPermission> permissionList = getPermissionList(admin.getId());
            return new AdminUserDetails(admin, permissionList);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

    public static class AdminUserDetails implements UserDetails {
        private UmsAdmin umsAdmin;
        private List<UmsPermission> permissionList;
        public AdminUserDetails(UmsAdmin umsAdmin,List<UmsPermission> permissionList) {
            this.umsAdmin = umsAdmin;
            this.permissionList = permissionList;
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            //返回当前用户的权限
            return permissionList.stream()
                    .filter(permission -> permission.getValue()!=null)
                    .map(permission ->new SimpleGrantedAuthority(permission.getValue()))
                    .collect(Collectors.toList());
        }

        @Override
        public String getPassword() {
            return umsAdmin.getPassword();
        }

        @Override
        public String getUsername() {
            return umsAdmin.getUsername();
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return umsAdmin.getStatus().equals(1);
        }
    }
}
