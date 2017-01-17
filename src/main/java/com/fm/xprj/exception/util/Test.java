package com.fm.xprj.exception.util;

import com.fm.xprj.exception.FMException;
import com.fm.xprj.exception.FMExceptionID;

public class Test {

	public static void main(String[] args) {
		
	
		String[] strings=new String[]{"fuen"};
		FMMessage fmMessage=new FMMessage(UserMessages.USER_DUPLICATE_LOGIN_ID,strings);
		FMException fmErrorException=new FMException(FMExceptionID.ERROR_USER_DUPLICATE_LOGIN_ID, fmMessage);
		System.out.println(fmErrorException.getMessage());

	}

}
