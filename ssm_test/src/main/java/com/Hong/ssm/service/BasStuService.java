package com.Hong.ssm.service;

import java.util.List;

import com.Hong.ssm.bean.BasStu;
import com.Hong.ssm.bean.BasStuExt;
import com.Hong.ssm.utils.PageModel;

public interface BasStuService {

	/**
     * ��ѯѧ����Ϣ�б�
     * @param basOrg
     * @return
     */
	PageModel<BasStu> selBasStulist(BasStu basStu,Integer pageNo,Integer pageSize);
	/**
     * ������֯�ṹ���ѯ���
     * @param basOrg
     * @return
     */
	PageModel<BasStuExt> selBasStuOrBasOrglist(BasStu basStu,Integer pageNo,Integer pageSize);
	/**
     * ��ѯ����
     * @param basOrg
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
   boolean editBasStu(BasStu basStu);
   
    /**
     * ID��Ϊ����ɾ��
     * @param stuId
     * @return
     */
    boolean delBasStu(Integer stuId);
   /**
    * ������֯�ṹ���ѯ��Ϣ��ýorgΪ1��ѧ��
    * @param basOrg
    * @return
    */
	PageModel<BasStuExt> selOrgcodelist(BasStu basStu,Integer pageNo,Integer pageSize);
	/**
	    * ������֯�ṹ���ѯҽ��orgΪ2��ѧ��
	    * @param basOrg
	    * @return
	    */
	PageModel<BasStuExt> selOrgcodelist2(BasStu basStu,Integer pageNo,Integer pageSize);
	 /**
     * ��ѯѧ��ID
     * @param stuId
     * @return
     */
    BasStu selBasStuID(Integer stuId);
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
