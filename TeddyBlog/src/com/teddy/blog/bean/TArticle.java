package com.teddy.blog.bean;

import java.sql.Blob;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * TArticle entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_article", catalog = "blog")
public class TArticle implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String summary;
	private Blob content;
	private Timestamp createddate;
	private Integer creatorId;
	private Timestamp modifydate;
	private Integer modifierId;
	private Integer readcount;

	// Constructors

	/** default constructor */
	public TArticle() {
	}

	/** minimal constructor */
	public TArticle(String title) {
		this.title = title;
	}

	/** full constructor */
	public TArticle(String title, String summary, Blob content,
			Timestamp createddate, Integer creatorId, Timestamp modifydate,
			Integer modifierId, Integer readcount) {
		this.title = title;
		this.summary = summary;
		this.content = content;
		this.createddate = createddate;
		this.creatorId = creatorId;
		this.modifydate = modifydate;
		this.modifierId = modifierId;
		this.readcount = readcount;
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

	@Column(name = "TITLE", nullable = false, length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "SUMMARY", length = 500)
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Column(name = "CONTENT")
	public Blob getContent() {
		return this.content;
	}

	public void setContent(Blob content) {
		this.content = content;
	}

	@Column(name = "createddate", length = 19)
	public Timestamp getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
	}

	@Column(name = "creatorId")
	public Integer getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

	@Column(name = "modifydate", length = 19)
	public Timestamp getModifydate() {
		return this.modifydate;
	}

	public void setModifydate(Timestamp modifydate) {
		this.modifydate = modifydate;
	}

	@Column(name = "modifierId")
	public Integer getModifierId() {
		return this.modifierId;
	}

	public void setModifierId(Integer modifierId) {
		this.modifierId = modifierId;
	}

	@Column(name = "readcount")
	public Integer getReadcount() {
		return this.readcount;
	}

	public void setReadcount(Integer readcount) {
		this.readcount = readcount;
	}

}