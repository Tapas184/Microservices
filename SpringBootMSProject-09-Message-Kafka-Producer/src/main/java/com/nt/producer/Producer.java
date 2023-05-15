package com.nt.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component("kproducer")
public class Producer {

	@Autowired
	private KafkaTemplate<String, String> ktemp;
	@Value("${app.topic.name}")
	private String topic;
	
	public String sendMessage(String msg) {
		ktemp.send(topic, msg);
		return"Message Send";
	}
}//end of the class Producer
