package com.Hong.ssm.exception;

 

public class SysException extends RuntimeException {
 
	private static final long serialVersionUID = 1L;

		public SysException() {
	        super();
	    }
	 	
	 	public SysException(String message) {
	         super(message);
	    }


}
