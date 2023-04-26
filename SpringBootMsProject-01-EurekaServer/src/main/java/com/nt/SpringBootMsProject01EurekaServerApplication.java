package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer// for enable eureka server
public class SpringBootMsProject01EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProject01EurekaServerApplication.class, args);
	}

}
