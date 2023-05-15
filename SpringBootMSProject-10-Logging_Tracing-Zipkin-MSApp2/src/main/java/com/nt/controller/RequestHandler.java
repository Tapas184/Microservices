package com.nt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RequestHandler {

	@Autowired
	private RestTemplate template;
	
	private  final Logger logger = LoggerFactory.getLogger(RequestHandler.class);
	
	@GetMapping("/billing")
	public String billing() {
		logger.info("Entered into billing method");
		String response = template.getForObject("http://localhost:8988/payment", String.class);
		logger.info("Got response from payment APIs");
		return "billing is done,"+response;
	}
}//End of the class Requesthandler
