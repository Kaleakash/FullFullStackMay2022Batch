package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithRestapiApplication.class, args);
		System.out.println("Server running on port number 9090");
	}

}
