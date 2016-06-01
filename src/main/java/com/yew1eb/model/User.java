package com.yew1eb.model;

/**
 * @author zhouhai
 * @createTime 16/5/29
 * @description
 */
public class User {

    private Long uid;
    private String loginName;
    private String password;
    private String avatar;
    private String email;
    private Long cTime;
    private Long uTime;
    private Integer roleId;
    private Integer status;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
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

    public Long getcTime() {
        return cTime;
    }

    public void setcTime(Long cTime) {
        this.cTime = cTime;
    }

    public Long getuTime() {
        return uTime;
    }

    public void setuTime(Long uTime) {
        this.uTime = uTime;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User [uid=" + uid + ", login_name=" + loginName + ", pass_word=" + password + ", avatar=" + avatar
                + ", email=" + email + ", create_time=" + cTime + ", update_time=" + uTime + ", role_id="
                + roleId + ", status=" + status + "]";
    }
}
