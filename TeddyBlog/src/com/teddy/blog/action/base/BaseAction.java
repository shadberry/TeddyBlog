package com.teddy.blog.action.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseAction {
	public static final String SESSION_USER_KEY = "currentUser";
	protected final Logger log = LoggerFactory.getLogger(this.getClass()); 
}
