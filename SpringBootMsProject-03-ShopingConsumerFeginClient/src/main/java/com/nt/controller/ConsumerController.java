package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.lbc.IBillRestConsumer;

@RestController
@RequestMapping("/shoping")
public class ConsumerController {

	@Autowired
	private IBillRestConsumer consumer;
	
	@GetMapping("/info")
	public String showMsg() {
		return "For pongalFestival Bill price is"+consumer.getMsg();
	}
}//end of the class ConsumerController
