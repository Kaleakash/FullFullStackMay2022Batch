package com.service;

import com.bean.Login;

public class LoginService {
			// one or more business method required for 
	
	
	public String checkUser(Login login) {
		if(login.getEmail().equals("raj@gmail.com") && login.getPassword().equals("123")) {
			return "success";
		}else {
			return "failure";
		}
	}
}
