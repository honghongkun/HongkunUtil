package com.Hong.ssm.bean;

public class BasOrg {
    private Integer orgId;

    private Integer orgPid;

    private String orgLevel;

    private String orgName;

    private Integer orgCodebystu;

    private Integer orgStatus;

    private Integer delflag;

    private String orgInfo;

    private String cuid;

    private String cudate;

    private String euid;

    private String eudate;

    private String orgDepartment;

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getOrgPid() {
        return orgPid;
    }

    public void setOrgPid(Integer orgPid) {
        this.orgPid = orgPid;
    }

    public String getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel == null ? null : orgLevel.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Integer getOrgCodebystu() {
        return orgCodebystu;
    }

    public void setOrgCodebystu(Integer orgCodebystu) {
        this.orgCodebystu = orgCodebystu;
    }

    public Integer getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(Integer orgStatus) {
        this.orgStatus = orgStatus;
    }

    public Integer getDelflag() {
        return delflag;
    }

    public void setDelflag(Integer delflag) {
        this.delflag = delflag;
    }

    public String getOrgInfo() {
        return orgInfo;
    }

    public void setOrgInfo(String orgInfo) {
        this.orgInfo = orgInfo == null ? null : orgInfo.trim();
    }

    public String getCuid() {
        return cuid;
    }

    public void setCuid(String cuid) {
        this.cuid = cuid == null ? null : cuid.trim();
    }

    public String getCudate() {
        return cudate;
    }

    public void setCudate(String cudate) {
        this.cudate = cudate == null ? null : cudate.trim();
    }

    public String getEuid() {
        return euid;
    }

    public void setEuid(String euid) {
        this.euid = euid == null ? null : euid.trim();
    }

    public String getEudate() {
        return eudate;
    }

    public void setEudate(String eudate) {
        this.eudate = eudate == null ? null : eudate.trim();
    }

    public String getOrgDepartment() {
        return orgDepartment;
    }

    public void setOrgDepartment(String orgDepartment) {
        this.orgDepartment = orgDepartment == null ? null : orgDepartment.trim();
    }
}