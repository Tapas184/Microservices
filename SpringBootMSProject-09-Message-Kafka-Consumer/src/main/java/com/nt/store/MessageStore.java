package com.nt.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("msgStore")
public class MessageStore {

	List<String> msgStore = new ArrayList<>();
	
	public void storeMessage(String msg) {
		msgStore.add(msg);
	}
	
	public String showAllMsg(){
		
		return "<h1>"+msgStore.toString()+"<h2>";
	}
}//end of the class MessageStore 
