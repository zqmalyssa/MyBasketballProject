package com.fm.xprj.exception.util;

import java.util.Locale;


public class LocalizedMessage {
    protected ResourceKey m_resourceKey;
    protected Object[] m_args;
    public LocalizedMessage() {
		
	}
    
    public LocalizedMessage(ResourceKey rKey, Object[] args) {
    	m_resourceKey = rKey;
        this.m_args = args;
    }
    
    public ResourceKey getKey(){
    	return m_resourceKey;
    }
    public void setKey(ResourceKey key) {
    	m_resourceKey=key;
		
	}
    
    public Object[] getArgs() {
		return m_args;
	}
    
    public void setArgs(Object[] args) {
		m_args=args;
	}

    public String getMessage(Locale locale) {
        if (m_resourceKey != null) {
          return m_resourceKey.resolve(locale, m_args);
        }
        else {
      //  return "Well! You forget the resource key";
//        	m_resourceKey = CoreMessages.CORE_ERROR_OCCURRED;
//        	return m_resourceKey.resolve(locale);
        	
        	return "You forget the resource key";
        }
      }
    

}
