package com.teddy.blog.interceptors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AuthInterceptor implements Interceptor {

	private static final long serialVersionUID = -8966824305616009978L;
	
	private Map<String, List<String>> forUserMap = new HashMap<String, List<String>>();

	@Override
	public void destroy() { }

	@Override
	public void init() { 
		List<String> methods = new ArrayList<String>();
		methods.add("write");
		methods.add("save");
		methods.add("edit");
		methods.add("saveEdit");
		forUserMap.put("article", methods);
	}

	@Override
	public String intercept(ActionInvocation invoc) throws Exception {
//		System.out.println("Action class is "+invoc.getAction().getClass().getName());  
//		System.out.println("Action name is "+invoc.getProxy().getActionName());  
//		System.out.println("Method name is "+invoc.getProxy().getMethod()); 
		
		return invoc.invoke();
	}

}
