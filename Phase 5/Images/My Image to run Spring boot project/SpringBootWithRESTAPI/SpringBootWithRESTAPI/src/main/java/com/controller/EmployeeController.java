package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	// http://localhost:9090/employee/say
	@GetMapping(value = "say")
	public String sayHello() {
		return "Welcome to Spring boot with rest api with docker";
	}
	// http://localhost:9090/employee/findEmployees 
	@GetMapping(value = "findEmployees",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployee() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(1, "ravi", 12000));
		listOfEmp.add(new Employee(2, "ramesh", 15000));
		listOfEmp.add(new Employee(3, "lokesh", 18000));
		return listOfEmp;
	}
}
