package com.service;

import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {

	EmployeeDao ed = new EmployeeDao();
	
	public String storeEmployeeDetails(Employee emp) {
		if(ed.storeEmployeeDetails(emp)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
	}
	
	public String deleteEmployee(int id) {
		if(ed.deleteEmployeeDetails(id)>0) {
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}
	
	public String updateEmployee(Employee emp) {
		if(ed.updateEmployeeDetails(emp)>0) {
			return "Record updated successfully";
		}else {
			return "Record didn't update";
		}
	}
	
	public Employee findEmployeeById(int id) {
		return ed.findEmployeeById(id);
	}
	
	public List<Employee> getAllEmployee() {
		return ed.getAllEmployee();
	}
}
