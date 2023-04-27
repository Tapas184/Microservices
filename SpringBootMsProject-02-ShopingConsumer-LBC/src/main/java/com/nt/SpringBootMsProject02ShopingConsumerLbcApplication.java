package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //for eureka client we need ti keep on the top og the main class
public class SpringBootMsProject02ShopingConsumerLbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProject02ShopingConsumerLbcApplication.class, args);
	}

}
