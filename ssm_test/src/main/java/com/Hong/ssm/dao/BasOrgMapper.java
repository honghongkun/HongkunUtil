package com.Hong.ssm.dao;

import com.Hong.ssm.bean.BasOrg;
import com.Hong.ssm.bean.BasOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasOrgMapper {
    int countByExample(BasOrgExample example);

    int deleteByExample(BasOrgExample example);

    int deleteByPrimaryKey(Integer orgId);

    int insert(BasOrg record);

    int insertSelective(BasOrg record);

    List<BasOrg> selectByExample(BasOrgExample example);

    BasOrg selectByPrimaryKey(Integer orgId);

    int updateByExampleSelective(@Param("record") BasOrg record, @Param("example") BasOrgExample example);

    int updateByExample(@Param("record") BasOrg record, @Param("example") BasOrgExample example);

    int updateByPrimaryKeySelective(BasOrg record);

    int updateByPrimaryKey(BasOrg record);
    /**
     * ��ѯ��֯�ṹ�б�
     * @param basOrg
     * @return
     */
    List<BasOrg> selBasOrgList(BasOrg basOrg);
    /**
     * ���
     * @param basOrg
     * @return
     */
    Integer addBasOrg(BasOrg basOrg);
    /**
     * ��ѯID
     * @param orgId
     * @return
     */
    BasOrg selBasOrgByID(Integer orgId);
    /**
     * ID��Ϊ����ɾ��
     * @param orgId
     * @return
     */
    Integer deleteByID(Integer orgId);
    /**
     * ID��Ϊ����ִ���޸�
     * @param basOrg
     * @return
     */
    Integer editBasOrgByID(BasOrg basOrg);
    /**
     * ��ѯ���
     * @param basOrg
     * @return
     */
    List<BasOrg> selOrgcode(BasOrg basOrg);
    /**
     * ��ѯ���Ϊ1
     * @param basOrg
     * @return
     */
    List<BasOrg> selOrgcode1(BasOrg basOrg);
    /**
     * ��ѯ���Ϊ2
     * @param basOrg
     * @return
     */
    List<BasOrg> selOrgcode2(BasOrg basOrg);
    /**
     * �޸�״̬
     * @param basOrg
     * @return
     */
    Integer BasOrdeditStatus(BasOrg basOrg);
}