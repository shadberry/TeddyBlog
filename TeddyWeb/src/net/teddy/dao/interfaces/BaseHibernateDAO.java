package net.teddy.dao.interfaces;

import java.util.List;

import net.teddy.dao.HibernateSessionFactory;
import net.teddy.utils.QueryXmlReader;

import org.hibernate.SQLQuery;
import org.hibernate.Session;


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public abstract class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
	public List queryBySql(String module, String sqlId, String... args) {
		Session session = HibernateSessionFactory.getSession();
		String sql = QueryXmlReader.getSql(module, sqlId, args);
		SQLQuery query = session.createSQLQuery(sql);
		List re = query.list();
		return re;
		
	}
}