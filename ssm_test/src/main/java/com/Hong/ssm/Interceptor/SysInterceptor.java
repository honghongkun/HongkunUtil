package com.Hong.ssm.Interceptor;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import com.Hong.ssm.annotation.SysPower;
import com.Hong.ssm.bean.SysUser;
import com.Hong.ssm.utils.ConstantUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import comHong.ssm.enums.ResultFlg;

public class SysInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//根据角色  获取 对象菜单ID集合

		
		//效验 登录	
		SysUser sysUser=(SysUser)request.getSession().getAttribute(ConstantUtil.SESSION_KEY);
		
		//取得  当前登录用户所有的权限ID
		@SuppressWarnings("unchecked")
		List<Integer> ids=(List<Integer>) request.getSession().getAttribute(ConstantUtil.POWER_KEYS);
		//判断 handler 是不是  HandlerMethod 继承的对象或者子接口
		if (handler.getClass().isAssignableFrom(HandlerMethod.class)) {
			 //当前被拦截的方法
			HandlerMethod method=(HandlerMethod) handler;
			 //获取方法上的注解  ---获取syspower类型的注解
			
			SysPower methodAnnotation=method.getMethodAnnotation(SysPower.class);
			if (methodAnnotation!=null) {
				String keys=methodAnnotation.keys();
				if (checkPowerKeys(keys,ids)) {
					return  true; 
				}else {
					 response.setContentType("application/json;charset=UTF-8");
					 PrintWriter out = response.getWriter();
					 if(methodAnnotation.resultTag()==ResultFlg.JSON) {
						 ObjectMapper objectMapper = new ObjectMapper();
						 Map<String, Object> map = ConstantUtil.map;
						 map.put("msg", "无权限");
						 out.println(objectMapper.writeValueAsString(map));
					 }
					
					 return false;
				 }
				
			}
			
		}
		return true;
		
	}
	
	
	
	
	
	/**
	 *  检查的 是否 拥有 权限
	 * @param keys	
	 * @param ids
	 * @return
	 */
	public  boolean  checkPowerKeys(String keys,List<Integer> ids) {
		String [] needKeyArr = keys.split(",");
		Integer [] hasKeyArr = new  Integer[ids.size()];
		hasKeyArr = ids.toArray(hasKeyArr);
		for(String str:needKeyArr) {
			if(!ArrayUtils.contains(hasKeyArr, Integer.parseInt(str))) {
				return false;
			}
		}
		return true;
	}
}
