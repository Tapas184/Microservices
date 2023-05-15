package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringBootMsProject09MessageKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProject09MessageKafkaConsumerApplication.class, args);
	}

}
