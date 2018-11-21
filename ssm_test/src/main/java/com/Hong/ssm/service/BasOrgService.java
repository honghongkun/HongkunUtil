package com.Hong.ssm.service;


import java.util.List;

import com.Hong.ssm.bean.BasOrg;
import com.Hong.ssm.utils.PageModel;

public interface BasOrgService {

	/**
     * ��ѯ��֯�ṹ�б�
     * @param basOrg
     * @return
     */
	PageModel<BasOrg> selBasOrglist(BasOrg basOrg,Integer pageNo,Integer pageSize);
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
    boolean delBasOrgByID(Integer orgId);
    /**
     * ID��Ϊ����ִ���޸�
     * @param basOrg
     * @return
     */
    boolean editBasOrgByID(BasOrg basOrg);
    /**
     * ��ѯ���
     * @param basOrg
     * @return
     */
    List<BasOrg> selOrgcode(BasOrg basOrg);
    /**
     * ��ѯ���1
     * @param basOrg
     * @return
     */
    List<BasOrg> selOrgcode1(BasOrg basOrg);
    /**
     * ��ѯ���2
     * @param basOrg
     * @return
     */
    List<BasOrg> selOrgcode2(BasOrg basOrg);
    /**
     * �޸�״̬
     * @param basOrg
     * @return
     */
    void BasOrgdeditStatus(BasOrg basOrg);
}
