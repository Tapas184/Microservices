package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // For Eureka Server
public class SpringBootMsProject02EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProject02EurekaServerApplication.class, args);
	}

}
