package net.teddy.utils;

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
}
