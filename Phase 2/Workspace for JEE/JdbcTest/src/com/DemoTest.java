package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DemoTest {

	public static void main(String[] args) {
		try {
		//Class.forName("com.mysql.jdbc.Driver");	// mysql 5.x version 
		Class.forName("com.mysql.cj.jdbc.Driver"); // Mysql 8.x version 
		System.out.println("Driver Loaded...");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university_batch", "root", "root@123");
		System.out.println("Connected to database");
		//Statement stmt = con.createStatement();
		// Store the records with statement 
//		int res = stmt.executeUpdate("insert into employee values(5,'Balaji',32000)");		// DML Insert, Delete and Update 
//		if(res>0) {
//			System.out.println("Record inserted successfully");
//		}
		Scanner sc = new Scanner(System.in);
		// Insert query using prepredstatement 
//		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
//		System.out.println("Enter the id");
//		int id = sc.nextInt();
//			pstmt.setInt(1, id); // ? count from left to right 1 to n 
//		System.out.println("Enter the name");
//		String name = sc.next();
//			pstmt.setString(2, name);
//		System.out.println("Enter the salary ");
//		float salary = sc.nextFloat();
//			pstmt.setFloat(3, salary);
//		int res = pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record inserted successfully...");
//		}
		// delete the record with Statement 
//		int res = stmt.executeUpdate("delete from employee where id =1");
//		if(res>0) {
//			System.out.println("record deleted successfully");
//		}else {
//			System.out.println("record not present");
//		}
		// delete the record with preparedstatement 
//		PreparedStatement pstmt = con.prepareStatement("delete from employee where id = ?");
//		System.out.println("Enter the id to delete the record");
//		int id = sc.nextInt();
//		pstmt.setInt(1, id);
//		int res = pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record deleted successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		       
		
		// update the record 
//		int res = stmt.executeUpdate("update employee set salary = 45000 where id =2");
//		if(res>0) {
//			System.out.println("record updated successfully");
//		}else {
//			System.out.println("record not present");
//		}
		
		// udpate the record with preparedstatement 
//		PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where id = ?");
//		System.out.println("Enter the id");
//		int id = sc.nextInt();
//		pstmt.setInt(2, id);
//		System.out.println("Enter the salary");
//		float salary = sc.nextFloat();
//		pstmt.setFloat(1, salary);
//		int res = pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record updated successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		
		
		// Retrieve using Statement  
//		ResultSet rs = stmt.executeQuery("select * from employee");
//		while(rs.next()) {
//			//System.out.println(" id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
//			System.out.println(" id is "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
//		}
		
		PreparedStatement pstmt = con.prepareStatement("select * from employee ");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println(" id is "+rs.getInt("id")+" Name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
		}
		pstmt.close();
		con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
