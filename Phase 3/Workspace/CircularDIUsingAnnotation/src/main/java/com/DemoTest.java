package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {

	public static void main(String[] args) {

AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
	
	A obj1 = (A)ac.getBean("a");
	obj1.dis1();
	
	B obj2 = (B)ac.getBean("b");
	obj2.dis2();
	}

}
