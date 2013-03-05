package net.teddy.dao.interfaces;

import net.teddy.dao.HibernateSessionFactory;
import net.teddy.dao.interfaces.IBaseHibernateDAO;

import org.hibernate.Session;


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public abstract class BaseHibernateDAO implements IBaseHibernateDAO {
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();
	}
	
}