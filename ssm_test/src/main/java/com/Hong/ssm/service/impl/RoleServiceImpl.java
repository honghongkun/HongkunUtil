package com.Hong.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hong.ssm.bean.SysMenuExt;
import com.Hong.ssm.bean.SysRole;
import com.Hong.ssm.dao.SysRoleMapper;
import com.Hong.ssm.exception.SysException;
import com.Hong.ssm.service.RoleService;
import com.Hong.ssm.utils.PageModel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private SysRoleMapper sysRoleMapper;
	/**
	 * 没有使用 分页插件提供 pageInfo   pageInfo里面封装了 分页插件生成的所有分页相关的信息
	 * PageInfo<SysRole> pageInfo = new PageInfo<SysRole>(userlist);
	 */
	public PageModel<SysRole> selRoleList(SysRole sysRole, Integer pageNo, Integer pageSize) {
		PageModel<SysRole> model=new PageModel<SysRole>(pageNo, pageSize);
		PageHelper.startPage(pageNo, pageSize);
		List<SysRole> userlist=sysRoleMapper.selRoleList(sysRole);
		PageInfo<SysRole> pageInfo=new PageInfo<SysRole>(userlist);
		model.setTotalRecords((int) pageInfo.getTotal());
		model.setList(userlist);
		return model;
	}

	@Override
	public Integer addRole(SysRole sysRole) {
		if (sysRole.getRoleStatus()==null) {
			sysRole.setRoleStatus(0);
		}
		return sysRoleMapper.addRole(sysRole);
	}

	@Override
	public List<SysMenuExt> selMenuForSetRole(Integer roleId) {
		return sysRoleMapper.selMenuForSetRole(roleId);
	}

	@Override
	public int setRoleMenuByRoleId(Integer roleId, String menuIds) {
		if (menuIds==null) {
			throw new SysException("权限信息不能为null");
		}
		sysRoleMapper.delRoleMenuByRoleId(roleId);
		/*split()方法用于把一个字符串分割成字符串数组*/
		String[] split = menuIds.split(",");
		return sysRoleMapper.addRoleMenuByRoleId(roleId, split);
	}

	@Override
	public List<Integer> selMenuIdsByRoleID(Integer roleId) {
		return sysRoleMapper.selMenuIdsByRoleID(roleId);
	}

	@Override
	public boolean editRole(SysRole sysRole) {
		return sysRoleMapper.editRole(sysRole)>0?true:false;
	}

	@Override
	public SysRole selRoleByID(Integer roleId) {
		return sysRoleMapper.selRoleByID(roleId);
	}

	@Override
	public boolean delRole(Integer roleId) {
		sysRoleMapper.delRole(roleId);
		return true;
	}

	@Override
	public void editroleStatus(SysRole sysRole) {
		if(sysRole.getRoleStatus()==0) {
			sysRole.setRoleStatus(1);
		}else if(sysRole.getRoleStatus()==1) {
			sysRole.setRoleStatus(0);
		}
		sysRoleMapper.editroleStatus(sysRole);
	}

	
}
