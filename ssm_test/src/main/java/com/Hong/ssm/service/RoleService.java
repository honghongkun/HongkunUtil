package com.Hong.ssm.service;

import java.util.List;

import com.Hong.ssm.bean.SysRole;
import com.Hong.ssm.utils.PageModel;
import com.Hong.ssm.bean.SysMenuExt;

public interface RoleService {


	/**
	 * ��ҳ��ȡ  ��ɫ�б�
	 * @param sysRole
	 * @param pageNO
	 * @param pageSize
	 * @return
	 */
	PageModel<SysRole> selRoleList(SysRole sysRole,Integer pageNo,Integer pageSize);
	   /**
	    * ��ӽ�ɫ
	    * @param SysRole
	    * @return
	    */
   Integer addRole(SysRole sysRole);
   /**
 	* ��ȡ��ɫ��ص� Ȩ���б�  �������ý�ɫȨ��
	* @param roleId
	* @return
	*/
	List<SysMenuExt> selMenuForSetRole(Integer roleId);
	
	/**
	 * ���ý�ɫȨ��
	 * @param roleId
	 * @param menuIds
	 * @return
	 */
	 int  setRoleMenuByRoleId(Integer roleId,String  menuIds);
	 /**
	  * ���ݽ�ɫID ��ȡ ��Ӧ��Ȩ�޲˵�ID
	  * @param roleId
	  * @return
	  */
	 List<Integer>  selMenuIdsByRoleID(Integer roleId);
	 
	    /**
	     * �޸Ľ�ɫ
	     * @param sysUser
	     * @return
	     */
	   boolean editRole(SysRole sysRole);
	    /**
	     * ��ѯID
	     * @param roleId
	     * @return
	     */
	    SysRole selRoleByID(Integer roleId);
	    /**
	     * ID��Ϊ����ɾ����ɫ
	     * @param sysUser
	     * @return
	     */
	    boolean delRole(Integer roleId);
	    /**
	      * �޸�״̬
	      * @param sysRole
	      * @return
	      */
	    void editroleStatus(SysRole sysRole);
}
