package com.Hong.ssm.bean;

public class StuDoy {
    private Integer doyId;

    private String doyName;

    private String doyRemark;

    private Integer doyPid;

    private String doyUsers;

    public Integer getDoyId() {
        return doyId;
    }

    public void setDoyId(Integer doyId) {
        this.doyId = doyId;
    }

    public String getDoyName() {
        return doyName;
    }

    public void setDoyName(String doyName) {
        this.doyName = doyName == null ? null : doyName.trim();
    }

    public String getDoyRemark() {
        return doyRemark;
    }

    public void setDoyRemark(String doyRemark) {
        this.doyRemark = doyRemark == null ? null : doyRemark.trim();
    }

    public Integer getDoyPid() {
        return doyPid;
    }

    public void setDoyPid(Integer doyPid) {
        this.doyPid = doyPid;
    }

    public String getDoyUsers() {
        return doyUsers;
    }

    public void setDoyUsers(String doyUsers) {
        this.doyUsers = doyUsers == null ? null : doyUsers.trim();
    }
}