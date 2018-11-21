package com.Hong.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.Hong.ssm.bean.StuMdoy;
import com.Hong.ssm.bean.StuZy;
import com.Hong.ssm.bean.SysMenu;
import com.Hong.ssm.bean.SysUser;
import com.Hong.ssm.bean.SysUserExample;
import com.Hong.ssm.bean.SysUserExt;

public interface SysUserMapper {
	    int countByExample(SysUserExample example);

	    int deleteByExample(SysUserExample example);

	    int deleteByPrimaryKey(Integer userId);

	    int insert(SysUser sysUser);

	    int insertSelective(SysUser record);

	    List<SysUser> selectByExample(SysUserExample example);

	    SysUser selectByPrimaryKey(Integer userId);

	    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

	    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

	    int updateByPrimaryKeySelective(SysUser record);

	    int updateByPrimaryKey(SysUser record);

	    /**
	     * 用户登录 
	     * @param sysUser
	     * @return
	     */
      SysUser login(SysUser sysUser);
      /**
       * 根据角色加载菜单
       * @param userRolepid
       * @return
       */
      List<SysMenu> selUserMenu(Integer userRolepid);
      /**
       * 根据角色加载学籍菜单
       * @param userRolepid
       * @return
       */
      List<StuZy> selUserMenu22(Integer userRolepid);
      /**
       * 根据角色加载宿舍菜单
       * @param userRolepid
       * @return
       */
      List<StuMdoy> selUserMdoy(Integer userRolepid);
      /**
       * 获取用户列表
       * @param pageSize
       * @param pageNo
       * @return
       */
      List<SysUser> getUserList(SysUser sysUser);
      
      /**
       * 新增用户
       * @param sysUser
       * @return
       */
      Integer addUser(SysUser sysUser);
      /**
       * 修改用户
       * @param sysUser
       * @return
       */
      Integer editUser(SysUser sysUser);
      /**
       * 获取用户ID
       * @param userId
       * @return
       */
      SysUser selUserID(Integer userId);
      /**
       * 关联角色
       * @param sysUser
       * @return
       */
      List<SysUserExt> selUserRoleList(SysUser sysUser);
      /**
       * 修改状态
       * @param sysUser
       * @return
       */
      Integer editRoleUser(SysUser sysUser);
}