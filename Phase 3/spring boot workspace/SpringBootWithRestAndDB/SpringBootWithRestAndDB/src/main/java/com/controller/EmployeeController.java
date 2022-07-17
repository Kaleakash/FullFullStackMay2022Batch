package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeService employeeService;
	
	// http://localhost:8080/employeeDetails 
	@RequestMapping(value = "employeeDetails",
		produces = MediaType.APPLICATION_JSON_VALUE,
		method = RequestMethod.GET)
	public List<Employee> getAllEmployee() {
		return employeeService.findAllEmployee();
	}
	
	// http://localhost:8080/storeEmployee 		{"id":108,"name":"Vinay","salary":22000}
	@RequestMapping(value = "storeEmployee",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public String storeEmployee(@RequestBody Employee emp) {
		return employeeService.storeEmployee(emp);
	}
	
	
	// http://localhost:8080/updateEmployee 
	@RequestMapping(value = "updateEmployee",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.PUT)
	public String updateEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmployeeSalary(emp);
	}
	
	// http://localhost:8080/deleteRecord/100
	@RequestMapping(value = "deleteRecord/{id}",
			method = RequestMethod.DELETE)
	public String deleteEmployeeRecord(@PathVariable("id") int id) {
		return employeeService.deleteEmloyee(id);
	}
	
}
