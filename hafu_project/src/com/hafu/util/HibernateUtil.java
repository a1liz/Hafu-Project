package com.hafu.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Configuration configuration;
	private static SessionFactory sessionFactory;
	static{
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
	}
	public static Session openSession(){
		return sessionFactory.openSession();
	}
}
