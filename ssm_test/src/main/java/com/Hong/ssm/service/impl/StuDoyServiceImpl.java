package com.Hong.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hong.ssm.bean.StuDoy;
import com.Hong.ssm.dao.StuDoyMapper;
import com.Hong.ssm.service.StuDoyService;
import com.Hong.ssm.utils.PageModel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class StuDoyServiceImpl implements StuDoyService {

	@Autowired
	private StuDoyMapper stuDoyMapper;

	@Override
	public PageModel<StuDoy> selStuDoylist(StuDoy stuDoy, Integer pageSize, Integer pageNo) {
		PageModel<StuDoy> model=new PageModel<StuDoy>(pageNo, pageSize);
		PageHelper.startPage(pageNo, pageSize);
		List<StuDoy> list=stuDoyMapper.selStuDoylist(stuDoy);
		PageInfo<StuDoy> info=new PageInfo<StuDoy>(list);
		model.setTotalRecords((int) info.getTotal());
		model.setList(list);
		return model;
	}

	@Override
	public Integer addStuDoy(StuDoy stuDoy) {
		return stuDoyMapper.addStuDoy(stuDoy);
	}

	@Override
	public boolean delStuDoy(Integer doyId) {
		stuDoyMapper.delStuDoy(doyId);
		return true;
	}

	@Override
	public boolean editStuDoy(StuDoy stuDoy) {
		return stuDoyMapper.editStuDoy(stuDoy)>0?true:false;
	}

	@Override
	public StuDoy selStuDoyByID(Integer doyId) {
		return stuDoyMapper.selStuDoyByID(doyId);
	}

	@Override
	public List<StuDoy> selDoyNamelist1(StuDoy stuDoy) {
		return stuDoyMapper.selDoyNamelist1(stuDoy);
	}

	@Override
	public List<StuDoy> selDoyNamelist2(StuDoy stuDoy) {
		return stuDoyMapper.selDoyNamelist2(stuDoy);
	}

	

	

}
