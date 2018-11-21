package com.Hong.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Hong.ssm.bean.StuDoy;
import com.Hong.ssm.bean.StuMdoy;
import com.Hong.ssm.bean.StuZy;
import com.Hong.ssm.bean.SysUser;
import com.Hong.ssm.service.StuDoyService;
import com.Hong.ssm.service.UserService;
import com.Hong.ssm.utils.ConstantUtil;
import com.Hong.ssm.utils.PageModel;

@Controller
@RequestMapping("/admin/studoy")
public class StuDoyController {

	@Autowired
	private StuDoyService stuDoyServiceImpl;
	@Autowired
	private UserService userServiceImpl;
	
	
	@RequestMapping(value="/selUserMdoy",method=RequestMethod.POST)
	@ResponseBody
    public Map<String, Object>  selUserMdoy(HttpSession session){
		SysUser sysUser=(SysUser) session.getAttribute(ConstantUtil.SESSION_KEY);
    	Map<String, Object> map=new HashMap<String, Object>();
    	map.put("succ", false);
    	map.put("msg", "菜单获取失败!");
    	try {
    		List<StuMdoy> menulist= userServiceImpl.selUserMdoy(sysUser.getUserRolepid());
    		map.put("succ", true);
    		map.put("msg", "获取菜单成功");
    		map.put("data", menulist);
		} catch (Exception e) {

/*GetMessage 函数的作用是从当前线程的消息队列里获取一个消息并填入 MSG 结构 中。*/
			map.put("msg", e.getMessage());
		}
		return map;
    }
	
	@RequestMapping(value="/selStuDoylist",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selStuDoylist(StuDoy stuDoy,Integer pageNo, Integer pageSize){
		Map<String, Object> map=new HashMap<String, Object>();
		 PageModel<StuDoy> list = stuDoyServiceImpl.selStuDoylist(stuDoy, pageSize, pageNo);
		 map.put("succ", true);
		 map.put("msg", "获取数据成功");
		 map.put("data", list);
		 return map;
		
	}
	@RequestMapping(value="/addStuDoy",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addStuDoy(StuDoy stuDoy){
		Map<String, Object> map=ConstantUtil.map;
		Integer reInt=stuDoyServiceImpl.addStuDoy(stuDoy);
		if (reInt>0) {
			map.put("succ", true);
			map.put("msg", "添加成功");
		}else {
			map.put("msg", "添加失败,请重试...");
		}
		return map;
	}
	@RequestMapping(value="/delStuDoy",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> delStuDoy(Integer doyId){
		Map<String, Object> map=ConstantUtil.map;
		boolean succ=stuDoyServiceImpl.delStuDoy(doyId);
		if (succ) {
			map.put("succ", true);
			map.put("msg", "删除成功");
		}else {
			map.put("msg", "删除失败,请重试...");
		}
		return map;
	}
	@RequestMapping(value="/editStuDoy",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> editStuDoy(StuDoy stuDoy){
		Map<String, Object> map=ConstantUtil.map;
		boolean succ=stuDoyServiceImpl.editStuDoy(stuDoy);
		if (succ) {
			map.put("succ", true);
			map.put("msg", "修改成功");
		}else {
			map.put("msg", "修改失败,请重试...");
		}
		return map;
	}
	@RequestMapping(value="/selStuDoyByID",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selStuDoyByID(Integer doyId){
		Map<String, Object> map=ConstantUtil.map;
		StuDoy stuDoy=stuDoyServiceImpl.selStuDoyByID(doyId);
			map.put("succ", true);
			map.put("msg", "获取数据成功");
			map.put("data", stuDoy);
		return map;
	}
 }
