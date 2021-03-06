package net.teddy.dao.impl;

import java.util.List;

import net.teddy.dao.base.BaseHibernateDAO;
import net.teddy.model.impl.TArticle;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * TArticle entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see net.teddy.model.impl.TArticle
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
					"net.teddy.model.impl.TArticle", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TArticle instance) {
		log.debug("finding TArticle instance by example");
		try {
			List results = getSession()
					.createCriteria("net.teddy.model.impl.TArticle")
					.add(Example.create(instance)).list();
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

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findBySummary(Object summary) {
		return findByProperty(SUMMARY, summary);
	}

	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List findByCreatorId(Object creatorId) {
		return findByProperty(CREATOR_ID, creatorId);
	}

	public List findByModifierId(Object modifierId) {
		return findByProperty(MODIFIER_ID, modifierId);
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