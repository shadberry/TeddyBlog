package net.teddy.utils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class QueryXmlReader {

	public static void parserXml(String fileName) {  
		String textXml = "";
		SAXBuilder builder = new SAXBuilder();
		Document doc = null;
		Reader in= new StringReader(textXml);
		try {
			doc = builder.build(in);
			Element root = doc.getRootElement();
			List ls = root.getChildren();//注意此处取出的是root节点下面的一层的Element集合
			for (Iterator iter = ls.iterator(); iter.hasNext(); ) {
				Element el = (Element) iter.next();
				if(el.getName().equals("to")){
					System.out.println(el.getText());
				}
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (JDOMException ex) {
			ex.printStackTrace();
		}
	}



}
