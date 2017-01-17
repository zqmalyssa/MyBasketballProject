package com.fm.xprj.exception.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceKey {
	private String m_key = null; // the key within the resource bundle
	private String m_base = null; // the resource bundle base name
	private Object[] m_args = null;
	
	public ResourceKey(String baseName,String key) {
		this.m_base=baseName;
		this.m_key=key;
	}

	public String getKey() {
		return m_key;
	}

	public void setKey(String m_key) {
		this.m_key = m_key;
	}

	public String getBase() {
		return m_base;
	}

	public void setBase(String m_base) {
		this.m_base = m_base;
	}

	public Object[] getArgs() {
		return m_args;
	}

	public void setArgs(Object[] m_args) {
		this.m_args = m_args;
	}

	public String resolve() {
		return resolve(Locale.getDefault(), null);
	}

	public String resolve(Locale locale) {
		return resolve(locale, null, null);
	}
	public String resolve(Locale locale, Object[] args) {
		return resolve(locale, args, null);
	}

	public String resolve(Locale locale, Object[] args, ClassLoader loader) {
		ResourceBundle rb = (null == loader) ? ResourceBundle.getBundle(m_base, locale)
				: ResourceBundle.getBundle(m_base, locale, loader);
		String mesg = rb.getString(m_key);
		m_args = args;
		return MessageFormat.format(mesg, args);
	}

}
