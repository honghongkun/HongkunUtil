package com.Hong.ssm.service;

import java.util.List;

import com.Hong.ssm.bean.StuDoy;
import com.Hong.ssm.utils.PageModel;

public interface StuDoyService {

	/**
     * 查询宿舍楼列表
     * @param stuDoy
     * @return
     */
    PageModel<StuDoy> selStuDoylist(StuDoy stuDoy,Integer pageSize,Integer pageNo);
    /**
     * 添加
     * @param stuDoy
     * @return
     */
    Integer addStuDoy(StuDoy stuDoy);
    /**
     * 删除
     * @param doyId
     * @return
     */
    boolean delStuDoy(Integer doyId);
    /**
     * 修改
     * @param stuDoy
     * @return
     */
    boolean editStuDoy(StuDoy stuDoy);
    /**
     * 查询ID
     * @param doyId
     * @return
     */
    StuDoy selStuDoyByID(Integer doyId);
   /** 查询宿舍楼为1的男生宿舍
    * @param stuDoy
    * @return
    */
   List<StuDoy> selDoyNamelist1(StuDoy stuDoy);
   /** 查询宿舍楼为2的女生宿舍
    * @param stuDoy
    * @return
    */
   List<StuDoy> selDoyNamelist2(StuDoy stuDoy);
}
