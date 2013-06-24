package com.teddy.blog.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.teddy.blog.bean.TKeyword;
import com.teddy.blog.dao.base.BaseHibernateDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * TKeyword entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.teddy.blog.bean.TKeyword
 * @author MyEclipse Persistence Tools
 */

public class TKeywordDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TKeywordDAO.class);
	// property constants
	public static final String ARTICLEID = "articleid";
	public static final String KEYWORD = "keyword";

	public void save(TKeyword transientInstance) {
		log.debug("saving TKeyword instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TKeyword persistentInstance) {
		log.debug("deleting TKeyword instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TKeyword findById(java.lang.Integer id) {
		log.debug("getting TKeyword instance with id: " + id);
		try {
			TKeyword instance = (TKeyword) getSession().get(
					"com.teddy.blog.bean.TKeyword", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TKeyword> findByExample(TKeyword instance) {
		log.debug("finding TKeyword instance by example");
		try {
			List<TKeyword> results = (List<TKeyword>) getSession()
					.createCriteria("com.teddy.blog.bean.TKeyword")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TKeyword instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TKeyword as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<TKeyword> findByArticleid(Object articleid) {
		return findByProperty(ARTICLEID, articleid);
	}

	public List<TKeyword> findByKeyword(Object keyword) {
		return findByProperty(KEYWORD, keyword);
	}

	public List findAll() {
		log.debug("finding all TKeyword instances");
		try {
			String queryString = "from TKeyword";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TKeyword merge(TKeyword detachedInstance) {
		log.debug("merging TKeyword instance");
		try {
			TKeyword result = (TKeyword) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TKeyword instance) {
		log.debug("attaching dirty TKeyword instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TKeyword instance) {
		log.debug("attaching clean TKeyword instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}