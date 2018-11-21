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
     * 查询学籍列表
     * @param basStu
     * @return
     */
    List<BasStu> selBasStulist(BasStu basStu);
    /**
     * 关联组织结构表查询编号
     * @param basStu
     * @return
     */
    List<BasStuExt> selBasStuOrBasOrglist(BasStu basStu);
    /**
     * 查询下拉列表
     * @param basStu
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
    Integer editBasStu(BasStu basStu);
    /**
     * 删除
     * @param stuId
     * @return
     */
    Integer delBasStu(Integer stuId);
    /**
     * 查询信息传媒学院orgcode为1的学生
     * @param basStu
     * @return
     */
    List<BasStuExt> selOrgcodelist(BasStu basStu);
    /**
     * 查询医护学院orgcode为2的学生
     * @param basStu
     * @return
     */
    List<BasStuExt> selOrgcodelist2(BasStu basStu);
    /**
     * 查询学生ID
     * @param stuId
     * @return
     */
    BasStu selBasStuID(Integer stuId);
    /**
     * 查询学籍ID和获取组织编号
     * @param basStu
     * @return
     */
    BasStuExt selBasStuExtByID(Integer stuId);
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