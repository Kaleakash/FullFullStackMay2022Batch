package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("first")
public class FirstController {

	@GetMapping(value = "/")
	public String greeting() {
		return "Welcome to Spring boot with micro service from first client";
	}
	
}
