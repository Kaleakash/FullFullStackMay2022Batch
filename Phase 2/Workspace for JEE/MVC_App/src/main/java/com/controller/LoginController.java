package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Login;
import com.service.LoginService;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
			HttpSession hs = request.getSession();
		response.setContentType("text/html");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String typeOfUser = request.getParameter("typeOfUser");
		
		Login ll = new Login();
		ll.setEmail(email);
		ll.setPassword(password);
		ll.setTypeOfUser(typeOfUser);
		
		LoginService ls = new LoginService();
		String result = ls.checkUser(ll);
		RequestDispatcher rd1 = request.getRequestDispatcher("adminHome.jsp");
		RequestDispatcher rd2 = request.getRequestDispatcher("index.jsp");
		RequestDispatcher rd3 = request.getRequestDispatcher("userHome.jsp");
		if(result.equals("adminSuccess")) {
				hs.setAttribute("admin", ll.getEmail());
				rd1.forward(request, response);
		}else if(result.equals("userSuccess")){
				hs.setAttribute("user", ll.getEmail());
				rd3.forward(request, response);
		}else {
				pw.println("Invalid emailId or Password");
				rd2.include(request, response);
		}
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		// Receive the value from view ie jsp 
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		// create the JavaBean class object and set the value which receive from view. 
		Login ll = new Login();
		ll.setEmail(email);
		ll.setPassword(password);
		
		// Now we will create the Service class object 
		LoginService ls = new LoginService();
		
		// pass the login object to service class 
		String result = ls.createUser(ll);
		pw.println(result);
		RequestDispatcher rd1 = request.getRequestDispatcher("index.jsp");
		
		rd1.include(request, response);
		
	}

}

