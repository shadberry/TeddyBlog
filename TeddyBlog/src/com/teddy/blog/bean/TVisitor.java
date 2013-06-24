package com.teddy.blog.bean;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;

/**
 * TVisitor entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_visitor", catalog = "blog", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
public class TVisitor implements java.io.Serializable {

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
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "username", unique = true, nullable = false, length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "description", length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "createddate", nullable = false, length = 19)
	public Timestamp getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
	}

	@Column(name = "ipaddress", length = 50)
	public String getIpaddress() {
		return this.ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

}