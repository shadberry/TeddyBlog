package com.teddy.blog.service;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.Hibernate;

import com.teddy.blog.bean.TArticle;
import com.teddy.blog.bean.TKeyword;
import com.teddy.blog.commons.CommonUtil;
import com.teddy.blog.dao.TArticleDAO;
import com.teddy.blog.dao.TKeywordDAO;
import com.teddy.blog.dao.base.IBaseHibernateDAO;
import com.teddy.blog.service.base.IService;

public class ArticleService implements IService{

	TArticleDAO articleDAO = new TArticleDAO();
	TKeywordDAO keyDAO = new TKeywordDAO();
	
	/**
	 * find all articles order by created date
	 * @return
	 */
	public List<Object[]> findAll() {
		return articleDAO.queryBySql(IBaseHibernateDAO.MODULE_ARTICLE, 
				"getAllArticle", "CREATEDDATE", "DESC");
	}
	
	/**
	 * find all articles order by creator and created date
	 * @return
	 */
	public List<Object[]> findAllByCreator(Integer id) {
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
	
	/**
	 * save an article and it's tags after create it
	 * @param creator
	 * @param title
	 * @param content
	 * @param tags
	 * @throws Exception 
	 */
	public Integer saveArticleInfo(Integer creator, String title, String content, List<String> tags) throws Exception {
		//save article
		TArticle article = new TArticle();
		Timestamp currentTs = new Timestamp(System.currentTimeMillis()); 
		article.setTitle(title);
		article.setContent(Hibernate.createBlob(content.getBytes()));
		article.setCreatorId(creator);
		article.setModifierId(creator);
		article.setCreateddate(currentTs);
		article.setModifydate(currentTs);
		articleDAO.save(article);
		
		if (article.getId() <=0) {
			throw new Exception(CommonUtil.replaceArgs("Article��{0}, ����ID�����ڣ�����ʧ��", title));
		}
		
		//save tags with reference article
		TKeyword key = null;
		for (String tag:  tags) {
			key = new TKeyword();
			key.setArticleid(article.getId());
			key.setKeyword(tag);
			keyDAO.save(key);
			if (key.getId() <=0) {
				throw new Exception(CommonUtil.replaceArgs("Tag��{0}, ����ID�����ڣ�����ʧ��", tag));
			}
		}
		
		return article.getId();
	}
	
	/**
	 * save an article and it's tags after edit it 
	 * @param articleId
	 * @param modifier
	 * @param title
	 * @param content
	 * @param tags
	 * @return
	 * @throws Exception
	 */
	public Integer saveArticleInfo(Integer articleId, 
			Integer modifier, String title, String content, List<String> tags) throws Exception {
		//save article
		TArticle article = articleDAO.findById(articleId);
		Timestamp currentTs = new Timestamp(System.currentTimeMillis()); 
		article.setTitle(title);
		article.setContent(Hibernate.createBlob(content.getBytes()));
		article.setModifierId(modifier);
		article.setModifydate(currentTs);
		
		if (article.getId() <=0) {
			throw new Exception(CommonUtil.replaceArgs("Article��{0}, ����ID�����ڣ�����ʧ��", title));
		}
		
		//find tags by article id
		List<TKeyword> tagList = keyDAO.findByArticleid(articleId);
		
		//delete the Tag that not in the tags, 
		TKeyword key = null;
		for (TKeyword dbKey:  tagList) {
			key = null;
			for (String tag : tags) {
				if (dbKey.getKeyword().equals(tag)) {
					key = dbKey;
					break;
				}
			}
			if (key == null) {
				keyDAO.delete(dbKey);
			}
		}

		//add the Tag that not in tagList but exist in tags
		for (String tag : tags) {
			key =null;
			for (TKeyword dbKey:  tagList) {
				if (dbKey.getKeyword().equals(tag)) {
					key = dbKey;
					break;
				}
			}
			if (key == null) {
				key = new TKeyword();
				key.setArticleid(article.getId());
				key.setKeyword(tag);
				keyDAO.save(key);
			}
		}
		return article.getId();
	}
}
