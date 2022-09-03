package com.service;

import com.dao.EmployeeDao;

public class EmployeeService {

	EmployeeDao ed = new EmployeeDao();
	
	public String getEmployeeInService() {
		
		return ed.getEmployeDetails();
	}
}
