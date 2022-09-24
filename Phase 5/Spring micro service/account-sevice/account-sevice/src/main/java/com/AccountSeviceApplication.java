package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EntityScan(basePackages = "com.bean")
@EnableJpaRepositories
public class AccountSeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountSeviceApplication.class, args);
		System.out.println("Account micro service application running port number 8383");
	}

}
