package net.teddy.control.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import net.teddy.dao.HibernateSessionFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionFilter implements Filter {
	private static final Logger log = LoggerFactory.getLogger(SessionFilter.class);

	@Override
	public void destroy() { }

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		try {
			HibernateSessionFactory.getSession().beginTransaction(); 
			chain.doFilter(req, resp);
			HibernateSessionFactory.getSession().getTransaction().commit();
		} catch (Exception e) {
			log.error("SessionFilter catch Exception, try to rollback", e);
			try {
				if (HibernateSessionFactory.getSession().getTransaction().isActive())   {   
					HibernateSessionFactory.getSession().getTransaction().rollback();   
				} 
			} catch (Exception innerEx) {
				log.error("Rollback fail", e);
			}
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException { }


}
