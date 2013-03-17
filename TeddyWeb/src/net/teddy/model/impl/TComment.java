package net.teddy.model.impl;

import java.sql.Timestamp;

/**
 * TComment entity. @author MyEclipse Persistence Tools
 */

public class TComment extends net.teddy.model.base.BaseVo implements
		java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String content;
	private Integer articleid;
	private Timestamp createddate;
	private Integer creatorid;

	// Constructors

	/** default constructor */
	public TComment() {
	}

	/** full constructor */
	public TComment(String title, String content, Integer articleid,
			Timestamp createddate, Integer creatorid) {
		this.title = title;
		this.content = content;
		this.articleid = articleid;
		this.createddate = createddate;
		this.creatorid = creatorid;
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getArticleid() {
		return this.articleid;
	}

	public void setArticleid(Integer articleid) {
		this.articleid = articleid;
	}

	public Timestamp getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
	}

	public Integer getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(Integer creatorid) {
		this.creatorid = creatorid;
	}

}