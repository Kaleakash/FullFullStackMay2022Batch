package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(scanBasePackages = "com")		// it will enable @Component annotation 
								// but both class must be part of same package. 
public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DemoTest.class, args);	// run spring boot application 
		//1st parameter reference of that class which contains @SpringBootApplication annotation 
		//2nd parameter command line arguments. 
		AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext();
		ac.scan("com");
		ac.refresh();
		Employee emp = (Employee)ac.getBean("employee");
		emp.displayEmpInfo();
		System.out.println(emp);   // it will call toString method 
	}

}
