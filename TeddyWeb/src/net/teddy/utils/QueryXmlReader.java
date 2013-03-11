package net.teddy.utils;
import java.io.File;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.Text;
import org.dom4j.io.SAXReader;


public class QueryXmlReader {

	private static String xmlPath = null;

	private static Document doc = null;

	public static void parserXml() throws Exception{ 
		if (xmlPath == null || xmlPath.isEmpty()) {
			throw new Exception("Query xml file path is null or empty");
		}
		SAXReader builder = new SAXReader();
		doc = builder.read(new File(xmlPath));
	}

	public static String getSql(String module, String sqlId, String... args ) {
		String xpathStr = "/root/module[@id='{0}']/sql[@id='{1}']"; 
		xpathStr = CommonUtil.replaceArgs(xpathStr, module, sqlId);
		Node node = doc.selectSingleNode(xpathStr);
		return node.getText().trim();
	}

	public static void setXmlPath(String xmlPath) {
		QueryXmlReader.xmlPath = xmlPath;
	}
}
