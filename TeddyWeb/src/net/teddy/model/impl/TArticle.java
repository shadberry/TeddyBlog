package net.teddy.model.impl;

import java.sql.Timestamp;

/**
 * TArticle entity. @author MyEclipse Persistence Tools
 */

public class TArticle extends net.teddy.model.base.BaseVo implements
		java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String summary;
	private String content;
	private Timestamp createddate;
	private Integer creatorId;
	private Timestamp modifydate;
	private Integer modifierId;

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
			Timestamp createddate, Integer creatorId, Timestamp modifydate,
			Integer modifierId) {
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.createddate = createddate;
		this.creatorId = creatorId;
		this.modifydate = modifydate;
		this.modifierId = modifierId;
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

	public Timestamp getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
	}

	public Integer getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

	public Timestamp getModifydate() {
		return this.modifydate;
	}

	public void setModifydate(Timestamp modifydate) {
		this.modifydate = modifydate;
	}

	public Integer getModifierId() {
		return this.modifierId;
	}

	public void setModifierId(Integer modifierId) {
		this.modifierId = modifierId;
	}

}