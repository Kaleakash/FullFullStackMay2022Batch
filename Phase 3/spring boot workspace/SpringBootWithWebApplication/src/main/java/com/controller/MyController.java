package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "abc")
	public String openDemo1Page() {
		System.out.println("I came in demo1Page method");
		return "demo1";
	}
	
	@RequestMapping(value = "xyz")
	public String openDemo2Page() {
		System.out.println("I came in demo2Page method");
		return "demo2";
	}
	
	@RequestMapping(value = "login")
	public String loginPageOpen() {
		return "login";
	}
	
	@RequestMapping(value = "checkUser",method = RequestMethod.POST)
	public String checkUserDetails(HttpServletRequest req) {   // DI for HttpServletRequest
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		if(email.equals("raj@gmail.com") && password.equals("1234")) {
			return "success";					// success.jsp 
		}else {
			return "failure";					// failure.jsp 
		}
	}
}
