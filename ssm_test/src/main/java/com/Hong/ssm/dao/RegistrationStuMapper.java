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
     * 查询学生入住列表男
     * @param registrationStu
     * @return
     */
    List<RegistrationStu> selRegistrationStulist(RegistrationStu registrationStu);
    /**
     * 查询学生入住列表女
     * @param registrationStu
     * @return
     */
    List<RegistrationStu> selRegistrationStulistNV(RegistrationStu registrationStu);
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
    Integer editRegistrationStuPid(RegistrationStu registrationStu);
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
    Integer delRegistrationStu(Integer registrationId);
    /**
     * 修改
     * @param registrationStu
     * @return
     */
    Integer editRegistrationStu(RegistrationStu registrationStu);
}