package com.nt;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumeMessage {

	@JmsListener(destination = "PTP-MSG")
	public void readMessage(String str) {
		System.out.println("Message recived from PTP-MSG ::"+str);
	}
}
