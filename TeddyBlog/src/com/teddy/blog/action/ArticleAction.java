package com.teddy.blog.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.teddy.blog.action.base.BaseAction;
import com.teddy.blog.bean.TArticle;
import com.teddy.blog.bean.TUser;
import com.teddy.blog.commons.CommonUtil;
import com.teddy.blog.service.ArticleService;

public class ArticleAction extends BaseAction implements SessionAware {
	
	private static ArticleService  articleService = new ArticleService(); 
	
	private Map<String, Object> session;
	
	/**
	 * Show specify article
	 * @return
	 * @throws Exception
	 */
	public String show() throws Exception {
		if (id != null && id > 0) {
			article = articleService.findById(id);
			article.setReadcount((article.getReadcount() == null ? 0 :  article.getReadcount()) + 1 );
			articleContent = CommonUtil.convertBlobToString(article.getContent());
			return "show";
		} else {
			return "error";
		}
	}
	
	/**
	 * Show write article page
	 * @return
	 * @throws Exception
	 */
	public String write() throws Exception {
		return "write";
	}
	
	/**
	 * Save article and show it
	 * @return
	 * @throws Exception
	 */
	public String save() throws Exception {
		TUser currentUser = (TUser) session.get(SESSION_USER_KEY);
		String[] tagArray = articleTags.trim().split(" ");
		List<String> tagList = new ArrayList<String>();
		if (tagArray != null && tagArray.length > 0) {
			for (String tag : tagArray) {
				if (!tag.trim().isEmpty()) {
					tagList.add(tag);
				}
			}
		}
		this.id = articleService.saveArticleInfo(currentUser.getId(), articleTitle, articleContent, tagList);
		return "saved";
	}
	
	/**
	 * Show edit article page
	 * @return
	 * @throws Exception
	 */
	public String edit() throws Exception {
		if (id != null && id > 0) {
			article = articleService.findById(id);
			articleContent = CommonUtil.convertBlobToString(article.getContent());
			return "edit";
		} else {
			return "error";
		}
	}
	/**
	 * Save article and show it after modify it
	 * @return
	 * @throws Exception
	 */
	public String saveEdit() throws Exception {
		TUser currentUser = (TUser) session.get(SESSION_USER_KEY);
		String[] tagArray = articleTags.trim().split(" ");
		List<String> tagList = new ArrayList<String>();
		if (tagArray != null && tagArray.length > 0) {
			for (String tag : tagArray) {
				if (!tag.trim().isEmpty()) {
					tagList.add(tag);
				}
			}
		}
		articleService.saveArticleInfo(id, currentUser.getId(), articleTitle, articleContent, tagList);
		return "saved";
	}

	/*******************************Arguments***************************************/
	//in|out: owner id
	private Integer userId;
	//out:owner name
	private String userName;
	
	//in|out: article id
	private Integer id;
	//out: article info
	private TArticle article;

	//in:articleTitle
	private String articleTitle;
	//in|out:articleContent
	private String articleContent;
	//in:out:articleTags;
	private String articleTags;

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public TArticle getArticle() {
		return article;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer ownerId) {
		this.userId = ownerId;
	}

	public String getUserName() {
		return userName;
	}

	public String getArticleTags() {
		return articleTags;
	}

	public void setArticleTags(String articleTags) {
		this.articleTags = articleTags;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		session = arg0;
	}
	
}
