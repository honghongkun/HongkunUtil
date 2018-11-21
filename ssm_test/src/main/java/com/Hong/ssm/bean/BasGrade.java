package com.Hong.ssm.bean;

public class BasGrade {
    private Integer basId; //班级id

    private Integer basStuGrade;//对应basorgid

    private String basName;//年级名称

    public Integer getBasId() {
        return basId;
    }

    public void setBasId(Integer basId) {
        this.basId = basId;
    }

    public Integer getBasStuGrade() {
        return basStuGrade;
    }

    public void setBasStuGrade(Integer basStuGrade) {
        this.basStuGrade = basStuGrade;
    }

    public String getBasName() {
        return basName;
    }

    public void setBasName(String basName) {
        this.basName = basName == null ? null : basName.trim();
    }
}