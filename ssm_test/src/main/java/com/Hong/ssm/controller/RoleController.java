package com.Hong.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Hong.ssm.bean.SysMenuExt;
import com.Hong.ssm.bean.SysRole;
import com.Hong.ssm.service.RoleService;
import com.Hong.ssm.utils.ConstantUtil;
import com.Hong.ssm.utils.PageModel;

@Controller
@RequestMapping(value="/admin/sys")
public class RoleController {
	
	@Autowired
	private RoleService roleServiceImpl;
	
	/**
	 * 查询角色列表
	 * @param sysRole
	 * @param pageSize
	 * @param pageNo
	 * @return
	 */
	@RequestMapping(value="/selRoleList",method=RequestMethod.POST)
	@ResponseBody
	 public Map<String, Object>  selUserList(SysRole sysRole,Integer pageSize,Integer pageNo){
		
		Map<String, Object> map=new HashMap<String, Object>();
		PageModel<SysRole> list=roleServiceImpl.selRoleList(sysRole, pageNo, pageSize);
		map.put("succ", true);
		map.put("msg", "获取数据成功");
		map.put("data",list);
		return map;
	 }
	/**
	 * 添加角色
	 * @param sysRole
	 * @return
	 */
	@RequestMapping(value="/addRole",method=RequestMethod.POST)
	@ResponseBody
	 public Map<String, Object> addRole(SysRole sysRole){
		Map<String, Object> map=ConstantUtil.map;
		Integer reInt= roleServiceImpl.addRole(sysRole);
		if (reInt>0) {
          map.put("succ", true);
          map.put("msg","新增角色成功");
		}else {
	      map.put("msg","新增角色失败，请重试...");
		}
		return map;
	}
	
	@RequestMapping(value="/selMenuForSet")
	@ResponseBody
	public Map<String, Object> selMenuForSet(Integer roleId){
	   Map<String, Object> map=ConstantUtil.map;
	   List<SysMenuExt> SelMenuOrRole= roleServiceImpl.selMenuForSetRole(roleId);
		map.put("succ", true);
		map.put("data", SelMenuOrRole);
		map.put("msg", "获取数据成功！");
		return map;
		
	}
	
	/**
	 * 设置角色权限
	 * @param roleId
	 * @param checkedKeys
	 * @return
	 */
	@RequestMapping(value="/delOrAddRole")
	@ResponseBody
	public Map<String, Object> delOrAddRole(Integer roleId,String checkedKeys){
	   Map<String, Object> map=ConstantUtil.map;
	   roleServiceImpl.setRoleMenuByRoleId(roleId, checkedKeys);
		map.put("succ", true);
		map.put("msg", "权限设置成功");
		return map;
	}
	/**
	 * 查询ID
	 * @param roleId
	 * @return
	 */
	@RequestMapping(value="/selRoleByID",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selRoleByID(Integer roleId){
		   Map<String, Object> map=ConstantUtil.map;
		    SysRole selRoleByID = roleServiceImpl.selRoleByID(roleId);
			map.put("succ", true);
			map.put("msg", "数据获取成功");
			map.put("data", selRoleByID);
		return map;
	}
	/**
	 * 通过ID修改数据
	 * @param sysRole
	 * @return
	 */
	@RequestMapping(value="/editRoleByID",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> editRoleByID(SysRole sysRole){
		 Map<String, Object> map=ConstantUtil.map;
		 boolean succ= roleServiceImpl.editRole(sysRole);
		 if (succ) {
			 map.put("succ", true);
			 map.put("msg", "修改数据成功");
		}else {
			map.put("msg", "修改数据失败，请重试");
		}
		return map;
	}
	/**
	 * ID作为条件删除
	 * @param sysRole
	 * @return
	 */
	@RequestMapping(value="/delRoleByID",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> delRoleByID(Integer roleId){
		 Map<String, Object> map=ConstantUtil.map;
		 boolean succ= roleServiceImpl.delRole(roleId);
		 if (succ) {
			 map.put("succ", true);
			 map.put("msg", "删除数据成功");
		}else {
			map.put("msg", "删除数据失败，请重试");
		}
		return map;
	}
	
	    @RequestMapping(value="/RoleEditStatus",method= {RequestMethod.POST,RequestMethod.GET})
		@ResponseBody
		 public Map<String, Object> RoleEditStatus(SysRole sysRole,Integer roleId){
			 Map<String, Object> map=new HashMap<String, Object>();
			 SysRole Role= roleServiceImpl.selRoleByID(roleId);
			 if (Role!=null) {
				    map.put("succ", true);
					map.put("msg", "状态改变成功");
					roleServiceImpl.editroleStatus(sysRole);
			}else {
				 map.put("succ", false);
				 map.put("msg", "状态改变失败");
			}
			 
			 return map;
		}
}
