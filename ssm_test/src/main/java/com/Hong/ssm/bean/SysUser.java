package com.Hong.ssm.bean;

public class SysUser {
    private Integer userId;

    private String userName;

    private String userZh;

    private String userPwd;

    private String userPhone;

    private Integer userRolepid;

    private Integer userStatus;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserZh() {
        return userZh;
    }

    public void setUserZh(String userZh) {
        this.userZh = userZh == null ? null : userZh.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getUserRolepid() {
        return userRolepid;
    }

    public void setUserRolepid(Integer userRolepid) {
        this.userRolepid = userRolepid;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}