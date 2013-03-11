package net.teddy.control.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import net.teddy.utils.QueryXmlReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XmlInitServlet  extends HttpServlet {
	private static final Logger log = LoggerFactory
			.getLogger(XmlInitServlet.class);

	public XmlInitServlet() {
		super();
		System.out.println("!!!!!!!!!!!!!!TeddyWeb's xml is Init!!!!!!!!!!!!!!!!");
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		String path = getServletContext().getRealPath("");
		String file = getInitParameter("xmlPath");
		if(file != null){
			QueryXmlReader.setXmlPath(path+file);
			try {
				QueryXmlReader.parserXml();
//				String s = QueryXmlReader.getSql("article", "getAllArticle", "test", "test2");
//				System.out.println("s@@@@@@@@@@" + s);
			} catch (Exception e) {
				log.error("Exception@" + e.getMessage(), e);
			}
		}
	}
}
