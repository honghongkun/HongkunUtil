package com.Hong.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Hong.ssm.annotation.SysPower;
import com.Hong.ssm.bean.SysMenu;
import com.Hong.ssm.bean.SysUser;
import com.Hong.ssm.bean.SysUserExt;
import com.Hong.ssm.service.UserService;
import com.Hong.ssm.utils.ConstantUtil;
import com.Hong.ssm.utils.PageModel;


@Controller
@RequestMapping(value="/admin")
public class UserController {
	
	@Autowired
	private UserService userServiceImpl;
	
	@RequestMapping(value="/getmenu",method=RequestMethod.POST)
	@ResponseBody
    public Map<String, Object>  selUserMenu(HttpSession session){
		SysUser sysUser=(SysUser) session.getAttribute(ConstantUtil.SESSION_KEY);
    	Map<String, Object> map=new HashMap<String, Object>();
    	map.put("succ", false);
    	map.put("msg", "�˵���ȡʧ��!");
    	try {
    		List<SysMenu> menulist= userServiceImpl.selUserMenu(sysUser.getUserRolepid());
    		map.put("succ", true);
    		map.put("msg", "��ȡ�˵��ɹ�");
    		map.put("data", menulist);
		} catch (Exception e) {

/*GetMessage �����������Ǵӵ�ǰ�̵߳���Ϣ�������ȡһ����Ϣ������ MSG �ṹ �С�*/
			map.put("msg", e.getMessage());
		}
		return map;
    }
	
	
	/*@RequestMapping(value="/student/getmenu1",method=RequestMethod.POST)
	@ResponseBody
    public Map<String, Object>  selUserMenu1(HttpSession session){
		SysUser sysUser=(SysUser) session.getAttribute(ConstantUtil.SESSION_KEY);
    	Map<String, Object> map=new HashMap<String, Object>();
    	map.put("succ", false);
    	map.put("msg", "�˵���ȡʧ��!");
    	try {
    		List<SysMenu> menulist= userServiceImpl.selUserMenu(sysUser.getUserRolepid());
    		map.put("succ", true);
    		map.put("msg", "��ȡ�˵��ɹ�");
    		map.put("data", menulist);
		} catch (Exception e) {

GetMessage �����������Ǵӵ�ǰ�̵߳���Ϣ�������ȡһ����Ϣ������ MSG �ṹ �С�
			map.put("msg", e.getMessage());
		}
		return map;
    }*/
	
	@RequestMapping(value="/sys/selUserList",method=RequestMethod.POST)
	@ResponseBody
	 public Map<String, Object>  selUserList(SysUser sysUser,Integer pageSize,Integer pageNo){
		
		Map<String, Object> map=new HashMap<String, Object>();
		PageModel<SysUser> list=userServiceImpl.getUserList(sysUser, pageSize, pageNo);
		map.put("succ", true);
		map.put("msg", "��ȡ���ݳɹ�");
		map.put("data",list);
		return map;
	 }
	/**
	 * ������ɫ
	 * @param sysUser
	 * @param pageSize
	 * @param pageNo
	 * @return
	 */
	@RequestMapping(value="/sys/selUserRoleList",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	 public Map<String, Object>  selUserRoleList(SysUser sysUser,Integer pageSize,Integer pageNo){
		
		Map<String, Object> map=new HashMap<String, Object>();
		PageModel<SysUserExt> list=userServiceImpl.selUserRoleList(sysUser, pageSize, pageNo);
		map.put("succ", true);
		map.put("msg", "��ȡ���ݳɹ�");
		map.put("data",list);
		return map;
	 }
	
	
	@SysPower(keys="3")
	@RequestMapping(value="/sys/addUser",method=RequestMethod.POST)
	@ResponseBody
	 public Map<String, Object>  addUserList(SysUser sysUser){
		Map<String, Object> map=ConstantUtil.map;
		Integer reInt= userServiceImpl.adduser(sysUser);
		if (reInt>0) {
          map.put("succ", true);
          map.put("msg","�����û��ɹ�");
		}else {
	      map.put("msg","�����û�ʧ�ܣ�������...");
		}
		return map;
	}
	
	@RequestMapping(value="/sys/UaerEdit",method=RequestMethod.POST)
	@ResponseBody
	 public Map<String, Object> UaerEdit(SysUser sysUser){
		 
		 Map<String, Object> map=new HashMap<String, Object>();
		 boolean succ= userServiceImpl.editUser(sysUser);
		 map.put("succ", succ);
		 if (succ) {
	          map.put("msg","�޸��û��ɹ�");
		}else {
		      map.put("msg","�޸��û�ʧ�ܣ�������...");
			}
		 return map;
	}
	 @RequestMapping(value="/sys/selUserID",method= {RequestMethod.POST,RequestMethod.GET})
	 @ResponseBody
	 public Map<String, Object> selUserID(Integer userId){
		 Map<String, Object> map=new HashMap<String, Object>();
		 SysUser user= userServiceImpl.selUserID(userId);
		 if (user!=null) {
			    map.put("succ", true);
				map.put("msg", "��ȡ���ݳɹ�");
				map.put("data", user);
		}else {
			 map.put("succ", false);
			 map.put("msg", "��ȡ����ʧ��");
		}
		  
		 return map;
	 }
	 @RequestMapping(value="/sys/deleteUserID",method= {RequestMethod.POST,RequestMethod.GET})
	 @ResponseBody
	 public Map<String, Object> deleteUserID(Integer userId){
		 Map<String, Object> map=new HashMap<String, Object>();
		 boolean succ= userServiceImpl.deleteUser(userId);
			map.put("succ", succ);
		  	if(succ) {
				map.put("msg", "�û�ɾ���ɹ�");
			}else {
				map.put("msg", "�û�ɾ��ʧ��.������!");
			}
		 return map;
	 }
	 
	 @RequestMapping(value="/sys/UaerEditStatus",method= {RequestMethod.POST,RequestMethod.GET})
		@ResponseBody
		 public Map<String, Object> UaerEditStatus(SysUser sysUser,Integer userId){
			 Map<String, Object> map=new HashMap<String, Object>();
			 
			 SysUser user= userServiceImpl.selUserID(userId);
			 
			 if (user!=null) {
				    map.put("succ", true);
					map.put("msg", "״̬�ı�ɹ�");
					userServiceImpl.editRoleUser(sysUser);
			}else {
				 map.put("succ", false);
				 map.put("msg", "״̬�ı�ʧ��");
			}
			 
			 return map;
		}
}
