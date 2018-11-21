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
     * 查询组织结构列表
     * @param basOrg
     * @return
     */
    List<BasOrg> selBasOrgList(BasOrg basOrg);
    /**
     * 添加
     * @param basOrg
     * @return
     */
    Integer addBasOrg(BasOrg basOrg);
    /**
     * 查询ID
     * @param orgId
     * @return
     */
    BasOrg selBasOrgByID(Integer orgId);
    /**
     * ID作为条件删除
     * @param orgId
     * @return
     */
    Integer deleteByID(Integer orgId);
    /**
     * ID作为条件执行修改
     * @param basOrg
     * @return
     */
    Integer editBasOrgByID(BasOrg basOrg);
    /**
     * 查询编号
     * @param basOrg
     * @return
     */
    List<BasOrg> selOrgcode(BasOrg basOrg);
    /**
     * 查询编号为1
     * @param basOrg
     * @return
     */
    List<BasOrg> selOrgcode1(BasOrg basOrg);
    /**
     * 查询编号为2
     * @param basOrg
     * @return
     */
    List<BasOrg> selOrgcode2(BasOrg basOrg);
    /**
     * 修改状态
     * @param basOrg
     * @return
     */
    Integer BasOrdeditStatus(BasOrg basOrg);
}