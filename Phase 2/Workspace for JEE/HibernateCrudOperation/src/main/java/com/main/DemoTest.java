package com.main;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		// Store Employee records 
		Employee emp1 = new Employee(102, "Mahesh", 16000);
		EmployeeService es = new EmployeeService();
		String result = es.storeEmployeeDetails(emp1);
		System.out.println(result);
	}

}
