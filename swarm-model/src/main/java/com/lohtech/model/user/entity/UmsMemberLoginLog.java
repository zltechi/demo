package com.lohtech.model.user.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ums_member_login_log")
public class UmsMemberLoginLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "create_time")
    private Date createTime;

    private String ip;

    private String city;

    /**
     * 登录类型：0->PC；1->android;2->ios;3->小程序
     */
    @Column(name = "login_type")
    private Integer loginType;

    private String province;

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
     * @return member_id
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取登录类型：0->PC；1->android;2->ios;3->小程序
     *
     * @return login_type - 登录类型：0->PC；1->android;2->ios;3->小程序
     */
    public Integer getLoginType() {
        return loginType;
    }

    /**
     * 设置登录类型：0->PC；1->android;2->ios;3->小程序
     *
     * @param loginType 登录类型：0->PC；1->android;2->ios;3->小程序
     */
    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }
}