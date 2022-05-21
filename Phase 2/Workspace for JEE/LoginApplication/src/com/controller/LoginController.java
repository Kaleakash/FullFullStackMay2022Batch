package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Login;
import com.service.LoginService;

/**
 * Servlet implementation class LoginController
 */

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		// it is use to receive the value from form. 
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		// then created JavaBean class object and set the value receive from form. 
		Login ll = new Login();
		ll.setEmail(email);
		ll.setPassword(password);
		
		//then create the service class object and call the service method. 
		LoginService ls = new LoginService();
		String result = ls.checkUser(ll);			// ls.checkUser(email,password,typeOfUser);
		
		RequestDispatcher rd1 = request.getRequestDispatcher("success.jsp");
		RequestDispatcher rd2 = request.getRequestDispatcher("failure.jsp");
		// then base upon the result it will redirect to another page. 
		if(result.equals("success")) {
				rd1.forward(request, response);
		}else {
				rd2.forward(request, response);
		}
	}

}



