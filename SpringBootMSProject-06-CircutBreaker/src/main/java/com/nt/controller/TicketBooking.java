package com.nt.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;


@RestController
@RequestMapping("/ticket")
public class TicketBooking {

	int count ;
	@GetMapping("/book")
	@HystrixCommand(fallbackMethod = "dummyMethod",
	                commandProperties =
	            {
	            		@HystrixProperty(name="circuitBreaker.requestVolumeThreshold", value="5"),
	            	    @HystrixProperty(name="circuitBreaker.enabled", value="true")
	            }
	                )
	public String booking() throws IllegalAccessException {
		if(new Random().nextInt(10)<5)
			throw new IllegalAccessException("Error in Booking try after some time");
		System.out.println("TicketBooking.booking()");
		return "Booking method execute";
	}
	
	public String dummyMethod() {
		System.out.println("TicketBooking.dummyMethod()"+count++);
		return "Error in booking please try after some time";
	}
}
