package com.service;

import java.util.List;

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
	
	public String incrementSalary(Employee emp) {
		float oldSalary = employeeDao.findEmployeeSalary(emp.getId());
		if(oldSalary==0) {
				return "Employee not exists";
		}else if(emp.getSalary()>oldSalary) {
						if(employeeDao.updateSalary(emp)>0) {
							return "Salary incremented successfully";
						}else {
							return "Salaary didn't update";
						}
		}else {
				return "Salary must be > previous salary";
		}
	}
	
	public String deleteEmloyeeInfo(int id) {
			if(employeeDao.deleteEmployeeInfo(id)>0) {
				return "Emloyee record deleted successfully";
			}else {
				return "Employee not exists";
			}
	}
	
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
}
