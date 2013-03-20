package net.teddy.control.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class ExceptionInterceptor implements Interceptor {
	private static final long serialVersionUID = 1467581845009230098L;
	private static final Logger log = LoggerFactory.getLogger(ExceptionInterceptor.class);
	@Override
	public void destroy() {	}

	@Override
	public void init() {	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		String re = null;
		try {
			re = arg0.invoke();
		} catch (Exception e) {
			log.error("catch a Exception: " + e.getMessage(), e);
			re = "error";
		}
		return re;
	}

}
