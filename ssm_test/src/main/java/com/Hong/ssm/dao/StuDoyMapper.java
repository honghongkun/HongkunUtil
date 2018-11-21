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
     * 查询宿舍楼列表
     * @param stuDoy
     * @return
     */
    List<StuDoy> selStuDoylist(StuDoy stuDoy);
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
    Integer delStuDoy(Integer doyId);
    /**
     * 修改
     * @param stuDoy
     * @return
     */
    Integer editStuDoy(StuDoy stuDoy);
    /**
     * 查询ID
     * @param doyId
     * @return
     */
    StuDoy selStuDoyByID(Integer doyId);/**
     * 查询宿舍楼为1的男生宿舍
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