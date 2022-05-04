package com.dam.hrpayroll.services;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.dam.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	
	
	public Payment getPayment(Long workerId, Integer days) {
		
		Payment pay = new Payment("Manoel", new BigDecimal(200.00), days);
		
		return pay;
	}
	
	
}
