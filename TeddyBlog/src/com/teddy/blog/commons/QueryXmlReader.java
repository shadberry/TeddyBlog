package com.teddy.blog.commons;
import java.io.File;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;


public class QueryXmlReader {

	private static String xmlPath = null;

	private static Document doc = null;

	/**
	 * Parse xml, called in first time or after modify
	 * @throws Exception
	 */
	public static void parserXml() throws Exception{ 
		if (xmlPath == null || xmlPath.isEmpty()) {
			throw new Exception("Query xml file path is null or empty");
		}
		SAXReader builder = new SAXReader();
		doc = builder.read(new File(xmlPath));
	}

	/**
	 * get sql by module and id from the spicify xml parsed document
	 * @param module
	 * @param sqlId
	 * @param args
	 * @return
	 */
	public static String getSql(String module, String sqlId) {
		String xpathStr = "/root/module[@id='{0}']/sql[@id='{1}']"; 
		xpathStr = CommonUtil.replaceArgs(xpathStr, module, sqlId);
		Node node = doc.selectSingleNode(xpathStr);
		return node.getText().trim();
	}

	/**
	 * Set xml path, called in sever startup or the xml path changed
	 * @param xmlPath
	 */
	public static void setXmlPath(String xmlPath) {
		QueryXmlReader.xmlPath = xmlPath;
	}
}
