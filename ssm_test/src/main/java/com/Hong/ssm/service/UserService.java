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
 * �û���¼
 * @param sysUser
 * @return
 */
	SysUser login(SysUser sysUser);
	 /**
     * ���ݽ�ɫ���ز˵�
     * @param userRolepid
     * @return
     */
    List<SysMenu> selUserMenu(Integer userRolepid);
    /**
     * ���ݽ�ɫ����ѧ���˵�
     * @param userRolepid
     * @return
     */
    List<StuZy> selUserMenu22(Integer userRolepid);
    /**
     * ���ݽ�ɫ��������˵�
     * @param userRolepid
     * @return
     */
    List<StuMdoy> selUserMdoy(Integer userRolepid);
    /**
     * ��ȡ�û��б�
     * @param pageSize
     * @param pageNo
     * @return
     */
   PageModel<SysUser> getUserList(SysUser sysUser,Integer pageSize,Integer pageNo);
   /**
    * ����û�
    * @param sysUser
    * @return
    */
   Integer adduser(SysUser sysUser);
   /**
    * �޸��û�
    * @param sysUser
    * @return
    */
   boolean editUser(SysUser sysUser);
   /**
    * ��ȡ�û�ID
    * @param userId
    * @return
    */
   SysUser selUserID(Integer userId);
   
   boolean deleteUser(Integer userId);
   
   /**
    * ��ȡ��ɫ��Ϣ
    * @param pageSize
    * @param pageNo
    * @return
    */
  PageModel<SysUserExt> selUserRoleList(SysUser sysUser,Integer pageSize,Integer pageNo);
  
  /**
   * �޸��û�
   * @param sysUser
   * @return
   */
  boolean edituserStatus(SysUser sysUser);
  /**
   * �޸�״̬
   * @param sysUser
   * @return
   */
  void editRoleUser(SysUser sysUser);
}
