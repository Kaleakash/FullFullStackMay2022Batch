package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> findAllEmployee() {
		return employeeRepository.findAll();
	}
	
	public String storeEmployee(Employee emp) {
		Optional<Employee> e = 	employeeRepository.findById(emp.getId());
		if(e.isPresent()) {
				return "Record didn't store because id must be unique";
		}else {
				employeeRepository.save(emp);
				return "Record stored successfully";
		}
	}
	
	public String updateEmployeeSalary(Employee emp) {					// id and salary 
		Optional<Employee> e = 	employeeRepository.findById(emp.getId());
		if(e.isPresent()) {
								Employee employee = e.get();
								employee.setSalary(emp.getSalary());			// replace old salary by new salary 
								employeeRepository.saveAndFlush(employee);
								return "Employee salary updated successfully";
		}else {
				
				return "Record not present";
		}
	}
	
	public String deleteEmloyee(int id) {
		Optional<Employee> e = 	employeeRepository.findById(id);
		if(e.isPresent()) {
								Employee employee = e.get();
								employeeRepository.delete(employee);
								return "Employee record deleted successfully";
		}else {
				return "Record not present";
		}
	}
}
