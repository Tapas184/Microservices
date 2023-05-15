package com.nt.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.SamplerFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class Configur {

	@Bean
	RestTemplate createTemplate() {
		return new RestTemplate();
	}
	
	//for gather Data from Slueth using Sampler Object

	@Autowired
	SamplerFunction<Object> createSampler(){
		return SamplerFunction.alwaysSample();
	}
}//Configuration class
