package net.teddy.service.impl;

import java.util.List;

import net.teddy.dao.base.IBaseHibernateDAO;
import net.teddy.dao.impl.TArticleDAO;
import net.teddy.model.impl.TArticle;
import net.teddy.service.base.IService;

public class ArticleService implements IService{

	TArticleDAO articleDAO = new TArticleDAO();
	
	/**
	 * find all articles order by created date
	 * @return
	 */
	public List<TArticle> findAll() {
		return articleDAO.queryBySql(IBaseHibernateDAO.MODULE_ARTICLE, 
				"getAllArticle", "CREATEDDATE", "DESC");
	}
	
	/**
	 * find all articles order by creator and created date
	 * @return
	 */
	public List<TArticle> findAllByCreator(Integer id) {
		return articleDAO.queryBySql(IBaseHibernateDAO.MODULE_ARTICLE, 
				"getAllArticleByCreator", "CREATEDDATE", "DESC", id.toString());
	}
	
	/**
	 * find article by id
	 * @param id
	 * @return
	 */
	public TArticle findById(Integer id) {
		return articleDAO.findById(id);
	}
}
