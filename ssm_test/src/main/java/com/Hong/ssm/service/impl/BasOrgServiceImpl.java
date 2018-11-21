package com.Hong.ssm.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hong.ssm.bean.BasOrg;
import com.Hong.ssm.dao.BasOrgMapper;
import com.Hong.ssm.service.BasOrgService;
import com.Hong.ssm.utils.PageModel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BasOrgServiceImpl implements BasOrgService {
	
	@Autowired
	private BasOrgMapper basOrgMapper;

	
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	@Override
	public PageModel<BasOrg> selBasOrglist(BasOrg basOrg, Integer pageNo, Integer pageSize) {
          PageModel<BasOrg> model=new PageModel<BasOrg>(pageNo,pageSize);
          PageHelper.startPage(pageNo, pageSize);
          List<BasOrg> BasOrgList = basOrgMapper.selBasOrgList(basOrg);
          PageInfo<BasOrg>  pageInfo=new PageInfo<BasOrg>(BasOrgList);
          model.setTotalRecords((int)pageInfo.getTotal());
          model.setList(BasOrgList);
          
        return model;
	}

	@Override
	public Integer addBasOrg(BasOrg basOrg) {
		if (basOrg.getOrgStatus()==null) {
			basOrg.setOrgStatus(0);
			basOrg.setDelflag(0);
		}if(basOrg.getCudate()==null) {
			basOrg.setCudate(df.format(new Date()));
		}
		return basOrgMapper.addBasOrg(basOrg);
	}

	@Override
	public BasOrg selBasOrgByID(Integer orgId) {
		return basOrgMapper.selBasOrgByID(orgId);
	}

	@Override
	public boolean delBasOrgByID(Integer orgId) {
		basOrgMapper.deleteByID(orgId);
		return true;
	}

	@Override
	public boolean editBasOrgByID(BasOrg basOrg) {
		return basOrgMapper.editBasOrgByID(basOrg)>0?true:false;
	}

	@Override
	public List<BasOrg> selOrgcode(BasOrg basOrg) {
		return basOrgMapper.selOrgcode(basOrg);
	}

	@Override
	public List<BasOrg> selOrgcode1(BasOrg basOrg) {
		return basOrgMapper.selOrgcode1(basOrg);
	}

	@Override
	public List<BasOrg> selOrgcode2(BasOrg basOrg) {
		return basOrgMapper.selOrgcode2(basOrg);
	}

	@Override
	public void BasOrgdeditStatus(BasOrg basOrg) {
		 if (basOrg.getOrgStatus()==0) {
			 basOrg.setOrgStatus(1); 
		  }else if(basOrg.getOrgStatus()==1){
			  basOrg.setOrgStatus(0); 
		  }
		basOrgMapper.BasOrdeditStatus(basOrg);
	}

}
