package com.service;

import com.bean.Login;
import com.dao.LoginDao;

public class LoginService {

	LoginDao ld = new LoginDao();
	public String checkUser(Login login) {
		
		if(login.getTypeOfUser().equals("Admin")) {
				if(login.getEmail().equals("admin@gmail.com") && login.getPassword().equals("admin")) {
					return "adminSuccess";
				}else {
					return "adminFailure";
				}
		}else {
		
			StringBuffer sb = new StringBuffer(login.getPassword());
			String reversePassword = sb.reverse().toString();
			login.setPassword(reversePassword);
			
			if(ld.checkLoginDetails(login)) {
				return "userSuccess";
			}else {
				return "userFailure";
			}
		}
		
		
	}
	
	public String createUser(Login login) {
		StringBuffer sb = new StringBuffer(login.getPassword());
		String reversePassword = sb.reverse().toString();
		login.setPassword(reversePassword);
		
		if(ld.createLoginDetails(login)>0) {
			return "Account Created successfully";
		}else {
			return "Account didn't create";
		}
		
	}
}
