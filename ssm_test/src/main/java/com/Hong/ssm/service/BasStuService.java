package com.Hong.ssm.service;

import java.util.List;

import com.Hong.ssm.bean.BasStu;
import com.Hong.ssm.bean.BasStuExt;
import com.Hong.ssm.utils.PageModel;

public interface BasStuService {

	/**
     * 查询学籍信息列表
     * @param basOrg
     * @return
     */
	PageModel<BasStu> selBasStulist(BasStu basStu,Integer pageNo,Integer pageSize);
	/**
     * 关联组织结构表查询编号
     * @param basOrg
     * @return
     */
	PageModel<BasStuExt> selBasStuOrBasOrglist(BasStu basStu,Integer pageNo,Integer pageSize);
	/**
     * 查询下拉
     * @param basOrg
     * @return
     */
   List<BasStuExt> selBasStuselect(BasStu basStu);
   /**
    * 添加学籍
    * @param basStu
    * @return
    */
   Integer addBasStu(BasStu basStu);
   /**
    * 修改学籍
    * @param basStu
    * @return
    */
   boolean editBasStu(BasStu basStu);
   
    /**
     * ID作为条件删除
     * @param stuId
     * @return
     */
    boolean delBasStu(Integer stuId);
   /**
    * 关联组织结构表查询信息传媒org为1的学生
    * @param basOrg
    * @return
    */
	PageModel<BasStuExt> selOrgcodelist(BasStu basStu,Integer pageNo,Integer pageSize);
	/**
	    * 关联组织结构表查询医护org为2的学生
	    * @param basOrg
	    * @return
	    */
	PageModel<BasStuExt> selOrgcodelist2(BasStu basStu,Integer pageNo,Integer pageSize);
	 /**
     * 查询学生ID
     * @param stuId
     * @return
     */
    BasStu selBasStuID(Integer stuId);
    /**
     * 查询男学生
     * @param basStu
     * @return
     */
    List<BasStu> selStuSexN(BasStu basStu);
    /**
     * 查询女学生
     * @param basStu
     * @return
     */
    List<BasStu> selStuSexV(BasStu basStu);
}
