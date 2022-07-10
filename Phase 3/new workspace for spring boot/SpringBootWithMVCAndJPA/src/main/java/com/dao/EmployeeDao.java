package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {

	@Autowired									
	EntityManagerFactory emf;				// it is equal to SessionFactory in Hibernate 
	
	public int storeEmployeeDetails(Employee emp) {
			try {
				EntityManager manager = emf.createEntityManager();					// Session object in Hibernate 
				EntityTransaction tran = manager.getTransaction();						// Transaction in Hibernate 
				tran.begin();
						manager.persist(emp);                                                        	 // session.save(emp);
				tran.commit();
				return 1;
			} catch (Exception e) {
				System.out.println(e);
				return 0;
			}
	}
	
	public float findEmployeeSalary(int id) {
		EntityManager manager = emf.createEntityManager();
		Employee emp = manager.find(Employee.class, id);
		if(emp!=null) {
			return emp.getSalary();
		}else {
			return 0;
		}
	}
	
	public int updateSalary(Employee emp) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Employee emp1 = manager.find(Employee.class, emp.getId());
		if(emp1 != null) {
						tran.begin();
						emp1.setSalary(emp.getSalary());
						manager.merge(emp1);							// session.update(emp1);
						tran.commit();
						return 1;
		}else {
			return 0;
		}
	}
	
	public int deleteEmployeeInfo(int id) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		Employee emp = manager.find(Employee.class, id);
		if(emp!=null) {
						tran.begin();
								manager.remove(emp);                          //session.delete(emp);
						tran.commit();
						return 1;
		}else {
			return 0;
		}
	}
	
	
	public List<Employee> getAllEmployee() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select e from Employee e");    // JPQL Java Persistence Query Language 
		List<Employee> listOfEmp	= qry.getResultList();
		return listOfEmp;
	}
	
	
}
