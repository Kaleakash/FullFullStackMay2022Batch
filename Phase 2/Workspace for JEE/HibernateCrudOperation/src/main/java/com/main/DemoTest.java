package com.main;

import java.util.Iterator;
import java.util.List;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		// Store Employee records 
//		Employee emp1 = new Employee(102, "Mahesh", 16000);
//		EmployeeService es = new EmployeeService();
//		String result = es.storeEmployeeDetails(emp1);
//		System.out.println(result);
		
		// Delete Employee Records 	
//		EmployeeService es = new EmployeeService();
//		String result = es.deleteEmployee(100);
//		System.out.println(result);
		
		// Update Employee records 
//		Employee emp = new Employee();
//		emp.setId(102);
//		emp.setSalary(55000);
//		EmployeeService es = new EmployeeService();
//		String result = es.updateEmployee(emp);
//		System.out.println(result);
		
		// Find employee using id attribute with pk 
//		EmployeeService es = new EmployeeService();
//		Employee emp = es.findEmployeeById(100);
//		if(emp==null) {
//		System.out.println("Record not present");	
//		}else {
//		System.out.println(emp);               // it will call toString method. 
//		}
		
		// Retrieve all records 
		
		EmployeeService es = new EmployeeService();
		List<Employee> listOfEmp = es.getAllEmployee();
		System.out.println("Number of records are "+listOfEmp.size());
		Iterator<Employee> li  = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			System.out.println(emp);
		}
	}

}
