package com.Hong.ssm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.Hong.ssm.service.BasGradeService;
import com.Hong.ssm.utils.ConstantUtil;

@Controller
@RequestMapping(value="/admin/student")
public class BasGradeController {

	@Autowired
	private BasGradeService basGradeServiceImpl;
	
}
