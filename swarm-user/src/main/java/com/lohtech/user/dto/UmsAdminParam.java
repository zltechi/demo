package com.lohtech.user.dto;

import io.swagger.annotations.ApiModelProperty;
//import org.hibernate.validator.constraints.Email;
//import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


public class UmsAdminParam {
    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;
    @ApiModelProperty(value = "用户头像")
    private String icon;
    @ApiModelProperty(value = "邮箱")
    @Email(message = "邮箱格式不合法")
    private String email;
    @ApiModelProperty(value = "用户昵称")
    private String nickname;
    @ApiModelProperty(value = "备注")
    private String note;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }
}