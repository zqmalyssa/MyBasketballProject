package com.fm.xprj.exception;

public interface FMExceptionID {
	
	
	
	public static final int ERROR=0;	
	public static final int WARNING=1000;
	public static final int MSG=2000;
	
	
	public static final int ERROR_USER_DUPLICATE_LOGIN_ID=ERROR+1;	
	public static final int ERROR_USER_INVALID_USERNAME_PASSWORD=ERROR+2;
	
	
	
	
	public static final int MSG_USER_REGISTER_SUCCES=ERROR+1;
	
	
	public int getType();
	


}
