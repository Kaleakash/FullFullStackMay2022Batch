package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("second")
public class SecondController {

	@GetMapping(value="/")
	public String greeting() {
		return "Welcome Spring boot with micro service for second client app";
	}
}
