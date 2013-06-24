package com.teddy.blog.dao;

import java.sql.Timestamp;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.teddy.blog.bean.TArticle;
import com.teddy.blog.dao.base.BaseHibernateDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * TArticle entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.teddy.blog.bean.TArticle
 * @author MyEclipse Persistence Tools
 */

public class TArticleDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TArticleDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String SUMMARY = "summary";
	public static final String CONTENT = "content";
	public static final String CREATOR_ID = "creatorId";
	public static final String MODIFIER_ID = "modifierId";
	public static final String READCOUNT = "readcount";

	public void save(TArticle transientInstance) {
		log.debug("saving TArticle instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TArticle persistentInstance) {
		log.debug("deleting TArticle instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TArticle findById(java.lang.Integer id) {
		log.debug("getting TArticle instance with id: " + id);
		try {
			TArticle instance = (TArticle) getSession().get(
					"com.teddy.blog.bean.TArticle", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TArticle> findByExample(TArticle instance) {
		log.debug("finding TArticle instance by example");
		try {
			List<TArticle> results = (List<TArticle>) getSession()
					.createCriteria("com.teddy.blog.bean.TArticle")
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
		log.debug("finding TArticle instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TArticle as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<TArticle> findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List<TArticle> findBySummary(Object summary) {
		return findByProperty(SUMMARY, summary);
	}

	public List<TArticle> findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List<TArticle> findByCreatorId(Object creatorId) {
		return findByProperty(CREATOR_ID, creatorId);
	}

	public List<TArticle> findByModifierId(Object modifierId) {
		return findByProperty(MODIFIER_ID, modifierId);
	}

	public List<TArticle> findByReadcount(Object readcount) {
		return findByProperty(READCOUNT, readcount);
	}

	public List findAll() {
		log.debug("finding all TArticle instances");
		try {
			String queryString = "from TArticle";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TArticle merge(TArticle detachedInstance) {
		log.debug("merging TArticle instance");
		try {
			TArticle result = (TArticle) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TArticle instance) {
		log.debug("attaching dirty TArticle instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TArticle instance) {
		log.debug("attaching clean TArticle instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}