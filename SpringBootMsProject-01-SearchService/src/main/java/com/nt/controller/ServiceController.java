package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
	
	@GetMapping("/display")
	public String showMsg() {
		return "Welcome to EurekaServer";
	}

}
