package com.Hong.ssm.bean;

public class StuZy {
    private Integer zyId;

    private Integer zyPid;

    private String zyName;

    private Integer zyOrder;

    private String zyUrl;

    private Integer zyShow;

    public Integer getZyId() {
        return zyId;
    }

    public void setZyId(Integer zyId) {
        this.zyId = zyId;
    }

    public Integer getZyPid() {
        return zyPid;
    }

    public void setZyPid(Integer zyPid) {
        this.zyPid = zyPid;
    }

    public String getZyName() {
        return zyName;
    }

    public void setZyName(String zyName) {
        this.zyName = zyName == null ? null : zyName.trim();
    }

    public Integer getZyOrder() {
        return zyOrder;
    }

    public void setZyOrder(Integer zyOrder) {
        this.zyOrder = zyOrder;
    }

    public String getZyUrl() {
        return zyUrl;
    }

    public void setZyUrl(String zyUrl) {
        this.zyUrl = zyUrl == null ? null : zyUrl.trim();
    }

    public Integer getZyShow() {
        return zyShow;
    }

    public void setZyShow(Integer zyShow) {
        this.zyShow = zyShow;
    }
}