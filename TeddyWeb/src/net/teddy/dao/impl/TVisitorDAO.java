package net.teddy.dao.impl;

import java.util.List;

import net.teddy.dao.interfaces.BaseHibernateDAO;
import net.teddy.model.impl.TVisitor;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * TVisitor entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see net.teddy.model.impl.TVisitor
 * @author MyEclipse Persistence Tools
 */

public class TVisitorDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TVisitorDAO.class);
	// property constants
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	public static final String DESCRIPTION = "description";
	public static final String IPADDRESS = "ipaddress";

	public void save(TVisitor transientInstance) {
		log.debug("saving TVisitor instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TVisitor persistentInstance) {
		log.debug("deleting TVisitor instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TVisitor findById(java.lang.Integer id) {
		log.debug("getting TVisitor instance with id: " + id);
		try {
			TVisitor instance = (TVisitor) getSession().get(
					"net.teddy.dao.TVisitor", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TVisitor instance) {
		log.debug("finding TVisitor instance by example");
		try {
			List results = getSession()
					.createCriteria("net.teddy.dao.TVisitor")
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
		log.debug("finding TVisitor instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TVisitor as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findByIpaddress(Object ipaddress) {
		return findByProperty(IPADDRESS, ipaddress);
	}

	public List findAll() {
		log.debug("finding all TVisitor instances");
		try {
			String queryString = "from TVisitor";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TVisitor merge(TVisitor detachedInstance) {
		log.debug("merging TVisitor instance");
		try {
			TVisitor result = (TVisitor) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TVisitor instance) {
		log.debug("attaching dirty TVisitor instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TVisitor instance) {
		log.debug("attaching clean TVisitor instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}