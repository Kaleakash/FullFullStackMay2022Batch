package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Product;
import com.service.ProductService;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    ProductService ps = new ProductService();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		HttpSession hs = request.getSession();
		List<Product> listOfProduct = ps.getAllProductDetails();
		hs.setAttribute("products", listOfProduct);
		response.sendRedirect("displayProduct.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		int pid = Integer.parseInt(request.getParameter("pid"));
		String pname = request.getParameter("pname");
		float price = Float.parseFloat(request.getParameter("price"));
		response.setContentType("text/html");
		
		Product product = new Product();
		product.setPid(pid);
		product.setPname(pname);
		product.setPrice(price);
		
		String result = ps.storeProduct(product);
		pw.print(result);
		RequestDispatcher rd1 = request.getRequestDispatcher("storeProduct.jsp");
		rd1.include(request, response);
		
	}

}



