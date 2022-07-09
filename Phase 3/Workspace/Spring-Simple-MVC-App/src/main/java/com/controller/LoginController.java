package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Login;
import com.service.LoginService;

@Controller
public class LoginController {

	
	// checking email id and password ie hardcoding emailid and password 
	@RequestMapping(value = "checkUser",method = RequestMethod.POST)
	public ModelAndView checkUserDetails(HttpServletRequest req) {  // DI for Request Object 
			String email = req.getParameter("email");
			String pass = req.getParameter("pass");
			ModelAndView mav = new ModelAndView();
			if(email.equals("raj@gmail.com") && pass.equals("123")) {
					mav.setViewName("success.jsp");
			}else {
					mav.setViewName("failure.jsp");
			}
			return mav;
	}
	@Autowired
	LoginService loginService;	
	@RequestMapping(value = "signIn",method = RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest req,Login ll) {    // di for request and login class object 
		ll.setEmail(req.getParameter("email"));
		ll.setPassword(req.getParameter("password"));
		System.out.println(ll.getEmail()+" "+ll.getPassword());
		String result = loginService.signIn(ll);
		ModelAndView mav = new ModelAndView();
		if(result.equals("success")) {
				mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
	@RequestMapping(value = "signUp",method = RequestMethod.POST)
	public ModelAndView signUp(HttpServletRequest req,Login ll) {
		ll.setEmail(req.getParameter("email"));
		ll.setPassword(req.getParameter("password"));
		String result = loginService.signUp(ll);
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("login.jsp");
		mav.addObject("msg", result);       // model scope it equalt to request.setAttribute("msg",result);
		return mav;
	}
	
}
