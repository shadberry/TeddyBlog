package net.teddy.model.impl;

import net.teddy.model.interfaces.IVo;

/**
 * TUser entity. @author MyEclipse Persistence Tools
 */

public class TUser implements java.io.Serializable, IVo {

	// Fields

	private Integer id;
	private String name;
	private String description;
	private String cellphone;
	private String email;
	private String sex;
	private String username;
	private String password;

	// Constructors

	/** default constructor */
	public TUser() {
	}

	/** minimal constructor */
	public TUser(String name, String username, String password) {
		this.name = name;
		this.username = username;
		this.password = password;
	}

	/** full constructor */
	public TUser(String name, String description, String cellphone,
			String email, String sex, String username, String password) {
		this.name = name;
		this.description = description;
		this.cellphone = cellphone;
		this.email = email;
		this.sex = sex;
		this.username = username;
		this.password = password;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}