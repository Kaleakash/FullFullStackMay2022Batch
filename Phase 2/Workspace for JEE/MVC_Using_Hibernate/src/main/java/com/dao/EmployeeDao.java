package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Employee;
import com.resource.DbSessionFactory;

public class EmployeeDao {

	
	public int storeEmployee(Employee emp) {
		try {
			SessionFactory sf = DbSessionFactory.getSessionFactoryReference();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(emp);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Employee> getAllEmployee() {
		SessionFactory sf = DbSessionFactory.getSessionFactoryReference();
		Session session = sf.openSession();
		Query qry = session.createQuery("select emp from Employee emp");
		List<Employee> listOfEmp = qry.list();
		return listOfEmp;
	}
}
