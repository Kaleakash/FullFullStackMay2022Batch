package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;

@RestController					// @Controller + @ResponseBody
public class SampleController {
	
	@RequestMapping(value = "/")		// http://localhost:8080			// by default plain text 
	public String sayHello() {
		return "Welcome to Spring boot with Rest full web service";
	}
	// http://localhost:8080/plain 
	
	@RequestMapping(value = "/plain",produces = MediaType.TEXT_PLAIN_VALUE,method = RequestMethod.GET)		// http://localhost:8080
	public String sayPlainText() {
		return "<h1>Welcome to Spring boot </h1>";
	}
	// http://localhost:8080/html
	
	@RequestMapping(value = "/html",produces = MediaType.TEXT_HTML_VALUE,method = RequestMethod.GET)		// http://localhost:8080
	public String sayHTML() {
		return "<h1>Welcome to Spring boot </h1>";
	}
	// http://localhost:8080/xml
	@RequestMapping(value = "/xml",produces = MediaType.TEXT_XML_VALUE,method = RequestMethod.GET)		// http://localhost:8080
	public String sayXML() {
		return "<h1>Welcome to Spring boot </h1>";
	}
	
	// http://localhost:8080/empInfo
	
	@RequestMapping(value = "empInfo",produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.GET)
	public Employee getEmployeeInfo() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Raj");
		emp.setSalary(14000);
		return emp;
	}
	
	@RequestMapping(value = "employees",produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.GET)
	public List<Employee> getAllEmployeeInfo() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Raj");
		emp.setSalary(14000);
		
		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setName("Ramesh");
		emp1.setSalary(18000);
		listOfEmp.add(emp1);
		listOfEmp.add(emp);
		return listOfEmp;
	}
	
	// http://localhhost:8080/singleQuery?name=Raj
	
	@RequestMapping(value = "singleQuery")
	public String singleQueryValue(@RequestParam("name") String fname) {
		return "Welcome Spring boot with query param concept"+fname;
	}
	// http://localhost:8080/pathValue/Raj
	
	@RequestMapping(value = "pathValue/{name}")
	public String singlePathValue(@PathVariable("name") String fname) {
		return "Welcome to Spring boot with path param concept "+fname;
	}
	
	// http://localhost:8080/postMethod 
	
	@RequestMapping(value = "postMethod",method = RequestMethod.POST)
	public String simplePostmethod() {
		return "Welcome to Post method";
	}
	
	// http://localhost:8080/storeEmployee        through body part  {"id":100,"name":"Ramesh","salary":12000}
	@RequestMapping(value = "storeEmployee",consumes = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.POST)
	public String storeEmployee(@RequestBody Employee emp) {
		System.out.println("id is "+emp.getId());
		System.out.println("name is "+emp.getName());
		System.out.println("salary is "+emp.getSalary());				// write logic to store the record 
		return "Welcome user "+emp.getName();
	}
	
	// http://localhost:8080/updateEmployee        through body part  {"id":100,"name":"Ramesh","salary":12000}
		@RequestMapping(value = "updateEmployee",consumes = MediaType.APPLICATION_JSON_VALUE,
				method = RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_VALUE)
		public Employee updateEmployee(@RequestBody Employee emp) {
			emp.setSalary(emp.getSalary()+3000);					// write the logic to update the record 
			return emp;
		}
		
		// http://localhost:8080/deleteEmployee/100
		@RequestMapping(value = "deleteEmployee/{id}",method = RequestMethod.DELETE)
		public String deleteEmployeeInfo(@PathVariable("id") int id) {
			return "Employee details with id "+id+" deleted successfully";
		}
		
}
