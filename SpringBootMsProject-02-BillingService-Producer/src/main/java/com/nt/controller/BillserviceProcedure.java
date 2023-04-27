package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class BillserviceProcedure {

	@Value("${server.port}")
	private int port;
	
	@Value("${spring.application.name}")
	private String serviceName;
	@Value("${eureka.instance.instance-id}")
	private String id;
	@GetMapping("/bill")
	public String showMsg() {
		return "Bill service Name is -- "+serviceName+" Port is"+port+" Id is --"+id;
	}
}//end of class BillserviceProcedure
