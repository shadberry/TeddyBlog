package net.teddy.control.action;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.util.ServletContextAware;

import net.teddy.model.impl.TArticle;
import net.teddy.service.impl.ArticleService;

import com.opensymphony.xwork2.Action;

public class MainIndexAction implements Action, RequestAware {

	private static ArticleService  articleService = new ArticleService(); 
	
	private Map<String, Object> request;
	
	private List<TArticle> articleList;
	
	@Override
	public String execute() throws Exception {
		System.out.println("excute MainIndexAction");
		String success = "success";
		List<TArticle> result = articleService.findAll();
		for (TArticle a : result) {
			System.out.println(a.getTitle() + "_" + a.getSummary() + "_" +a.getContent());
		}
		articleList  = articleService.findAll();
		System.out.println(articleList.size());
		request.put("articleList", articleList);
		return success;
	}

	public void setArticleList(List<TArticle> articleList) {
		this.articleList = articleList;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
}
