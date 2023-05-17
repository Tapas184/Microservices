package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //For register Consumer Application in Eureka Server
@EnableFeignClients //For implements Rest APIS
public class SpringBootMsProject12MiniProjectConsumerIplPlayesInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProject12MiniProjectConsumerIplPlayesInfoApplication.class, args);
	}

}
