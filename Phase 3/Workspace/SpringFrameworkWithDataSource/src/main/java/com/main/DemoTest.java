package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Product;
import com.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
//		Product p = (Product)ac.getBean("product");
//		p.setPid(5);
//		p.setPname("Mobile");
//		p.setPrice(45000);
//		
//		ProductService ps = (ProductService)ac.getBean("productService");
//		String result = ps.storeProduct(p);
//		System.out.println(result);
		
		ProductService ps = (ProductService)ac.getBean("productService");
		List<Product> listOfProdut = ps.getAllProducts();
		for(Product p :listOfProdut) {
			System.out.println(p);				// it will call the toString method 
			}
	}

}
