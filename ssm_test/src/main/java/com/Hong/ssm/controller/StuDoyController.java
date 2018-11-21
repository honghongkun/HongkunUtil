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
    	map.put("msg", "�˵���ȡʧ��!");
    	try {
    		List<StuMdoy> menulist= userServiceImpl.selUserMdoy(sysUser.getUserRolepid());
    		map.put("succ", true);
    		map.put("msg", "��ȡ�˵��ɹ�");
    		map.put("data", menulist);
		} catch (Exception e) {

/*GetMessage �����������Ǵӵ�ǰ�̵߳���Ϣ�������ȡһ����Ϣ������ MSG �ṹ �С�*/
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
		 map.put("msg", "��ȡ���ݳɹ�");
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
			map.put("msg", "��ӳɹ�");
		}else {
			map.put("msg", "���ʧ��,������...");
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
			map.put("msg", "ɾ���ɹ�");
		}else {
			map.put("msg", "ɾ��ʧ��,������...");
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
			map.put("msg", "�޸ĳɹ�");
		}else {
			map.put("msg", "�޸�ʧ��,������...");
		}
		return map;
	}
	@RequestMapping(value="/selStuDoyByID",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selStuDoyByID(Integer doyId){
		Map<String, Object> map=ConstantUtil.map;
		StuDoy stuDoy=stuDoyServiceImpl.selStuDoyByID(doyId);
			map.put("succ", true);
			map.put("msg", "��ȡ���ݳɹ�");
			map.put("data", stuDoy);
		return map;
	}
 }
