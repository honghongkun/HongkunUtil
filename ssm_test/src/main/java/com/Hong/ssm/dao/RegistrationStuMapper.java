package com.Hong.ssm.dao;

import com.Hong.ssm.bean.RegistrationStu;
import com.Hong.ssm.bean.RegistrationStuExample;
import com.Hong.ssm.bean.RegistrationStuExt;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegistrationStuMapper {
    int countByExample(RegistrationStuExample example);

    int deleteByExample(RegistrationStuExample example);

    int deleteByPrimaryKey(Integer registrationId);

    int insert(RegistrationStu record);

    int insertSelective(RegistrationStu record);

    List<RegistrationStu> selectByExample(RegistrationStuExample example);

    RegistrationStu selectByPrimaryKey(Integer registrationId);

    int updateByExampleSelective(@Param("record") RegistrationStu record, @Param("example") RegistrationStuExample example);

    int updateByExample(@Param("record") RegistrationStu record, @Param("example") RegistrationStuExample example);

    int updateByPrimaryKeySelective(RegistrationStu record);

    int updateByPrimaryKey(RegistrationStu record);
    /**
     * ��ѯѧ����ס�б���
     * @param registrationStu
     * @return
     */
    List<RegistrationStu> selRegistrationStulist(RegistrationStu registrationStu);
    /**
     * ��ѯѧ����ס�б�Ů
     * @param registrationStu
     * @return
     */
    List<RegistrationStu> selRegistrationStulistNV(RegistrationStu registrationStu);
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
    Integer editRegistrationStuPid(RegistrationStu registrationStu);
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
    Integer delRegistrationStu(Integer registrationId);
    /**
     * �޸�
     * @param registrationStu
     * @return
     */
    Integer editRegistrationStu(RegistrationStu registrationStu);
}