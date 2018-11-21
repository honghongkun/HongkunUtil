package com.Hong.ssm.service;

import java.util.List;

import com.Hong.ssm.bean.StuDoy;
import com.Hong.ssm.utils.PageModel;

public interface StuDoyService {

	/**
     * ��ѯ����¥�б�
     * @param stuDoy
     * @return
     */
    PageModel<StuDoy> selStuDoylist(StuDoy stuDoy,Integer pageSize,Integer pageNo);
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
    boolean delStuDoy(Integer doyId);
    /**
     * �޸�
     * @param stuDoy
     * @return
     */
    boolean editStuDoy(StuDoy stuDoy);
    /**
     * ��ѯID
     * @param doyId
     * @return
     */
    StuDoy selStuDoyByID(Integer doyId);
   /** ��ѯ����¥Ϊ1����������
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
