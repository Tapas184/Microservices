package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.lbc.BillserviceConsumer;

@RestController
@RequestMapping("/shoping")
public class ConsumerController {

	@Autowired
	private BillserviceConsumer consumer;
	
	@GetMapping("/info")
	public String showMsg() {
		return "For pongalFestival Bill price is"+consumer.getBillInfo();
	}
}//end of the class ConsumerController
