package com.Hong.ssm.dao;

import com.Hong.ssm.bean.BasStu;
import com.Hong.ssm.bean.BasStuExample;
import com.Hong.ssm.bean.BasStuExt;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasStuMapper {
    int countByExample(BasStuExample example);

    int deleteByExample(BasStuExample example);

    int deleteByPrimaryKey(Integer stuId);

    int insert(BasStu record);

    int insertSelective(BasStu record);

    List<BasStu> selectByExample(BasStuExample example);

    BasStu selectByPrimaryKey(Integer stuId);

    int updateByExampleSelective(@Param("record") BasStu record, @Param("example") BasStuExample example);

    int updateByExample(@Param("record") BasStu record, @Param("example") BasStuExample example);

    int updateByPrimaryKeySelective(BasStu record);

    int updateByPrimaryKey(BasStu record);
    /**
     * ��ѯѧ���б�
     * @param basStu
     * @return
     */
    List<BasStu> selBasStulist(BasStu basStu);
    /**
     * ������֯�ṹ���ѯ���
     * @param basStu
     * @return
     */
    List<BasStuExt> selBasStuOrBasOrglist(BasStu basStu);
    /**
     * ��ѯ�����б�
     * @param basStu
     * @return
     */
    List<BasStuExt> selBasStuselect(BasStu basStu);
    /**
     * ���ѧ��
     * @param basStu
     * @return
     */
    Integer addBasStu(BasStu basStu);
    /**
     * �޸�ѧ��
     * @param basStu
     * @return
     */
    Integer editBasStu(BasStu basStu);
    /**
     * ɾ��
     * @param stuId
     * @return
     */
    Integer delBasStu(Integer stuId);
    /**
     * ��ѯ��Ϣ��ýѧԺorgcodeΪ1��ѧ��
     * @param basStu
     * @return
     */
    List<BasStuExt> selOrgcodelist(BasStu basStu);
    /**
     * ��ѯҽ��ѧԺorgcodeΪ2��ѧ��
     * @param basStu
     * @return
     */
    List<BasStuExt> selOrgcodelist2(BasStu basStu);
    /**
     * ��ѯѧ��ID
     * @param stuId
     * @return
     */
    BasStu selBasStuID(Integer stuId);
    /**
     * ��ѯѧ��ID�ͻ�ȡ��֯���
     * @param basStu
     * @return
     */
    BasStuExt selBasStuExtByID(Integer stuId);
    /**
     * ��ѯ��ѧ��
     * @param basStu
     * @return
     */
    List<BasStu> selStuSexN(BasStu basStu);
    /**
     * ��ѯŮѧ��
     * @param basStu
     * @return
     */
    List<BasStu> selStuSexV(BasStu basStu);
}