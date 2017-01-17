package com.fm.xprj.exception.util;

public class FMMessage extends LocalizedMessage {

    public FMMessage(ResourceKey rKey) {
        this(rKey,(Object[])null);
    }


    public FMMessage(ResourceKey rKey, Object[] args) {
    	this.m_resourceKey = rKey;
        this.m_args = args;
    }
}
