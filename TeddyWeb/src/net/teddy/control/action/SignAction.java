package net.teddy.control.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class SignAction implements SessionAware{
	
	//in: user account name
	private String username;
	//in: user password
	private String password;
	
	Map<String, Object> session;
	
	/**
	 * login
	 * @return
	 * @throws Exception
	 */
	public String signIn() throws Exception {
		
		return "sucess";
	}
	
	/**
	 * logout
	 * @return
	 * @throws Exception
	 */
	public String signOut() throws Exception {
		
		return "sucess";
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
