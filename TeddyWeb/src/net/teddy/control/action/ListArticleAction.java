package net.teddy.control.action;

import java.util.List;

import net.teddy.model.impl.TArticle;
import net.teddy.service.impl.ArticleService;

import com.opensymphony.xwork2.Action;

public class ListArticleAction implements Action{

	private static ArticleService  articleService = new ArticleService(); 
	
	private List<TArticle> articleList;
	
	@Override
	public String execute() throws Exception {
		String success = "success";
		List<TArticle> result = articleService.findAll();
		for (TArticle a : result) {
			System.out.println(a.getTitle() + "_" + a.getSummary() + "_" +a.getContent());
		}
		articleList  = articleService.findAll();
		return success;
	}
	
	public List<TArticle> getArticleList() {
		return articleList;
	}
	
}
