package com.teddy.blog.action;

import org.apache.struts2.ServletActionContext;

import com.teddy.blog.bean.TUser;
import com.teddy.blog.service.UserService;

public class SignAction{
	private static UserService userService = new UserService();
	
	//in: user account name
	private String username;
	//in: user password
	private String password;
	
	/**
	 * login
	 * @return
	 * @throws Exception
	 */
	public String in() throws Exception {
		System.out.println("@" +username);
		System.out.println(password);
		ServletActionContext.getRequest().getSession().removeAttribute("currentUser");
		TUser currentUser = userService.findByUsername(username);
		if (currentUser != null && currentUser.getPassword().equals(password)) {
			 ServletActionContext.getRequest().getSession().setAttribute("currentUser", currentUser);
			 System.out.println(ServletActionContext.getRequest().getSession().getAttribute("currentUser"));
			 System.out.println("登录成功");
		}
		return "index";
	}
	
	/**
	 * logout
	 * @return
	 * @throws Exception
	 */
	public String out() throws Exception {
		ServletActionContext.getRequest().getSession().removeAttribute("currentUser");
		return "index";
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
