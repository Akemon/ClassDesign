package com.classDesign.bean;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class User {
    private Integer userId;

    @NotBlank(message = "用户名不能为空")
    @NotNull(message = "用户名不能为空")
    private String username;

    @NotNull(message = "密码不能为空")
    @NotBlank(message = "密码不能空")
    private String userpass;

    public User(Integer userId, String username, String userpass, Integer province) {
        this.userId = userId;
        this.username = username;
        this.userpass = userpass;
        this.province = province;
    }

    public User() {
    }

    private Integer province;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass == null ? null : userpass.trim();
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }
}