package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
//@Autowired
private B obj1;				// Empty constructor 


//	@Autowired				// parameterized base DI 		
//	A(B obj1 ){
//		this.obj1 = obj1;
//	}
	public void dis1() {
		System.out.println("This is A class method");
	}


	public B getObj1() {
		return obj1;
	}

	@Autowired
	public void setObj1(B obj1) {
		this.obj1 = obj1;
	}
	
	
}
