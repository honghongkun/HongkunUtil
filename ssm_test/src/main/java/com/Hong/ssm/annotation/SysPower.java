package com.Hong.ssm.annotation;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;

import comHong.ssm.enums.ResultFlg;








@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented 
public @interface SysPower {
	
	/**
	 * Ȩ��keys
	 * @return
	 */
	@AliasFor("keys")
	String value() default ""; 
	
	/**
	 * Ȩ�ޱ�ʶ
	 * @return
	 */
	@AliasFor("value")
	String  keys()  default "";
	
	
	boolean isCheck() default true;
	
	/**
	 * Ĭ�Ϸ��ط�ʽΪjson
	 * @return
	 */
	ResultFlg  resultTag() default ResultFlg.JSON;
	
	
	
	
}
