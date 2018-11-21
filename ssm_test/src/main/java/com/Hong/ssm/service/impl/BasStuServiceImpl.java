package com.Hong.ssm.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hong.ssm.bean.BasStu;
import com.Hong.ssm.bean.BasStuExt;
import com.Hong.ssm.dao.BasStuMapper;
import com.Hong.ssm.service.BasStuService;
import com.Hong.ssm.utils.PageModel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BasStuServiceImpl implements BasStuService {
	
	@Autowired
	private BasStuMapper basStuMapper;

	
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	@Override
	public PageModel<BasStu> selBasStulist(BasStu basStu, Integer pageNo, Integer pageSize) {

		PageModel<BasStu> model=new PageModel<BasStu>(pageNo,pageSize);
		PageHelper.startPage(pageNo,pageSize);
		List<BasStu> BasStulist = basStuMapper.selBasStulist(basStu);
		PageInfo<BasStu> paInfo=new PageInfo<BasStu>(BasStulist);
		model.setTotalRecords((int) paInfo.getTotal());
		model.setList(BasStulist);
		return model;
	}


	@Override
	public PageModel<BasStuExt> selBasStuOrBasOrglist(BasStu basStu, Integer pageNo, Integer pageSize) {
		PageModel<BasStuExt> model=new PageModel<BasStuExt>(pageNo,pageSize);
		PageHelper.startPage(pageNo,pageSize);
		List<BasStuExt> BasStulist = basStuMapper.selBasStuOrBasOrglist(basStu);
		PageInfo<BasStuExt> paInfo=new PageInfo<BasStuExt>(BasStulist);
		model.setTotalRecords((int) paInfo.getTotal());
		model.setList(BasStulist);
		return model;
	}


	@Override
	public List<BasStuExt> selBasStuselect(BasStu basStu) {
		return basStuMapper.selBasStuselect(basStu);
	}


	@Override
	public Integer addBasStu(BasStu basStu) {
		if (basStu.getStuStatus()==null) {
			basStu.setStuStatus(0);
			basStu.setStuType(2);
		}if (basStu.getTudate()==null) {
			basStu.setTudate(df.format(new Date()));
		}
		return basStuMapper.addBasStu(basStu);
	}


	@Override
	public boolean delBasStu(Integer stuId) {
		basStuMapper.delBasStu(stuId);
		return true;
	}


	@Override
	public PageModel<BasStuExt> selOrgcodelist(BasStu basStu, Integer pageNo, Integer pageSize) {
		PageModel<BasStuExt> model=new PageModel<BasStuExt>(pageNo,pageSize);
		PageHelper.startPage(pageNo,pageSize);
		List<BasStuExt> BasStulist = basStuMapper.selOrgcodelist(basStu);
		PageInfo<BasStuExt> paInfo=new PageInfo<BasStuExt>(BasStulist);
		model.setTotalRecords((int) paInfo.getTotal());
		model.setList(BasStulist);
		return model;
	}


	@Override
	public BasStu selBasStuID(Integer stuId) {
		return basStuMapper.selBasStuID(stuId);
	}


	@Override
	public boolean editBasStu(BasStu basStu) {
		if (basStu.getXudate()==null) {
			basStu.setXudate(df.format(new Date()));
		}
		return basStuMapper.editBasStu(basStu)>0?true:false;
	}


	@Override
	public PageModel<BasStuExt> selOrgcodelist2(BasStu basStu, Integer pageNo, Integer pageSize) {
		PageModel<BasStuExt> model=new PageModel<BasStuExt>(pageNo,pageSize);
		PageHelper.startPage(pageNo,pageSize);
		List<BasStuExt> BasStulist = basStuMapper.selOrgcodelist2(basStu);
		PageInfo<BasStuExt> paInfo=new PageInfo<BasStuExt>(BasStulist);
		model.setTotalRecords((int) paInfo.getTotal());
		model.setList(BasStulist);
		return model;
	}


	@Override
	public List<BasStu> selStuSexN(BasStu basStu) {
		return basStuMapper.selStuSexN(basStu);
	}


	@Override
	public List<BasStu> selStuSexV(BasStu basStu) {
		return basStuMapper.selStuSexV(basStu);
	}

	

}
