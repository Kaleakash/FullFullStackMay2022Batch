package com.example.paytmsevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com")
@EnableEurekaClient
public class PaytmSeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaytmSeviceApplication.class, args);
		System.out.println("paytm sevice running on port number 8484");
	}
	@Bean
	public RestTemplate restTempate() {
		return new RestTemplate();
	}
}
