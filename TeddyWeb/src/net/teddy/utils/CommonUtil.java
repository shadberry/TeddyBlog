package net.teddy.utils;

public class CommonUtil {

	public static String replaceArgs(String str, String... args) {
		if (args == null || str == null || str.isEmpty()) {
			return str;
		}
		for (int i = 0; i < args.length; i++) {
			str = str.replaceFirst("\\{"+ i +"\\}", args[i]);
		}
		return str;
	}
}
