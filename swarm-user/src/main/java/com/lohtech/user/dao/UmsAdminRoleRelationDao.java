package com.lohtech.user.dao;

import com.lohtech.model.user.entity.UmsPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UmsAdminRoleRelationDao extends Mapper<UmsPermission> {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}