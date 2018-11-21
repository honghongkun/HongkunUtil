package com.Hong.ssm.service;

import java.util.List;

import com.Hong.ssm.bean.StuMdoy;
import com.Hong.ssm.bean.StuZy;
import com.Hong.ssm.bean.SysMenu;
import com.Hong.ssm.bean.SysUser;
import com.Hong.ssm.bean.SysUserExt;
import com.Hong.ssm.utils.PageModel;

public interface UserService {

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
   PageModel<SysUser> getUserList(SysUser sysUser,Integer pageSize,Integer pageNo);
   /**
    * 添加用户
    * @param sysUser
    * @return
    */
   Integer adduser(SysUser sysUser);
   /**
    * 修改用户
    * @param sysUser
    * @return
    */
   boolean editUser(SysUser sysUser);
   /**
    * 获取用户ID
    * @param userId
    * @return
    */
   SysUser selUserID(Integer userId);
   
   boolean deleteUser(Integer userId);
   
   /**
    * 获取角色信息
    * @param pageSize
    * @param pageNo
    * @return
    */
  PageModel<SysUserExt> selUserRoleList(SysUser sysUser,Integer pageSize,Integer pageNo);
  
  /**
   * 修改用户
   * @param sysUser
   * @return
   */
  boolean edituserStatus(SysUser sysUser);
  /**
   * 修改状态
   * @param sysUser
   * @return
   */
  void editRoleUser(SysUser sysUser);
}
