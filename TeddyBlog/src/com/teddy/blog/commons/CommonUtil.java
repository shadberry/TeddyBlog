package com.teddy.blog.commons;

import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.SQLException;

public class CommonUtil {

	/**
	 * replace string "{0}, {1}, .." to input arguments
	 * @param str
	 * @param args
	 * @return
	 */
	public static String replaceArgs(String str, String... args) {
		if (args == null || str == null || str.isEmpty()) {
			return str;
		}
		for (int i = 0; i < args.length; i++) {
			str = str.replaceAll("\\{"+ i +"\\}", args[i]);
		}
		return str;
	}

	public static String convertBlobToString(Blob blob) throws SQLException{
		String result = "";
		ByteArrayInputStream msgContent =(ByteArrayInputStream) blob.getBinaryStream();
		byte[] byte_data = new byte[msgContent.available()];
		msgContent.read(byte_data, 0,byte_data.length);
		result = new String(byte_data);
		return result;
	}
}
