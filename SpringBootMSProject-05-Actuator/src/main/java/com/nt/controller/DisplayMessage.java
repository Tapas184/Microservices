package com.nt.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actu")
public class DisplayMessage {

	@GetMapping("/msg")
	public String showmsg() {
		return "Actuator example "+new Date();
	}
}
