package com.teddy.blog.dao;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.teddy.blog.bean.TComment;
import com.teddy.blog.dao.base.BaseHibernateDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * TComment entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.teddy.blog.bean.TComment
 * @author MyEclipse Persistence Tools
 */

public class TCommentDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TCommentDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String CONTENT = "content";
	public static final String ARTICLEID = "articleid";
	public static final String CREATORID = "creatorid";

	public void save(TComment transientInstance) {
		log.debug("saving TComment instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TComment persistentInstance) {
		log.debug("deleting TComment instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TComment findById(java.lang.Integer id) {
		log.debug("getting TComment instance with id: " + id);
		try {
			TComment instance = (TComment) getSession().get(
					"com.teddy.blog.bean.TComment", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TComment> findByExample(TComment instance) {
		log.debug("finding TComment instance by example");
		try {
			List<TComment> results = (List<TComment>) getSession()
					.createCriteria("com.teddy.blog.bean.TComment")
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
		log.debug("finding TComment instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TComment as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<TComment> findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List<TComment> findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List<TComment> findByArticleid(Object articleid) {
		return findByProperty(ARTICLEID, articleid);
	}

	public List<TComment> findByCreatorid(Object creatorid) {
		return findByProperty(CREATORID, creatorid);
	}

	public List findAll() {
		log.debug("finding all TComment instances");
		try {
			String queryString = "from TComment";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TComment merge(TComment detachedInstance) {
		log.debug("merging TComment instance");
		try {
			TComment result = (TComment) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TComment instance) {
		log.debug("attaching dirty TComment instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TComment instance) {
		log.debug("attaching clean TComment instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}