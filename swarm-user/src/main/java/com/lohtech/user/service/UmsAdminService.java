package com.lohtech.user.service;

import com.lohtech.model.user.entity.UmsAdmin;
import com.lohtech.model.user.entity.UmsPermission;
import com.lohtech.user.dto.UmsAdminParam;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UmsAdminService {
    UmsAdmin getAdminByUsername(String username);
    UmsAdmin register(UmsAdminParam param);
//    String login(String username, String password);
//
//    /**
//     * 获取用户所有权限（包括角色权限和+-权限）
//     */
//    List<UmsPermission> getPermissionList(Long adminId);
//
//    /**
//     * 获取用户信息
//     */
//    UserDetails loadUserByUsername(String username);
}
