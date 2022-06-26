package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration			// like is beans.xml
@ComponentScan(basePackages = "com")//<context:component-scan base-package="com"></context:component-scan>
public class MyConfiguration {

	
	@Bean(value = "pp")
	public Product getProductInstance() {
		Product pp = new Product();		// object creation done by us but maintain by container 
		return pp;
	}
}
