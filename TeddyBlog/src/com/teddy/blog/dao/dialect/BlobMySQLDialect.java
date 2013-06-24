package com.teddy.blog.dao.dialect;

import java.sql.Types;

import org.hibernate.Hibernate;
import org.hibernate.dialect.MySQLDialect;

/**
 * fix the blob type problem of hibernate dialect for MySQL, or error occurs when query by sql
 * @author Administrator
 *
 */
public class BlobMySQLDialect extends MySQLDialect {
	    public BlobMySQLDialect () {
	        super();
	        registerHibernateType(Types.LONGVARBINARY, Hibernate.BLOB.getName());
	    }
}
