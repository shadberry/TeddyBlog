package net.teddy.control.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;


public class SessionInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4819380747916316305L;

	@Override
	public void destroy() {
		System.out.println("Interceptor Destroy");
	}

	@Override
	public void init() {
		System.out.println("Interceptor Init");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("Interceptor intercept");
		return invocation.invoke();
	}

	
}
