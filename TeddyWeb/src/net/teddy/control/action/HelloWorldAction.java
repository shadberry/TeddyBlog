package net.teddy.control.action;

import java.text.DateFormat;
import java.util.Date;

public class HelloWorldAction {
	
	private String message;
	
	public String getMessage(){
		return message;
	}
	
	public String execute(){
		message="我的第一个struts应用" + DateFormat.getDateInstance().format(new Date(System.currentTimeMillis()));
		System.out.println(message);
		return "success";
	}
}
