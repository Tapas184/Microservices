package com.nt.lbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillserviceConsumer {
	
	@Autowired
	private LoadBalancerClient client;

	public String getBillInfo() {
		ServiceInstance choose = client.choose("Billing-Service"); //get service instance object
		String url = choose.getUri()+"/producer/bill"; //make URl for producer app
		//create a rest template object to send url request to producer app by using resttemplate
		RestTemplate temp = new RestTemplate();
		return temp.getForObject(url, String.class);
	}
}//end of the class LoadbalancerClient
