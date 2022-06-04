package com.dao;

import java.util.List;

import org.hibernate.Query;
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
	
	public int deleteEmployeeDetails(int id) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");		// load the database details as well as entity class 
		SessionFactory sf = con.buildSessionFactory();	// Connection in jdbc 
		Session session = sf.openSession();		// Statement and PreparedStatement 
		Transaction tran = session.getTransaction();
		Employee emp	= session.get(Employee.class, id);
		if(emp==null) {
			return 0;
		}else {
			tran.begin();
				session.delete(emp);    // delete query 
			tran.commit();
			return 1;
		}
	}
	
	public int updateEmployeeDetails(Employee e) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");		// load the database details as well as entity class 
		SessionFactory sf = con.buildSessionFactory();	// Connection in jdbc 
		Session session = sf.openSession();		// Statement and PreparedStatement 
		Transaction tran = session.getTransaction();
		Employee emp	= session.get(Employee.class, e.getId());
		if(emp==null) {
			return 0;
		}else {
			tran.begin();
				emp.setSalary(e.getSalary());
				session.update(emp);              // update query 
			tran.commit();
			return 1;
		}
	}
	
	public Employee findEmployeeById(int id) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");		// load the database details as well as entity class 
		SessionFactory sf = con.buildSessionFactory();	// Connection in jdbc 
		Session session = sf.openSession();		// Statement and PreparedStatement 
		Employee emp	= session.get(Employee.class, id);
		return emp;
	}
	
	public 	List<Employee>	getAllEmployee() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");		// load the database details as well as entity class 
		SessionFactory sf = con.buildSessionFactory();	// Connection in jdbc 
		Session session = sf.openSession();		// Statement and PreparedStatement 
			Query qry= session.createQuery("select emp from Employee emp");
			List<Employee> listOfEmp  = qry.list();
			return listOfEmp;
	}
}
