package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("paytm")
public class PaytmController {

	@GetMapping(value = "/")
	public String paytmInfo() {
		return "Welcome to paytm service";
	}
	
	
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(value = "paytmbalance/{accno}")
	public String findAccountBalance(@PathVariable("accno") int accno) {
		return restTemplate.getForObject("http://localhost:8383/account/find/"+accno, String.class);
	}
}
