package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //For register This MS into Eureka Server Eureka Client Enable Requried
public class SpringBootMsProject12MiniProjectIplTeamInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProject12MiniProjectIplTeamInfoApplication.class, args);
	}

}
