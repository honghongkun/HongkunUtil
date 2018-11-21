package com.Hong.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Hong.ssm.bean.BasStu;
import com.Hong.ssm.bean.RegistrationStu;
import com.Hong.ssm.bean.StuDoy;
import com.Hong.ssm.service.BasStuService;
import com.Hong.ssm.service.RegistrationStuService;
import com.Hong.ssm.service.StuDoyService;
import com.Hong.ssm.utils.ConstantUtil;
import com.Hong.ssm.utils.PageModel;

@Controller
@RequestMapping("/admin/studoy")
public class RegistrationStuController {

	@Autowired
	private RegistrationStuService registrationStuServiceImpl;
	@Autowired
	private StuDoyService stuDoyServiceImpl;
	@Autowired
	private BasStuService basStuServiceImpl;
	
	@RequestMapping(value="/selRegistrationStulist",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selRegistrationStulist(RegistrationStu registrationStu,Integer pageNo, Integer pageSize){
		Map<String, Object> map=new HashMap<String, Object>();
		 PageModel<RegistrationStu> list = registrationStuServiceImpl.selRegistrationStulist(registrationStu, pageNo, pageSize);
		 map.put("succ", true);
		 map.put("msg", "获取数据成功");
		 map.put("data", list);
		 return map;
	}
	@RequestMapping(value="/selRegistrationStulistNV",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selRegistrationStulistNV(RegistrationStu registrationStu,Integer pageNo, Integer pageSize){
		Map<String, Object> map=new HashMap<String, Object>();
		 PageModel<RegistrationStu> list = registrationStuServiceImpl.selRegistrationStulistNV(registrationStu, pageNo, pageSize);
		 map.put("succ", true);
		 map.put("msg", "获取数据成功");
		 map.put("data", list);
		 return map;
	}
	/*男生宿舍楼*/
	@RequestMapping(value="/selDoyNamelist1",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selDoyNamelist1(StuDoy stuDoy){
		Map<String, Object> map=new HashMap<String, Object>();
		 List<StuDoy> list = stuDoyServiceImpl.selDoyNamelist1(stuDoy);
		 map.put("succ", true);
		 map.put("msg", "获取数据成功");
		 map.put("data", list);
		 return map;
	}
	/*男生*/
	@RequestMapping(value="/selStuSexstudent",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selStuSexstudent(BasStu basStu){
		Map<String, Object> map=new HashMap<String, Object>();
		 List<BasStu> list = basStuServiceImpl.selStuSexN(basStu);
		 map.put("succ", true);
		 map.put("msg", "获取数据成功");
		 map.put("data", list);
		 return map;
	}
	/*女生宿舍楼*/
	@RequestMapping(value="/selDoyNamelist2",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selDoyNamelist2(StuDoy stuDoy){
		Map<String, Object> map=new HashMap<String, Object>();
		 List<StuDoy> list = stuDoyServiceImpl.selDoyNamelist2(stuDoy);
		 map.put("succ", true);
		 map.put("msg", "获取数据成功");
		 map.put("data", list);
		 return map;
	}
	/*女生*/
	@RequestMapping(value="/selStuSexstudentV",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selStuSexstudent2(BasStu basStu){
		Map<String, Object> map=new HashMap<String, Object>();
		 List<BasStu> list = basStuServiceImpl.selStuSexV(basStu);
		 map.put("succ", true);
		 map.put("msg", "获取数据成功");
		 map.put("data", list);
		 return map;
	}
	@RequestMapping(value="/addRegistrationStu",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addRegistrationStu(RegistrationStu registrationStu){
		Map<String, Object> map=ConstantUtil.map;
		Integer reInt= registrationStuServiceImpl.addRegistrationStu(registrationStu);
		if (reInt>0) {
			map.put("succ", true);
			map.put("msg", "入住成功");
		}else {
			map.put("msg", "入住失败,请重试...");
		}
		return map;
	}
	@RequestMapping(value="/editRegistrationStuPid",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> editRegistrationStuPid(RegistrationStu registrationStu,Integer registrationId){
		Map<String, Object> map=ConstantUtil.map;
		RegistrationStu Registration=registrationStuServiceImpl.selRegistrationStuByID(registrationId);
		if (Registration!=null) {
			map.put("succ", true);
			map.put("msg", "退寝成功");
			registrationStuServiceImpl.editRegistrationStuPid(registrationStu);
		}else {
			map.put("msg", "退寝失败,请重试...");
		}
		return map;
	}
	@RequestMapping(value="/delRegistrationStu",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> delRegistrationStu(Integer registrationId){
		Map<String, Object> map=ConstantUtil.map;
		boolean succ= registrationStuServiceImpl.delRegistrationStu(registrationId);
		if (succ) {
			map.put("succ", true);
			map.put("msg", "删除成功");
		}else {
			map.put("msg", "删除失败,请重试...");
		}
		return map;
	}
	@RequestMapping(value="/selRegistrationStuByID",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selRegistrationStuByID(Integer registrationId){
		Map<String, Object> map=ConstantUtil.map;
		 RegistrationStu RegistrationStuByID = registrationStuServiceImpl.selRegistrationStuByID(registrationId);
		 map.put("succ", true);
		 map.put("msg", "获取数据成功");
		 map.put("data", RegistrationStuByID);
		 return map;
	}
	@RequestMapping(value="/editRegistrationStu",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> editRegistrationStu(RegistrationStu registrationStu){
		Map<String, Object> map=ConstantUtil.map;
		boolean succ= registrationStuServiceImpl.editRegistrationStu(registrationStu);
		if (succ) {
			map.put("succ", true);
			map.put("msg", "换寝成功");
		}else {
			map.put("msg", "换寝失败,请重试...");
		}
		return map;
	}
 }
