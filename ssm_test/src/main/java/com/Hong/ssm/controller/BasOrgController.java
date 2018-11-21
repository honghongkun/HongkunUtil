package com.Hong.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Hong.ssm.bean.BasOrg;
import com.Hong.ssm.service.BasOrgService;
import com.Hong.ssm.utils.ConstantUtil;
import com.Hong.ssm.utils.PageModel;

@Controller
@RequestMapping(value="/admin/basorg")
public class BasOrgController {

	@Autowired
	private BasOrgService basOrgServiceImpl;
	
	@RequestMapping(value="/selBasOrglist",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selBasOrglist(BasOrg basOrg,Integer pageNo,Integer pageSize){
		Map<String, Object> map=new HashMap<String, Object>();
		PageModel<BasOrg> list = basOrgServiceImpl.selBasOrglist(basOrg, pageNo, pageSize);
		map.put("succ", true);
		map.put("msg", "获取数据成功");
		map.put("data", list);
		 return map;
		
	}
	@RequestMapping(value="/addBasOrg",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> addBasOrg(BasOrg basOrg){
		Map<String, Object> map=ConstantUtil.map;
		Integer reInt= basOrgServiceImpl.addBasOrg(basOrg);
		if (reInt>0) {
			map.put("succ", true);
			map.put("msg", "添加成功");
		}else {
			map.put("msg", "添加失败，请重试...");
		}
		return map;
		
	}
	@RequestMapping(value="/delBasOrgID",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> delBasOrgID(Integer orgId){
		Map<String, Object> map=ConstantUtil.map;
		boolean succ= basOrgServiceImpl.delBasOrgByID(orgId);
		if (succ) {
			map.put("succ", true);
			map.put("msg", "删除成功");
		}else {
			map.put("msg", "删除失败，请重试...");
		}
		return map;
		
	}
	@RequestMapping(value="/selBasOrgByID",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> selBasOrgByID (Integer orgId){
		Map<String, Object> map=new HashMap<String, Object>();
		BasOrg basOrg= basOrgServiceImpl.selBasOrgByID(orgId);
		map.put("succ", true);
		map.put("msg", "获取数据成功");
		map.put("data", basOrg);
		return map;
	}
	@RequestMapping(value="/editBasOrgByID",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> editBasOrgByID(BasOrg basOrg){
		Map<String, Object> map=ConstantUtil.map;
		boolean succ=basOrgServiceImpl.editBasOrgByID(basOrg);
		if (succ) {
			map.put("succ", true);
			map.put("msg", "修改成功");
		}else {
			map.put("msg", "修改失败，请重试...");
		}
		return map;	
	}
	@RequestMapping(value="/BasOrdeditStatus",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> BasOrdeditStatus (Integer orgId,BasOrg basOrg){
		Map<String, Object> map=new HashMap<String, Object>();
		BasOrg basOr= basOrgServiceImpl.selBasOrgByID(orgId);
		if (basOr!=null) {
			map.put("succ", true);
			map.put("msg", "状态修改成功");
			basOrgServiceImpl.BasOrgdeditStatus(basOrg);
		}else {
			map.put("succ", false);
			map.put("msg", "状态修改失败，请重试...");
		}
		return map;
	}
}
