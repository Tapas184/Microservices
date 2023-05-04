package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMsProj04ProducerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj04ProducerMsApplication.class, args);
	}

}
