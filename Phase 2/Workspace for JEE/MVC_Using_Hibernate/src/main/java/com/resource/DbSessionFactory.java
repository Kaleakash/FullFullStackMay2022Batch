package com.resource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbSessionFactory {

	
//	public static SessionFactory getSessionFactoryReference() {
//		Configuration con = new Configuration();
//		con.configure("hibernate.cfg.xml");
//		SessionFactory sf = con.buildSessionFactory();
//		return sf;
//	} 
	
	private static SessionFactory sf;
	// it will call only once 
	static {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		sf = con.buildSessionFactory();
	}
	public static SessionFactory getSessionFactoryReference() {
		return sf;
	} 
}
