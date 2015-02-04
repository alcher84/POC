package com.poc.springrestwebservice.exception;

/**
 * 
 * Common Exception for SpringRestWebservice application
 *
 */
public class SpringRestWebserviceException extends Exception {
	
	public SpringRestWebserviceException(String msg){
		super(msg);
		
	}
	
	public SpringRestWebserviceException(Throwable e){
		super(e);
	}
	
	public SpringRestWebserviceException(String msg,Throwable e){
		super(msg, e);
	}


}
