package com.nt.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.nt.store.MessageStore;

@Component("kconsumer")
public class MsgConsumer {

	@Autowired
	private MessageStore store;
	
	@KafkaListener(topics = "${app.topic.name}",groupId = "GRP1")
	public void showMessage(String msg) {
		store.storeMessage(msg);
		
	}
}//end of the class MsgConsumer
