package net.teddy.control.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.PropertyConfigurator;

public class Log4jInitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void destroy() {
		super.destroy();
	}

	public Log4jInitServlet() {
		super();
		System.out.println("!!!!!!!!!!!!!!TeddyWeb's log4j is Init!!!!!!!!!!!!!!!!");
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		String path = getServletContext().getRealPath("/");
		String file = getInitParameter("log4j");
		if(file != null){
			PropertyConfigurator.configure(path+file);
		}
	}

}
