package com.teddy.blog.action;

import java.util.List;

import com.teddy.blog.service.ArticleService;

public class ListArticleAction{

	private static ArticleService  articleService = new ArticleService(); 
	
	//out: teddy article list
	private List teddyArticleList;
	//out: shall article list
	private List shallArticleList;
	
	/**
	 * List all articles of two owner.
	 * @return
	 * @throws Exception
	 */
	public String listAll() throws Exception {
		String success = "success";
		teddyArticleList  = articleService.findAllByCreator(1);
		shallArticleList  = articleService.findAllByCreator(2);
		return success;
	}
	
	public List getTeddyArticleList() {
		return teddyArticleList;
	}
	public List getShallArticleList() {
		return shallArticleList;
	}
	
}
