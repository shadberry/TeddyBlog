package net.teddy.service.impl;

import java.util.List;

import net.teddy.dao.impl.TArticleDAO;
import net.teddy.model.impl.TArticle;
import net.teddy.service.interfaces.IService;

public class ArticleService implements IService{

	TArticleDAO articleDAO = new TArticleDAO();
	
	@Override
	public void reconfiguration() { }
	
	/**
	 * ��ѯ���е��ĵ���Ϣ
	 * @return
	 */
	public List<TArticle> findAll() {
		return articleDAO.findAll();
	}
	
	/**
	 * ����ID��ȡ�ĵ���Ϣ
	 * @param id
	 * @return
	 */
	public TArticle findById(Integer id) {
		return articleDAO.findById(id);
	}
}
