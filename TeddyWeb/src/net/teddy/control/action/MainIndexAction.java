package net.teddy.control.action;

import java.util.List;

import net.teddy.model.impl.TArticle;
import net.teddy.service.impl.ArticleService;

import com.opensymphony.xwork2.Action;

public class MainIndexAction implements Action {

	public static ArticleService  articleService = new ArticleService(); 
	
	@Override
	public String execute() throws Exception {
		System.out.println("excute MainIndexAction");
		String success = "success";
		List<TArticle> result = articleService.findAll();
		for (TArticle a : result) {
			System.out.println(a.getTitle() + "_" + a.getSummary() + "_" +a.getContent());
		}
		return success;
	}

}
