package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.bean.Login;

public class LoginDao {

	public int createLoginDetails(Login ll) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university_batch", "root", "root@123");
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
}
