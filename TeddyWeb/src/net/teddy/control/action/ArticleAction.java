package net.teddy.control.action;

import java.util.ArrayList;

import net.teddy.model.impl.TArticle;
import net.teddy.service.impl.ArticleService;

public class ArticleAction {
	
	private static ArticleService  articleService = new ArticleService(); 
	
	/**
	 * Show specify article
	 * @return
	 * @throws Exception
	 */
	public String showTeddy() throws Exception {
		if (id != null && id > 0) {
			article = articleService.findById(id);
		}
		return "success";
	}
	
	/**
	 * Show write Teddy's article page
	 * @return
	 * @throws Exception
	 */
	public String writeTeddy() throws Exception {
		return "success";
	}
	
	/**
	 * Save Teddy's article and show it
	 * @return
	 * @throws Exception
	 */
	public String saveTeddy() throws Exception {
		System.out.println("Title is: \n" + articleTitle);
		System.out.println("Content is: \n" + articleContent);
		this.id = articleService.saveArticleInfo(1, articleTitle, articleContent, new ArrayList<String>());
		return "saved";
	}
	
	/**
	 * Show specify article
	 * @return
	 * @throws Exception
	 */
	public String showShall() throws Exception {
		if (id != null && id > 0) {
			article = articleService.findById(id);
		}
		return "success";
	}
	
	public String writeShall() throws Exception {
		return "success";
	}

	/*******************************Arguments***************************************/
	//in|out: article id
	private Integer id;
	//out: article info
	private TArticle article;

	//in:articleTitle
	private String articleTitle;
	//in:articleContent
	private String articleContent;

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
	
}
