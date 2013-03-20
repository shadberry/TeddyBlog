package net.teddy.control.action;

import net.teddy.model.impl.TArticle;
import net.teddy.service.impl.ArticleService;

public class ArticleAction {
	
	private static ArticleService  articleService = new ArticleService(); 
	
	//in: article id
	private Integer id;
	//out: article info
	private TArticle article;
	
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

	public void setId(Integer id) {
		this.id = id;
	}

	public TArticle getArticle() {
		return article;
	}
	
}
