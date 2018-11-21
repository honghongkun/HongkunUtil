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
      List<SysUser> getUserList(SysUser sysUser);
      
      /**
       * �����û�
       * @param sysUser
       * @return
       */
      Integer addUser(SysUser sysUser);
      /**
       * �޸��û�
       * @param sysUser
       * @return
       */
      Integer editUser(SysUser sysUser);
      /**
       * ��ȡ�û�ID
       * @param userId
       * @return
       */
      SysUser selUserID(Integer userId);
      /**
       * ������ɫ
       * @param sysUser
       * @return
       */
      List<SysUserExt> selUserRoleList(SysUser sysUser);
      /**
       * �޸�״̬
       * @param sysUser
       * @return
       */
      Integer editRoleUser(SysUser sysUser);
}