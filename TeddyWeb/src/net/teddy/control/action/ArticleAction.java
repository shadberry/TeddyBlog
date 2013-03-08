package net.teddy.control.action;

import net.teddy.model.impl.TArticle;
import net.teddy.service.impl.ArticleService;

public class ArticleAction {
	
	private static ArticleService  articleService = new ArticleService(); 
	
	private Integer id;
	
	private TArticle article;
	
	public String show() throws Exception {
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
