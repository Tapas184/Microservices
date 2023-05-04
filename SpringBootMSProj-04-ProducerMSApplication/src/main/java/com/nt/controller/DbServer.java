package com.nt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class DbServer {
	@Value("${dbuser}")
	private String name;
	
	@Value("${dbpass}")
	private String paswd;
	
	@GetMapping("/config")
	public String config() {
		return "Spring Could Configuration with "+name+"--"+paswd;
	}
}
