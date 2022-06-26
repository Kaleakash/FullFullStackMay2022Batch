package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res = new ClassPathResource("beans.xml");
		BeanFactory f1 = new XmlBeanFactory(res);
		Address add1 = (Address)f1.getBean("add1");
		System.out.println(add1);
		Employee emp1 = (Employee)f1.getBean("emp1");
		System.out.println(emp1);
	}

}
