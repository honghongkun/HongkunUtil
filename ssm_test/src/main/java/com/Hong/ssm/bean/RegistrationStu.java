package com.Hong.ssm.bean;

public class RegistrationStu {
    private Integer registrationId;

    private Integer registrationPid;

    private String registrationStuName;

    private String registrationStuSex;

    private String registrationDoyName;

    private String registrationRoom;

    private String registrationPhone;

    private String registrationDate;

    public Integer getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Integer registrationId) {
        this.registrationId = registrationId;
    }

    public Integer getRegistrationPid() {
        return registrationPid;
    }

    public void setRegistrationPid(Integer registrationPid) {
        this.registrationPid = registrationPid;
    }

    public String getRegistrationStuName() {
        return registrationStuName;
    }

    public void setRegistrationStuName(String registrationStuName) {
        this.registrationStuName = registrationStuName == null ? null : registrationStuName.trim();
    }

    public String getRegistrationStuSex() {
        return registrationStuSex;
    }

    public void setRegistrationStuSex(String registrationStuSex) {
        this.registrationStuSex = registrationStuSex == null ? null : registrationStuSex.trim();
    }

    public String getRegistrationDoyName() {
        return registrationDoyName;
    }

    public void setRegistrationDoyName(String registrationDoyName) {
        this.registrationDoyName = registrationDoyName == null ? null : registrationDoyName.trim();
    }

    public String getRegistrationRoom() {
        return registrationRoom;
    }

    public void setRegistrationRoom(String registrationRoom) {
        this.registrationRoom = registrationRoom == null ? null : registrationRoom.trim();
    }

    public String getRegistrationPhone() {
        return registrationPhone;
    }

    public void setRegistrationPhone(String registrationPhone) {
        this.registrationPhone = registrationPhone == null ? null : registrationPhone.trim();
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate == null ? null : registrationDate.trim();
    }
}