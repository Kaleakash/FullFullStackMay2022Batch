package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
		
		//Employee emp = new Employee();
		//emp.display();
		
		Resource res = new ClassPathResource("beans.xml");
		BeanFactory f1 = new XmlBeanFactory(res);
		
//		Employee emp1 = (Employee)f1.getBean("emp1");
//		emp1.display();
//		
//		Employee emp11 = (Employee)f1.getBean("emp1");
//		emp11.display();
//		
//		Employee emp2 = (Employee)f1.getBean("emp2");
//		emp2.display();
//		
//		Employee emp22 = (Employee)f1.getBean("emp2");
//		emp22.display();
		
		Employee emp3 = (Employee)f1.getBean("emp1");
		System.out.println(emp3);		// it will call toString method
		
		Employee emp4= (Employee)f1.getBean("emp3");
		System.out.println(emp4);
		
		Employee emp5= (Employee)f1.getBean("emp4");
		System.out.println(emp5);
		
		Employee emp6= (Employee)f1.getBean("emp5");
		System.out.println(emp6);
		
		Employee emp7= (Employee)f1.getBean("emp6");
		System.out.println(emp7);
	}

}
