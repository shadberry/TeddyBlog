package net.teddy.dao.base;

import java.util.List;

import net.teddy.dao.HibernateSessionFactory;
import net.teddy.utils.CommonUtil;
import net.teddy.utils.QueryXmlReader;

import org.hibernate.Hibernate;
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
	
	/**
	 * provide a method to run the query by module and sql id.
	 * @return a list of object/object[] of the result data
	 */
	public List queryBySql(String module, String sqlId, String... args) {
		Session session = HibernateSessionFactory.getSession();
		String sql = QueryXmlReader.getSql(module, sqlId);
		sql = CommonUtil.replaceArgs(sql, args);
		SQLQuery query = session.createSQLQuery(sql);
		return query.list();
		
	}
}