package com.lohtech.model.user.entity;

import javax.persistence.*;

@Table(name = "ums_admin_permission_relation")
public class UmsAdminPermissionRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "admin_id")
    private Long adminId;

    @Column(name = "permission_id")
    private Long permissionId;

    private Integer type;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return admin_id
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * @param adminId
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /**
     * @return permission_id
     */
    public Long getPermissionId() {
        return permissionId;
    }

    /**
     * @param permissionId
     */
    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }
}