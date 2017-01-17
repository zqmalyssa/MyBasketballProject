package com.fm.xprj.exception;

import java.util.Locale;

import com.fm.xprj.exception.util.FMMessage;

public class FMException extends Exception implements FMExceptionID{
	
	private int error_id;
	private String error_msg;
	private Locale locale=Locale.getDefault();
	public FMException(int errorId,FMMessage message) {
		this.error_id=errorId;
		this.error_msg=message.getMessage(locale);
	}
	public String getMessage() {
		 return (error_msg != null) ? error_msg : super.getMessage();
	}
	@Override
	public int getType() {
		if(this.error_id<1000){
			return ERROR;
		}else if (this.error_id>1000&&this.error_id<2000) {
			return WARNING;
		}else {
			return MSG;
		}
		
	}
	
}
