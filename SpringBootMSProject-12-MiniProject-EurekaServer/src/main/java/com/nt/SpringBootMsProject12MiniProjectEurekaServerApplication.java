package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //Enable Eureka server
public class SpringBootMsProject12MiniProjectEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProject12MiniProjectEurekaServerApplication.class, args);
	}

}
