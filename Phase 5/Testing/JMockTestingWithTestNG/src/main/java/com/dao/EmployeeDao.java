package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.bean.Employee;

public class EmployeeDao {

	
	public String getEmployeDetails() {
		// coding to get the code from database 
		
		System.out.println("I came here in Dao layer");
		//return "This is Employee Details code from DB";
		return null;
	}
	
	public Employee findEmployee(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university_batch", "root", "root@123");
		PreparedStatement pstmt = con.prepareStatement("select * from employee where id = ?");
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			Employee emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getFloat(3));
			return emp;
		}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	public List<Employee> getAllEmployeeDetails() {
		/*
		 * 
		 * jdbc or orm code to get all employee details 
		 * 
		 */
		return null;
	}
	
	public int updateEmployee(Employee emp) {
		/*
		 * 
		 * 
		 * 
		 */
		return 0;
	}
}
