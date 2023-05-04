package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.CardDetails;

@RestController
@RequestMapping("/producer")
public class BillserviceProcedure {

private static final Logger log = LoggerFactory.getLogger(BillserviceProcedure.class);

	@Value("${server.port}")
	private int port;
	
	@Value("${spring.application.name}")
	private String serviceName;
	@Value("${eureka.instance.instance-id}")
	private String id;
	@GetMapping("/bill")
	public String showMsg() {
		log.info("showMsg-Method Executed");
		return "Bill service Name is -- "+serviceName+" Port is"+port+" Id is --"+id;
	}
	@PostMapping("/save")
	public List<CardDetails> saveCard(@RequestBody CardDetails details){
		return new ArrayList<CardDetails>();
	}
	@DeleteMapping("/delete/{cardNo}")
	public String deleteCard(@PathVariable Integer cardNo) {
	
		return "Deleted Card sucessfully";
	}
}//end of class BillserviceProcedure
