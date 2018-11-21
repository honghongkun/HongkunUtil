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

import com.Hong.ssm.bean.SysUser;
import com.Hong.ssm.service.RoleService;
import com.Hong.ssm.service.UserService;
import com.Hong.ssm.utils.ConstantUtil;
import com.Hong.ssm.utils.MD5;


@Controller
public class LoginController {
	
	@Autowired
	private UserService userServiceImpl;
	@Autowired
	private RoleService roleServiceImpl;
	
	@RequestMapping(value="/login",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public  Map<String, Object>  login(SysUser sysUser,HttpSession session) {
		     String pwdString = sysUser.getUserPwd();
		     String newpwd = MD5.getMD5Encode("С����Ư��",pwdString);
		     sysUser.setUserPwd(newpwd);
			SysUser user = userServiceImpl.login(sysUser);
			Map<String, Object> map = new HashMap<String, Object>();
			//��ȡ ��ǰ��¼�û�  ��ӵ�е� �˵�IDS
			List<Integer> powerIDs = roleServiceImpl.selMenuIdsByRoleID(user.getUserRolepid());
			map.put("succ", false);
			map.put("msg", "��¼ʧ��");
			if(user!=null) {
				//����SESSION
					session.setAttribute(ConstantUtil.SESSION_KEY, user);
					session.setAttribute(ConstantUtil.POWER_KEYS, powerIDs);
					map.put("succ", true);
					map.put("msg", "��¼�ɹ�");
				} 
		
		return map;
		
		
	}
}
