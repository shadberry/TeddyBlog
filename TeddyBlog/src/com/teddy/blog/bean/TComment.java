package com.teddy.blog.bean;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * TComment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_comment", catalog = "blog")
public class TComment implements java.io.Serializable {

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
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "TITLE", length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "CONTENT", length = 1000)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "ARTICLEID")
	public Integer getArticleid() {
		return this.articleid;
	}

	public void setArticleid(Integer articleid) {
		this.articleid = articleid;
	}

	@Column(name = "CREATEDDATE", length = 19)
	public Timestamp getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Timestamp createddate) {
		this.createddate = createddate;
	}

	@Column(name = "CREATORID")
	public Integer getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(Integer creatorid) {
		this.creatorid = creatorid;
	}

}