package net.teddy.model.impl;

/**
 * TKeyword entity. @author MyEclipse Persistence Tools
 */

public class TKeyword extends net.teddy.model.base.BaseVo implements
		java.io.Serializable {

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

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getArticleid() {
		return this.articleid;
	}

	public void setArticleid(Integer articleid) {
		this.articleid = articleid;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}