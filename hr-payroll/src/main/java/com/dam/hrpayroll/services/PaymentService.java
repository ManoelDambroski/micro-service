package com.dam.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dam.hrpayroll.entities.Payment;
import com.dam.hrpayroll.entities.Worker;

@Service
public class PaymentService {

	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	public Payment getPayment(Long workerId, Integer days) {
		
		Map<String, String> uriVaribles = new HashMap<String, String>();
		uriVaribles.put("id", workerId.toString());
		
		
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVaribles);   
		
		Payment pay = new Payment(worker.getName(), worker.getDailyIncome(), days);
		
		return pay;
	}
	
	
}
