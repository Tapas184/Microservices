package com.nt;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner  {

	@Autowired
	private JmsTemplate template;
	
	public void sendMessage(){
		
		template.send("pub-sub", ses->ses.createTextMessage("message From publisher:"+new Date()));
		System.out.println("message sent");

	}

}
