package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Login;
import com.resource.DbResource;

public class LoginDao {

	public int createLoginDetails(Login ll) {
		try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university_batch", "root", "root@123");
		Connection con = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?)");
		pstmt.setString(1, ll.getEmail());
		pstmt.setString(2, ll.getPassword());
		int res = pstmt.executeUpdate();
		return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public boolean checkLoginDetails(Login login) {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university_batch", "root", "root@123");
			Connection con = DbResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from login where email = ? and password = ?");
			pstmt.setString(1, login.getEmail());
			pstmt.setString(2, login.getPassword());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return false;
	} 
}
