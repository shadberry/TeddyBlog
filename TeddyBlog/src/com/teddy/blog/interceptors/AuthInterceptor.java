package com.teddy.blog.interceptors;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AuthInterceptor implements Interceptor, SessionAware {

	private static final long serialVersionUID = -8966824305616009978L;
	
	private Map<String, Object> session;

	@Override
	public void destroy() { }

	@Override
	public void init() { }

	@Override
	public String intercept(ActionInvocation invoc) throws Exception {
//		System.out.println("Action class is "+invoc.getAction().getClass().getName());  
//		System.out.println("Action name is "+invoc.getProxy().getActionName());  
//		System.out.println("Method name is "+invoc.getProxy().getMethod()); 
		return invoc.invoke();
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
