package com.Hong.ssm.service;

import java.util.List;

import com.Hong.ssm.bean.SysRole;
import com.Hong.ssm.utils.PageModel;
import com.Hong.ssm.bean.SysMenuExt;

public interface RoleService {


	/**
	 * 分页获取  角色列表
	 * @param sysRole
	 * @param pageNO
	 * @param pageSize
	 * @return
	 */
	PageModel<SysRole> selRoleList(SysRole sysRole,Integer pageNo,Integer pageSize);
	   /**
	    * 添加角色
	    * @param SysRole
	    * @return
	    */
   Integer addRole(SysRole sysRole);
   /**
 	* 获取角色相关的 权限列表  用于设置角色权限
	* @param roleId
	* @return
	*/
	List<SysMenuExt> selMenuForSetRole(Integer roleId);
	
	/**
	 * 设置角色权限
	 * @param roleId
	 * @param menuIds
	 * @return
	 */
	 int  setRoleMenuByRoleId(Integer roleId,String  menuIds);
	 /**
	  * 根据角色ID 获取 对应的权限菜单ID
	  * @param roleId
	  * @return
	  */
	 List<Integer>  selMenuIdsByRoleID(Integer roleId);
	 
	    /**
	     * 修改角色
	     * @param sysUser
	     * @return
	     */
	   boolean editRole(SysRole sysRole);
	    /**
	     * 查询ID
	     * @param roleId
	     * @return
	     */
	    SysRole selRoleByID(Integer roleId);
	    /**
	     * ID作为条件删除角色
	     * @param sysUser
	     * @return
	     */
	    boolean delRole(Integer roleId);
	    /**
	      * 修改状态
	      * @param sysRole
	      * @return
	      */
	    void editroleStatus(SysRole sysRole);
}
