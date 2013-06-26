package com.teddy.blog.interceptors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.teddy.blog.action.base.BaseAction;
import com.teddy.blog.bean.TUser;

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
		String actionName = invoc.getProxy().getActionName();
		String methodName = invoc.getProxy().getMethod();
		TUser currentUser = (TUser) ServletActionContext.getRequest().getSession().getAttribute(BaseAction.SESSION_USER_KEY);
		if (currentUser == null && forUserMap.containsKey(actionName)) {
			List<String> methods = forUserMap.get(actionName);
			for (String method : methods) {
				if (method.equals(methodName)) {
					System.out.println("无权访问");
					return "error";
				}
			}
		}
		System.out.println("成功访问");
		return invoc.invoke();
	}

}
