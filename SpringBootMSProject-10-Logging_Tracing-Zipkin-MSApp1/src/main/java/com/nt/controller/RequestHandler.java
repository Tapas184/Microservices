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
	
	@GetMapping("/shopping")
	public String shoppring() {
		logger.info("Entered into shoping method");
		String response = template.getForObject("http://localhost:8987/billing", String.class);
		logger.info("Got response from billing APIs");
		return "Shoping is done,"+response;
	}
}//End of the class Requesthandler
