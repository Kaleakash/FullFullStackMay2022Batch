package com.service;

import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {

	EmployeeDao ed = new EmployeeDao();
	
	public String getEmployeeInService() {
		System.out.println("I Came Here in Service layer");
		// business logic 
		return ed.getEmployeDetails();
	}
	
	public Employee getEmployeeDetails(int id) {
		// business logic 
		
		return ed.findEmployee(id);
	}
	
	public List<Employee> getAllEmployeeDetails() {
		// business logic
		
		return ed.getAllEmployeeDetails();
	}
	
	public String updateEmployee(Employee emp) {
		if(ed.updateEmployee(emp)>0) {
			return "Successfully update";
		}else {
			return "Didn't update";
		}
	}
}
