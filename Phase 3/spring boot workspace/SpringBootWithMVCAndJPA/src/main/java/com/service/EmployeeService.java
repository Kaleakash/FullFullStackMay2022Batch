package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public String storeEmployee(Employee emp) {
			if(emp.getSalary()<10000) {
					return "Salary must be > 10,000";
			}else if(employeeDao.storeEmployeeDetails(emp)>0) {
					return "Record inserted successfully";
			}else {
					return "Record didn't insert";
			}
	}
}
