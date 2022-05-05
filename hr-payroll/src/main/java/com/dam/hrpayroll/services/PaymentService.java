package com.dam.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dam.hrpayroll.entities.Payment;
import com.dam.hrpayroll.entities.Worker;
import com.dam.hrpayroll.feingclients.WorkerFeingClient;

@Service
public class PaymentService {

	
	@Autowired
	private WorkerFeingClient fengClient;
	
	
	
	public Payment getPayment(Long workerId, Integer days) {
		
		Worker worker= fengClient.findById(workerId).getBody();
		
		Payment pay = new Payment(worker.getName(), worker.getDailyIncome(), days);
		
		return pay;
	}
	
	
}
