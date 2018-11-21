package com.Hong.ssm.service;


import java.util.List;

import com.Hong.ssm.bean.RegistrationStu;
import com.Hong.ssm.bean.RegistrationStuExt;
import com.Hong.ssm.utils.PageModel;

public interface RegistrationStuService {

	 /**
     * 查询学生入住列表
     * @param registrationStu
     * @return
     */
    PageModel<RegistrationStu> selRegistrationStulist(RegistrationStu registrationStu,Integer pageNo,Integer pageSize);
    /**
     * 查询学生入住列表女
     * @param registrationStu
     * @return
     */
    PageModel<RegistrationStu> selRegistrationStulistNV(RegistrationStu registrationStu,Integer pageNo,Integer pageSize);
    /**
     * 添加入住
     * @param registrationStu
     * @return
     */
    Integer addRegistrationStu(RegistrationStu registrationStu);
    /**
     * 删除把pid 0改为1
     * @param registrationStu
     * @return
     */
    void editRegistrationStuPid(RegistrationStu registrationStu);
    /**
     * 查询ID
     * @param registrationId
     * @return
     */
    RegistrationStu selRegistrationStuByID(Integer registrationId);
    /**
     * 删除学生
     * @param registrationId
     * @return
     */
    boolean delRegistrationStu(Integer registrationId);
    /**
     * 修改
     * @param registrationStu
     * @return
     */
    boolean editRegistrationStu(RegistrationStu registrationStu);
}
