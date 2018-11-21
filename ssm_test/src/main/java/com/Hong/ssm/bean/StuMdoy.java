package com.Hong.ssm.bean;

public class StuMdoy {
    private Integer mdoyId;

    private Integer mdoyPid;

    private String mdoyName;

    private Integer mdoyOrder;

    private String mdoyUrl;

    private Integer mdoyShow;

    public Integer getMdoyId() {
        return mdoyId;
    }

    public void setMdoyId(Integer mdoyId) {
        this.mdoyId = mdoyId;
    }

    public Integer getMdoyPid() {
        return mdoyPid;
    }

    public void setMdoyPid(Integer mdoyPid) {
        this.mdoyPid = mdoyPid;
    }

    public String getMdoyName() {
        return mdoyName;
    }

    public void setMdoyName(String mdoyName) {
        this.mdoyName = mdoyName == null ? null : mdoyName.trim();
    }

    public Integer getMdoyOrder() {
        return mdoyOrder;
    }

    public void setMdoyOrder(Integer mdoyOrder) {
        this.mdoyOrder = mdoyOrder;
    }

    public String getMdoyUrl() {
        return mdoyUrl;
    }

    public void setMdoyUrl(String mdoyUrl) {
        this.mdoyUrl = mdoyUrl == null ? null : mdoyUrl.trim();
    }

    public Integer getMdoyShow() {
        return mdoyShow;
    }

    public void setMdoyShow(Integer mdoyShow) {
        this.mdoyShow = mdoyShow;
    }
}