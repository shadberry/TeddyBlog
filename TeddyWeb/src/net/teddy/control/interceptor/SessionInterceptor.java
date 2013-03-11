package net.teddy.control.interceptor;

import net.teddy.dao.HibernateSessionFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;


public class SessionInterceptor implements Interceptor {


	private static final Logger log = LoggerFactory.getLogger(SessionInterceptor.class);
	
	private static final long serialVersionUID = 4819380747916316305L;

	@Override
	public void destroy() {	}

	@Override
	public void init() {	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("1");
		String result = null;
		try {
			HibernateSessionFactory.getSession().beginTransaction(); 
			result = invocation.invoke();
			HibernateSessionFactory.getSession().getTransaction().commit();
		} catch (Exception e) {
			log.error("SessionInterceptor catch Exception " + e.getMessage()+ " , try to rollback");
			try {
				if (HibernateSessionFactory.getSession().getTransaction().isActive())   {   
					HibernateSessionFactory.getSession().getTransaction().rollback();   
				} 
			} catch (Exception innerEx) {
				log.error("Rollback fail: " + innerEx.getMessage(), innerEx);
			}
			throw e;
		} finally {
			HibernateSessionFactory.closeSession();
		}
		System.out.println("2");
		return result;
	}

	
}
