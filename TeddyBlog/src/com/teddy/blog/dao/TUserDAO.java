package com.teddy.blog.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.teddy.blog.bean.TUser;
import com.teddy.blog.dao.base.BaseHibernateDAO;

/**
 * A data access object (DAO) providing persistence and search support for TUser
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.teddy.blog.bean.TUser
 * @author MyEclipse Persistence Tools
 */

public class TUserDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(TUserDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String CELLPHONE = "cellphone";
	public static final String EMAIL = "email";
	public static final String SEX = "sex";
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";

	public void save(TUser transientInstance) {
		log.debug("saving TUser instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TUser persistentInstance) {
		log.debug("deleting TUser instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TUser findById(java.lang.Integer id) {
		log.debug("getting TUser instance with id: " + id);
		try {
			TUser instance = (TUser) getSession().get(
					"com.teddy.blog.bean.TUser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<TUser> findByExample(TUser instance) {
		log.debug("finding TUser instance by example");
		try {
			List<TUser> results = (List<TUser>) getSession()
					.createCriteria("com.teddy.blog.bean.TUser")
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
		log.debug("finding TUser instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TUser as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<TUser> findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List<TUser> findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List<TUser> findByCellphone(Object cellphone) {
		return findByProperty(CELLPHONE, cellphone);
	}

	public List<TUser> findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List<TUser> findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List<TUser> findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List<TUser> findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findAll() {
		log.debug("finding all TUser instances");
		try {
			String queryString = "from TUser";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TUser merge(TUser detachedInstance) {
		log.debug("merging TUser instance");
		try {
			TUser result = (TUser) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TUser instance) {
		log.debug("attaching dirty TUser instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TUser instance) {
		log.debug("attaching clean TUser instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}