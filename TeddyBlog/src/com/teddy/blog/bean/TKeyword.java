package com.teddy.blog.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * TKeyword entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_keyword", catalog = "blog")
public class TKeyword implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer articleid;
	private String keyword;

	// Constructors

	/** default constructor */
	public TKeyword() {
	}

	/** full constructor */
	public TKeyword(Integer articleid, String keyword) {
		this.articleid = articleid;
		this.keyword = keyword;
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

	@Column(name = "ARTICLEID")
	public Integer getArticleid() {
		return this.articleid;
	}

	public void setArticleid(Integer articleid) {
		this.articleid = articleid;
	}

	@Column(name = "KEYWORD", length = 100)
	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}