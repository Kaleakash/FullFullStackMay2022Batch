package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class EmployeeDao {

	
	public int storeEmployeeDetails(Employee emp) {
		try {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");		// load the database details as well as entity class 
			SessionFactory sf = con.buildSessionFactory();	// Connection in jdbc 
			Session session = sf.openSession();		// Statement and PreparedStatement 
			Transaction tran = session.getTransaction();
			
			tran.begin();
				session.save(emp);							// it is equal to insert query 
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
}
