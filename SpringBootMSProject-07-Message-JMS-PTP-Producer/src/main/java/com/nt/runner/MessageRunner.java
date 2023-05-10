package com.nt.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner {

	@Autowired
	private JmsTemplate template;
	@Override
	public void run(String... args) throws Exception {

		template.send("PTP-MSG", ses->
			ses.createTextMessage("PTP Message From Producer APP::"+new Date()));
		System.out.println("Message Sent");
	}

}
