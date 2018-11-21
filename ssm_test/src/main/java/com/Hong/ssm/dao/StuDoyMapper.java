package com.Hong.ssm.dao;

import com.Hong.ssm.bean.StuDoy;
import com.Hong.ssm.bean.StuDoyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuDoyMapper {
    int countByExample(StuDoyExample example);

    int deleteByExample(StuDoyExample example);

    int deleteByPrimaryKey(Integer doyId);

    int insert(StuDoy record);

    int insertSelective(StuDoy record);

    List<StuDoy> selectByExample(StuDoyExample example);

    StuDoy selectByPrimaryKey(Integer doyId);

    int updateByExampleSelective(@Param("record") StuDoy record, @Param("example") StuDoyExample example);

    int updateByExample(@Param("record") StuDoy record, @Param("example") StuDoyExample example);

    int updateByPrimaryKeySelective(StuDoy record);

    int updateByPrimaryKey(StuDoy record);
    /**
     * ��ѯ����¥�б�
     * @param stuDoy
     * @return
     */
    List<StuDoy> selStuDoylist(StuDoy stuDoy);
    /**
     * ���
     * @param stuDoy
     * @return
     */
    Integer addStuDoy(StuDoy stuDoy);
    /**
     * ɾ��
     * @param doyId
     * @return
     */
    Integer delStuDoy(Integer doyId);
    /**
     * �޸�
     * @param stuDoy
     * @return
     */
    Integer editStuDoy(StuDoy stuDoy);
    /**
     * ��ѯID
     * @param doyId
     * @return
     */
    StuDoy selStuDoyByID(Integer doyId);/**
     * ��ѯ����¥Ϊ1����������
     * @param stuDoy
     * @return
     */
    List<StuDoy> selDoyNamelist1(StuDoy stuDoy);
    /** ��ѯ����¥Ϊ2��Ů������
    * @param stuDoy
    * @return
    */
   List<StuDoy> selDoyNamelist2(StuDoy stuDoy);
}