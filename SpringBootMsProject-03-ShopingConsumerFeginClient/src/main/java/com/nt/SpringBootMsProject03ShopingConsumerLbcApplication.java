package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //for eureka client we need ti keep on the top og the main class
@EnableFeignClients
public class SpringBootMsProject03ShopingConsumerLbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProject03ShopingConsumerLbcApplication.class, args);
	}

}
