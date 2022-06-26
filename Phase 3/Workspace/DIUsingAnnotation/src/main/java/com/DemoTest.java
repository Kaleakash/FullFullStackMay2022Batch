package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Address add1 = (Address)ac.getBean("address");
		Address add2 = (Address)ac.getBean("address");
		System.out.println(add1);
		System.out.println(add2);
		add1.setCity("Mumbai");
		add1.setState("Mh");
		System.out.println(add1);
		
		Employee emp1  = (Employee)ac.getBean("employee");
		System.out.println(emp1);
	}

}
