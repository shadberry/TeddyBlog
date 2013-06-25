package com.teddy.blog.action;

import java.sql.Blob;
import java.util.Arrays;
import java.util.List;

import com.teddy.blog.commons.CommonUtil;
import com.teddy.blog.service.ArticleService;

public class ListArticleAction{

	private static ArticleService  articleService = new ArticleService(); 
	
	//out: teddy article list
	private List<Object[]> articleList;
	
	/**
	 * List all articles of two owner.
	 * @return
	 * @throws Exception
	 */
	public String listAll() throws Exception {
		String success = "success";
		articleList  = articleService.findAll();
		for (Object[] object : articleList) {
			object[3] = CommonUtil.convertBlobToString((Blob) object[3]);
		}
		return success;
	}
	
	public List getArticleList() {
		return articleList;
	}
	
}
