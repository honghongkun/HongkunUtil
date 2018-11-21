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
     * 查询角色列表
     * @param sysRole
     * @return
     */
    List<SysRole> selRoleList(SysRole sysRole);
    /**
     * 新增角色
     * @param sysUser
     * @return
     */
    Integer addRole(SysRole sysRole);
    /**
     * 修改角色
     * @param sysUser
     * @return
     */
    Integer editRole(SysRole sysRole);
    /**
     * ID作为条件删除角色
     * @param sysUser
     * @return
     */
    Integer delRole(Integer roleId);
    /**
     * 查询ID
     * @param roleId
     * @return
     */
    SysRole selRoleByID(Integer roleId);
    /**
	* 获取角色相关的 权限列表  用于设置角色权限
    * @param roleId
    * @return
    */
    List<SysMenuExt> selMenuForSetRole(Integer roleId);

    /**
     * 根据角色ID删除 关联表中的 权限信息
     * @param roleId
     * @return
     */
     int delRoleMenuByRoleId(Integer roleId);
     /**
      * 保存授权信息
      * @param roleId
      * @param menuIds
      * @return
      */
     int  addRoleMenuByRoleId(@Param("roleId") Integer roleId,@Param("menuIds") String [] menuIds);
     /**
      * 根据roleID 获取  对应的 菜单ID列表
      * @param roleId
      * @return
      */
     List<Integer> selMenuIdsByRoleID(Integer roleId);
     /**
      * 修改状态
      * @param sysRole
      * @return
      */
     Integer editroleStatus(SysRole sysRole);
}