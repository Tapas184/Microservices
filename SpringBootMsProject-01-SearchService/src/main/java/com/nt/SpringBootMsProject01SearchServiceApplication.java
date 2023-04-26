package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //For clint which will be publish in server
public class SpringBootMsProject01SearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProject01SearchServiceApplication.class, args);
	}

}
