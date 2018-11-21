package com.Hong.ssm.dao;

import com.Hong.ssm.bean.SysMenuExt;
import com.Hong.ssm.bean.SysRole;
import com.Hong.ssm.bean.SysRoleExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper {
    int countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
    /**
     * ��ѯ��ɫ�б�
     * @param sysRole
     * @return
     */
    List<SysRole> selRoleList(SysRole sysRole);
    /**
     * ������ɫ
     * @param sysUser
     * @return
     */
    Integer addRole(SysRole sysRole);
    /**
     * �޸Ľ�ɫ
     * @param sysUser
     * @return
     */
    Integer editRole(SysRole sysRole);
    /**
     * ID��Ϊ����ɾ����ɫ
     * @param sysUser
     * @return
     */
    Integer delRole(Integer roleId);
    /**
     * ��ѯID
     * @param roleId
     * @return
     */
    SysRole selRoleByID(Integer roleId);
    /**
	* ��ȡ��ɫ��ص� Ȩ���б�  �������ý�ɫȨ��
    * @param roleId
    * @return
    */
    List<SysMenuExt> selMenuForSetRole(Integer roleId);

    /**
     * ���ݽ�ɫIDɾ�� �������е� Ȩ����Ϣ
     * @param roleId
     * @return
     */
     int delRoleMenuByRoleId(Integer roleId);
     /**
      * ������Ȩ��Ϣ
      * @param roleId
      * @param menuIds
      * @return
      */
     int  addRoleMenuByRoleId(@Param("roleId") Integer roleId,@Param("menuIds") String [] menuIds);
     /**
      * ����roleID ��ȡ  ��Ӧ�� �˵�ID�б�
      * @param roleId
      * @return
      */
     List<Integer> selMenuIdsByRoleID(Integer roleId);
     /**
      * �޸�״̬
      * @param sysRole
      * @return
      */
     Integer editroleStatus(SysRole sysRole);
}