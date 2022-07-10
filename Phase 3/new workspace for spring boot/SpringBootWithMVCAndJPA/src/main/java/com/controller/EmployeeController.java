package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Employee;
import com.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	@RequestMapping(value = "/")
	public String openPage() {
		return "index";
	}
	
	@RequestMapping(value = "/storeEmployee",method = RequestMethod.GET)
	public String storeEmployee() {
		return "storeEmployee";
	}
	@RequestMapping(value = "/storeEmloyeeDetails",method = RequestMethod.POST)
	public String storeEmloyee(HttpServletRequest req, Employee emp) {      // DI for request and Employee object 
			int id = Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			float salary = Float.parseFloat(req.getParameter("salary"));
			emp.setId(id);
			emp.setName(name);
			emp.setSalary(salary);
			String result = employeeService.storeEmployee(emp);
			//System.out.println(result);
			req.setAttribute("msg", result);      // store msg in request scope
			return "index";
			//return "storeEmployee";
	}
	// This is use to update the updateEmployee.jsp
	
	@RequestMapping(value = "/updateEmployee",method = RequestMethod.GET)
	public String updateEmployee() {
		return "updateEmployee";				// updateEmployee.jsp with contains form with id name salary 
	}
	@RequestMapping(value = "/updateSalary",method = RequestMethod.POST)
	public String updateEmployeeSalary(HttpServletRequest req, Employee emp) {
		int id = Integer.parseInt(req.getParameter("id"));
		float salary = Float.parseFloat(req.getParameter("salary"));
		emp.setId(id);
		emp.setSalary(salary);
		String result = employeeService.incrementSalary(emp);
		req.setAttribute("msg", result);
		return "index";
	}
	
	@RequestMapping(value = "/deleteEmployee",method = RequestMethod.GET)
	public String deleteEmployee() {
		return "deleteEmployee.jsp";						// deleteEmployee.jsp with form with id 
	}
	
	@RequestMapping(value="/deleteEmployeeRecord",method = RequestMethod.POST)
	public String deleteEmployeeRecord(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		String result = employeeService.deleteEmloyeeInfo(id);
		req.setAttribute("msg", result);
		return "index";
	}
	// it will call through index.html using hyperlink 
	
	@RequestMapping(value="/displayEmployee",method = RequestMethod.GET)
	public String displayEmployee(HttpServletRequest req) {
		List<Employee> listOfEmp = employeeService.getAllEmployee();
		req.setAttribute("listOfEmp", listOfEmp);
		return "displayEmployee";					// displayEmployee.jsp 
	}
}
