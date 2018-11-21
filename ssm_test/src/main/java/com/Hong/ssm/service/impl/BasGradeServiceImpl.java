package com.Hong.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hong.ssm.bean.BasGrade;
import com.Hong.ssm.dao.BasGradeMapper;
import com.Hong.ssm.service.BasGradeService;

@Service
public class BasGradeServiceImpl implements BasGradeService {
	
	@Autowired
	private BasGradeMapper basGradeMapper;

	@Override
	public List<BasGrade> selbasStuGradeBy1(BasGrade basGrade) {
		return basGradeMapper.selbasStuGradeBy1(basGrade);
	}

	@Override
	public List<BasGrade> selbasStuGrade(BasGrade basGrade) {
		return basGradeMapper.selbasStuGrade(basGrade);
	}

	@Override
	public List<BasGrade> selbasStuGradeBy2(BasGrade basGrade) {
		return basGradeMapper.selbasStuGradeBy2(basGrade);
	}

}
