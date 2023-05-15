package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.producer.Producer;

@RestController
public class ProducerHandler {
	
	@Autowired
	private Producer producer;

	@GetMapping("/send")
	public String sendMsg(@RequestParam("message") String message) {
		String sendMessage = producer.sendMessage(message);
		return"<h1>"+sendMessage+"</h1>";
	}
}//end of the class ProducerHandler
