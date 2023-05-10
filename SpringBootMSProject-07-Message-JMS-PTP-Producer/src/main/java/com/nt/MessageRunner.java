package com.nt;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner  {

	@Autowired
	private JmsTemplate template;
	
	@Scheduled(cron = "*/5 * * * * * ")
	public void send(){

		template.send("PTP-MSG", ses->
			ses.createTextMessage("PTP Message From Producer APP::"+new Date()));
		System.out.println("Message Sent");
	}

}
