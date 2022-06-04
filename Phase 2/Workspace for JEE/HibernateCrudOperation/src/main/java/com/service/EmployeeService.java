package com.service;

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
}
