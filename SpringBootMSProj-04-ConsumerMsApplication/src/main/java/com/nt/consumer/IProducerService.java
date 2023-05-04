package com.nt.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Producer-service")
public interface IProducerService {
	
	@GetMapping("/producer/config")
	public String showMsg();

}
