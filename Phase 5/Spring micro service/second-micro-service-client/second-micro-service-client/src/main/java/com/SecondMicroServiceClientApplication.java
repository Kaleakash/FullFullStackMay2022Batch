package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SecondMicroServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondMicroServiceClientApplication.class, args);
		System.out.println("Second client running on port number 8282");
	}

}
