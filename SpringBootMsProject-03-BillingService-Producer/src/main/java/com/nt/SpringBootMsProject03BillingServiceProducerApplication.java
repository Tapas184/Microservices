package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // For client eureka Client procedure or may Consumer
public class SpringBootMsProject03BillingServiceProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProject03BillingServiceProducerApplication.class, args);
	}

}
