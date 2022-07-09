package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.dao.LoginDao;

@Service
public class LoginService {

	@Autowired
	LoginDao loginDao;
	public String signIn(Login ll) {
			StringBuffer sb = new StringBuffer(ll.getPassword());
			ll.setPassword(sb.reverse().toString());
			
			if(loginDao.signIn(ll)>0) {
				return "success";
			}else {
				return "failure";
			}
	}
	public String signUp(Login ll) {
		StringBuffer sb = new StringBuffer(ll.getPassword());
		ll.setPassword(sb.reverse().toString());
		
		if(loginDao.signUp(ll)>0) {
			return "Account created successfully";
		}else {
			return "Account didn't create email id must be unique";
		}
	}
}
