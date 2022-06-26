package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

//@Autowired
private A obj2;

//	@Autowired
//	B(A obj2 ){
//		this.obj2 = obj2;
//	}
	public void dis2() {
		System.out.println("This is B class method");
	}

	public A getObj2() {
		return obj2;
	}

	@Autowired
	public void setObj2(A obj2) {
		this.obj2 = obj2;
	}
	
	
}

