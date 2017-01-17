package com.fm.xprj.exception.util;
import com.fm.xprj.exception.util.ResourceKey;
public abstract interface UserMessages
{
public static final ResourceKey USER_REGISTER_SUCCESS= new ResourceKey( "com.fm.xprj.exception.util.UserMessages", "USER_REGISTER_SUCCESS");
public static final ResourceKey USER_INVALID_USERNAME_PASSWORD= new ResourceKey( "com.fm.xprj.exception.util.UserMessages", "USER_INVALID_USERNAME_PASSWORD");
public static final ResourceKey USER_DUPLICATE_LOGIN_ID= new ResourceKey( "com.fm.xprj.exception.util.UserMessages", "USER_DUPLICATE_LOGIN_ID");
}