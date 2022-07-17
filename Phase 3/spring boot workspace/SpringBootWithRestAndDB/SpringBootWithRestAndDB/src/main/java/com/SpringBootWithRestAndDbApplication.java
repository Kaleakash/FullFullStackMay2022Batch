package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
@EnableJpaRepositories(basePackages = "com.repository")
public class SpringBootWithRestAndDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithRestAndDbApplication.class, args);
		System.out.println("Server up on port number 8080");
	}

}
