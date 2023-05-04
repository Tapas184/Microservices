package com.nt.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.consumer.IProducerService;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

	@Autowired
	private IProducerService consumer;
	
	@GetMapping("/client")
	public String showMsg() {
		return consumer.showMsg();
	}
}
