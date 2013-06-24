package com.teddy.blog.dao.base;

import java.util.List;

import org.hibernate.Session;


/**
 * Data access interface for domain model
 * @author MyEclipse Persistence Tools
 */
public interface IBaseHibernateDAO {
	public Session getSession();
	public List queryBySql(String module, String sqlId, String... args);
	
	public static final String MODULE_ARTICLE = "article";
}