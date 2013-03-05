package net.teddy.control.action;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {

	private String message = null;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String execute() throws Exception {

		this.message = "Hello, World";
		// TODO Auto-generated method stub
		return SUCCESS;
	}

}
