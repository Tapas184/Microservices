package com.nt.lbc;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nt.model.CardDetails;

@FeignClient("Billing-Service") //Producer Application name should be match
public interface IBillRestConsumer {
	
	@GetMapping("/producer/bill")
	public String getMsg();
	
	@PostMapping("/producer/save")
	public List<Object> sendCardDetails(@RequestBody CardDetails details);

	@DeleteMapping("/producer/delete/{cardNo}")
	public String deleteCard(@PathVariable Integer cardNo);
}
