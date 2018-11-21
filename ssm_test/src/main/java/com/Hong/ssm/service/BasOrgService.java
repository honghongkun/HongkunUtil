package com.Hong.ssm.service;


import java.util.List;

import com.Hong.ssm.bean.BasOrg;
import com.Hong.ssm.utils.PageModel;

public interface BasOrgService {

	/**
     * 查询组织结构列表
     * @param basOrg
     * @return
     */
	PageModel<BasOrg> selBasOrglist(BasOrg basOrg,Integer pageNo,Integer pageSize);
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
    boolean delBasOrgByID(Integer orgId);
    /**
     * ID作为条件执行修改
     * @param basOrg
     * @return
     */
    boolean editBasOrgByID(BasOrg basOrg);
    /**
     * 查询编号
     * @param basOrg
     * @return
     */
    List<BasOrg> selOrgcode(BasOrg basOrg);
    /**
     * 查询编号1
     * @param basOrg
     * @return
     */
    List<BasOrg> selOrgcode1(BasOrg basOrg);
    /**
     * 查询编号2
     * @param basOrg
     * @return
     */
    List<BasOrg> selOrgcode2(BasOrg basOrg);
    /**
     * 修改状态
     * @param basOrg
     * @return
     */
    void BasOrgdeditStatus(BasOrg basOrg);
}
