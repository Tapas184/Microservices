package com.nt.lbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillserviceConsumer {
	
	private static final Logger log = LoggerFactory.getLogger(BillserviceConsumer.class);

	@Autowired
	private LoadBalancerClient client;

	public String getBillInfo() {
		log.info("getBillInfo()-method start executing");
		ServiceInstance choose = client.choose("Billing-Service"); //get service instance object
		String url = choose.getUri()+"/producer/bill"; //make URl for producer app
		//create a rest template object to send url request to producer app by using resttemplate
		RestTemplate temp = new RestTemplate();
		log.info("Rest template created sucessfully");
		return temp.getForObject(url, String.class);
	
	}
}//end of the class LoadbalancerClient
