package net.teddy.dao.interfaces;

import java.util.List;

import org.hibernate.Session;


/**
 * Data access interface for domain model
 * @author MyEclipse Persistence Tools
 */
public interface IBaseHibernateDAO {
	public Session getSession();
	public List queryBySql(String module, String sqlId, String... args);
}