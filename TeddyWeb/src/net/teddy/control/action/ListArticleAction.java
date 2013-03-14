package net.teddy.control.action;

import java.util.List;

import net.teddy.model.impl.TArticle;
import net.teddy.service.impl.ArticleService;

import com.opensymphony.xwork2.Action;

public class ListArticleAction{

	private static ArticleService  articleService = new ArticleService(); 
	
	//out: article list
	private List articleList;
	
	/**
	 * List all articles.
	 * @return
	 * @throws Exception
	 */
	public String execute() throws Exception {
		String success = "success";
		List result = articleService.findAll();
		for (Object o : result) {
			Object[] cols = (Object[]) o;
			System.out.println(cols[0] + "_" + cols[1] + "_" + cols[2]);
		}
		articleList  = articleService.findAll();
		return success;
	}
	
	public List getArticleList() {
		return articleList;
	}
	
}
