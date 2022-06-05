package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Student;

public class DemoTest {

	public static void main(String[] args) {
	Configuration con  = new Configuration();
	con.configure("hibernate.cfg.xml");
	SessionFactory sf = con.buildSessionFactory();
	Session session = sf.openSession();
	Transaction tran = session.getTransaction();
	tran.begin();
		Student s1 = new Student();
		s1.setSid(1);
		s1.setSname("Ramesh");
		int marks[]= {80,86,56,90,76};
		s1.setMarks(marks);
		session.save(s1);
	tran.commit();
	System.out.println("Record stored successfully");
	}

}
