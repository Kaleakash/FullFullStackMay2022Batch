package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
@EnableJpaRepositories(basePackages = "com.repository")
public class SpringbootWithDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithDockerApplication.class, args);
		System.out.println("Server running on port number 9090");
	}

}
