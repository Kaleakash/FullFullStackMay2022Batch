package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employees;
import com.bean.Technologies;

public class DemoTest {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		
		// Saving the record technologies through employee 
		Employees emp1 = new Employees();
		emp1.setEmpId(1);
		emp1.setEmpName("Raj");
		
		Technologies t1 = new Technologies();
		t1.setTid(100);
		t1.setTech("Java");
		
		Technologies t2 = new Technologies();
		t2.setTid(101);
		t2.setTech("Python");
		
		List<Technologies> listOfTech = new ArrayList<Technologies>();
		listOfTech.add(t1);		listOfTech.add(t2);
		emp1.setListOfTech(listOfTech);
		
		//Saveing the record of employee through technologies 
		Technologies t3 =new Technologies();
		t3.setTid(102);
		t3.setTech("Angular");
		
		Employees emp2 = new Employees();
		emp2.setEmpId(2);
		emp2.setEmpName("Ajay");
		
		Employees emp3 = new Employees();
		emp3.setEmpId(3);
		emp3.setEmpName("Vijay");
		
		List<Employees> listOfEmp = new ArrayList<Employees>();
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		
		t3.setListOfEmp(listOfEmp);
		
		tran.begin();
			session.save(emp1);
			session.save(t3);
		tran.commit();
		
		System.out.println("Record stored successfully");
		
		
	}

}
