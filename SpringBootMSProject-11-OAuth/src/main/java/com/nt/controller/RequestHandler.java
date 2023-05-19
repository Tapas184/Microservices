package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHandler {

	@GetMapping("/")
	public String showHome() {
		return"Welcome to Home";
	}
	@GetMapping("/after")
	public String login() {
		return "Welcome to Oauth2";
	}
	
}
