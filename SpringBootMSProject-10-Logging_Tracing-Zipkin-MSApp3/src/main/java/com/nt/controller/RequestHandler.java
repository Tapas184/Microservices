package com.nt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHandler {

	
	private  final Logger logger = LoggerFactory.getLogger(RequestHandler.class);
	
	@GetMapping("/payment")
	public String payment() {
		logger.info("Entered into payment method");
		return "payment is done";
	}
}//End of the class Requesthandler
