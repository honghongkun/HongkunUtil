package com.Hong.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hong.ssm.bean.StuMdoy;
import com.Hong.ssm.bean.StuZy;
import com.Hong.ssm.bean.SysMenu;
import com.Hong.ssm.bean.SysUser;
import com.Hong.ssm.bean.SysUserExt;
import com.Hong.ssm.dao.SysUserMapper;
import com.Hong.ssm.exception.SysException;
import com.Hong.ssm.service.UserService;
import com.Hong.ssm.utils.MD5;
import com.Hong.ssm.utils.PageModel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private SysUserMapper sysUserMapper;
		
	public SysUser login(SysUser sysUser) {
		return sysUserMapper.login(sysUser);
	}

	/**
	 * 调用之前写好的异常，如果userRolepid为空则执行异常SysException
	 */
	@Override
	public List<SysMenu> selUserMenu(Integer userRolepid) {
		if (userRolepid==null) {
			throw new SysException("标识不能为空");
		}
		return sysUserMapper.selUserMenu(userRolepid);
	}

	public PageModel<SysUser> getUserList(SysUser sysUser,Integer pageSize, Integer pageNo) {
		PageModel<SysUser> model=new PageModel<SysUser>(pageNo, pageSize);
		PageHelper.startPage(pageNo, pageSize);
		List<SysUser> userlist=sysUserMapper.getUserList(sysUser);
		PageInfo<SysUser> pageInfo=new PageInfo<SysUser>(userlist);
		model.setTotalRecords((int) pageInfo.getTotal());
		model.setList(userlist);
		return model;
	}

	@Override
	public Integer adduser(SysUser sysUser) {
		if (sysUser.getUserStatus()==null) {
			sysUser.setUserStatus(0);
		}
		sysUser.setUserPwd(MD5.getMD5Encode("小花很漂亮"+sysUser.getUserPwd()));
		return sysUserMapper.addUser(sysUser);
	}

	@Override
	public boolean editUser(SysUser sysUser) {
		
		sysUser.setUserPwd(MD5.getMD5Encode("小花很漂亮"+sysUser.getUserPwd()));
		return sysUserMapper.editUser(sysUser)>0?true:false;
	}

	@Override
	public SysUser selUserID(Integer userId) {
		return sysUserMapper.selUserID(userId);
	}

	@Override
	public boolean deleteUser(Integer userId) {
		sysUserMapper.deleteByPrimaryKey(userId);
		return true;
		
	}
/**
 * 关联角色
 */
	@Override
	public PageModel<SysUserExt> selUserRoleList(SysUser sysUser, Integer pageSize, Integer pageNo) {
		PageModel<SysUserExt> model=new PageModel<SysUserExt>(pageNo, pageSize);
		PageHelper.startPage(pageNo, pageSize);
		List<SysUserExt> userlist=sysUserMapper.selUserRoleList(sysUser);
		PageInfo<SysUserExt> pageInfo=new PageInfo<SysUserExt>(userlist);
		model.setTotalRecords((int) pageInfo.getTotal());
		model.setList(userlist);
		return model;
	}
/**
 * 修改用户
 */
	@Override
	public boolean edituserStatus(SysUser sysUser) {
	return sysUserMapper.editUser(sysUser)>0?true:false;
	}

	/**
	 * 修改角色状态
	 */
   @Override
    public void editRoleUser(SysUser sysUser) {
	  if (sysUser.getUserStatus()==0) {
	      sysUser.setUserStatus(1); 
	  }else if(sysUser.getUserStatus()==1){
		  sysUser.setUserStatus(0); 
	  }
	  sysUserMapper.editRoleUser(sysUser);
}

	@Override
	public List<StuZy> selUserMenu22(Integer userRolepid) {
		if (userRolepid==null) {
			throw new SysException("标识不能为空");
		}
		return sysUserMapper.selUserMenu22(userRolepid);
	}

	@Override
	public List<StuMdoy> selUserMdoy(Integer userRolepid) {
		if (userRolepid==null) {
			throw new SysException("标识不能为空");
		}
		return sysUserMapper.selUserMdoy(userRolepid);
	}

}
