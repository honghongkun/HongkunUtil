package com.Hong.ssm.service;


import java.util.List;

import com.Hong.ssm.bean.RegistrationStu;
import com.Hong.ssm.bean.RegistrationStuExt;
import com.Hong.ssm.utils.PageModel;

public interface RegistrationStuService {

	 /**
     * ��ѯѧ����ס�б�
     * @param registrationStu
     * @return
     */
    PageModel<RegistrationStu> selRegistrationStulist(RegistrationStu registrationStu,Integer pageNo,Integer pageSize);
    /**
     * ��ѯѧ����ס�б�Ů
     * @param registrationStu
     * @return
     */
    PageModel<RegistrationStu> selRegistrationStulistNV(RegistrationStu registrationStu,Integer pageNo,Integer pageSize);
    /**
     * �����ס
     * @param registrationStu
     * @return
     */
    Integer addRegistrationStu(RegistrationStu registrationStu);
    /**
     * ɾ����pid 0��Ϊ1
     * @param registrationStu
     * @return
     */
    void editRegistrationStuPid(RegistrationStu registrationStu);
    /**
     * ��ѯID
     * @param registrationId
     * @return
     */
    RegistrationStu selRegistrationStuByID(Integer registrationId);
    /**
     * ɾ��ѧ��
     * @param registrationId
     * @return
     */
    boolean delRegistrationStu(Integer registrationId);
    /**
     * �޸�
     * @param registrationStu
     * @return
     */
    boolean editRegistrationStu(RegistrationStu registrationStu);
}
