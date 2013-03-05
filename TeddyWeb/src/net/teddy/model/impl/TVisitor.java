package net.teddy.model.impl;

import java.sql.Timestamp;

import net.teddy.model.interfaces.IVo;

/**
 * TVisitor entity. @author MyEclipse Persistence Tools
 */

public class TVisitor implements java.io.Serializable, IVo {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String description;
	private Timestamp createddate;
	private String ipaddress;

	// Constructors

	/** default constructor */
	public TVisitor() {
	}

	/** minimal constructor */
	public TVisitor(String username, String password, Timestamp createddate) {
		this.username = username;
		this.password = password;
		this.createddate = createddate;
	}

	/** full constructor */
	public TVisitor(String username, String password, String description,
			Timestamp createddate, String ipaddress) {
		this.username = username;
		this.password = password;
		this.description = description;
		this.createddate = createddate;
		this.ipaddress = ipaddress;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
	}

	public String getIpaddress() {
		return this.ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

}