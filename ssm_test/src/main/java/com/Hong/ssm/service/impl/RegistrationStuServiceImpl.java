package com.Hong.ssm.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hong.ssm.bean.RegistrationStu;
import com.Hong.ssm.dao.RegistrationStuMapper;
import com.Hong.ssm.service.RegistrationStuService;
import com.Hong.ssm.utils.PageModel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class RegistrationStuServiceImpl implements RegistrationStuService{

	@Autowired
	private RegistrationStuMapper registrationStuMapper;
	
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

	/*@Override*/
	public PageModel<RegistrationStu> selRegistrationStulist(RegistrationStu registrationStu, Integer pageNo,
			Integer pageSize) {
		PageModel<RegistrationStu> model=new PageModel<RegistrationStu>(pageNo, pageSize);
		PageHelper.startPage(pageNo, pageSize);
		List<RegistrationStu> list=registrationStuMapper.selRegistrationStulist(registrationStu);
		PageInfo<RegistrationStu> info=new PageInfo<RegistrationStu>(list);
		model.setTotalRecords((int) info.getTotal());
		model.setList(list);
		return model;
	}


	public Integer addRegistrationStu(RegistrationStu registrationStu) {
		if (registrationStu.getRegistrationDate()==null) {
			registrationStu.setRegistrationDate(df.format(new Date()));
		}if (registrationStu.getRegistrationPid()==null) {
			registrationStu.setRegistrationPid(0);
		}
		return registrationStuMapper.addRegistrationStu(registrationStu);
	}


	public void editRegistrationStuPid(RegistrationStu registrationStu) {
		if (registrationStu.getRegistrationPid()==0) {
			registrationStu.setRegistrationPid(1);
		}
		registrationStuMapper.editRegistrationStuPid(registrationStu);
	}


	public RegistrationStu selRegistrationStuByID(Integer registrationId) {
		return registrationStuMapper.selRegistrationStuByID(registrationId);
	}


	public boolean delRegistrationStu(Integer registrationId) {
		registrationStuMapper.delRegistrationStu(registrationId);
		return true;
	}


	public PageModel<RegistrationStu> selRegistrationStulistNV(RegistrationStu registrationStu, Integer pageNo,
			Integer pageSize) {
		PageModel<RegistrationStu> model=new PageModel<RegistrationStu>(pageNo, pageSize);
		PageHelper.startPage(pageNo, pageSize);
		List<RegistrationStu> list=registrationStuMapper.selRegistrationStulistNV(registrationStu);
		PageInfo<RegistrationStu> info=new PageInfo<RegistrationStu>(list);
		model.setTotalRecords((int) info.getTotal());
		model.setList(list);
		return model;
	}


	public boolean editRegistrationStu(RegistrationStu registrationStu) {
		return registrationStuMapper.editRegistrationStu(registrationStu)>0?true:false;
	}

}
