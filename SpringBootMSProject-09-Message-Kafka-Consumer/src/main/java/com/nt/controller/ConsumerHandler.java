package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.store.MessageStore;

@RestController
public class ConsumerHandler {

	@Autowired
	private MessageStore store;
	@GetMapping("/message")
	public String getMessgae() {
		return store.showAllMsg();
	}
}//end of the class ConsumerHandler
