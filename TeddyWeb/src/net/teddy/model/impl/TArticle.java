package net.teddy.model.impl;

import java.util.Date;

import net.teddy.model.interfaces.IVo;

/**
 * TArticle entity. @author MyEclipse Persistence Tools
 */

public class TArticle implements java.io.Serializable, IVo {

	// Fields

	private Integer id;
	private String title;
	private String summary;
	private String content;
	private Date createddate;
	private Date modifydate;

	// Constructors

	/** default constructor */
	public TArticle() {
	}

	/** minimal constructor */
	public TArticle(String title) {
		this.title = title;
	}

	/** full constructor */
	public TArticle(String title, String summary, String content,
			Date createddate, Date modifydate) {
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.createddate = createddate;
		this.modifydate = modifydate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public Date getModifydate() {
		return this.modifydate;
	}

	public void setModifydate(Date modifydate) {
		this.modifydate = modifydate;
	}

}