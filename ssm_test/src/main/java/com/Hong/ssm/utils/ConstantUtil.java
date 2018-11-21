package com.Hong.ssm.utils;

import java.util.HashMap;
import java.util.Map;

public class ConstantUtil {
	/**
	 * Session÷– KEY
	 */
	public  final static String SESSION_KEY="LoginUser";
	public  final static String POWER_KEYS="PowerKeys";
 
    public static Map<String,Object> map;
	
	static {
		map = new HashMap<String, Object>();
		map.put("succ", false);
		map.put("msg", "œµÕ≥¥ÌŒÛ");
	}
	
}
