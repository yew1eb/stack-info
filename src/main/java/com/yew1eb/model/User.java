package com.yew1eb.model;

/**
 * @author zhouhai
 * @createTime 16/5/29
 * @description
 */
public class User {

    private Long uid;
    private String login;
    private String password;
    private String avatar;
    private String email;
    private Long c_time;
    private Long u_time;
    private Integer role_id;
    private Integer status;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getC_time() {
        return c_time;
    }

    public void setC_time(Long c_time) {
        this.c_time = c_time;
    }

    public Long getU_time() {
        return u_time;
    }

    public void setU_time(Long u_time) {
        this.u_time = u_time;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User [uid=" + uid + ", login_name=" + login + ", pass_word=" + password + ", avatar=" + avatar
                + ", email=" + email + ", create_time=" + c_time + ", update_time=" + u_time + ", role_id="
                + role_id + ", status=" + status + "]";
    }
}
