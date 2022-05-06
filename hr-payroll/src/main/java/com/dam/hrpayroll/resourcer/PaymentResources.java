package com.dam.hrpayroll.resourcer;



import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dam.hrpayroll.entities.Payment;
import com.dam.hrpayroll.services.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value = "/payment")
public class PaymentResources {

	@Autowired
	private PaymentService paymentService;
	
	@HystrixCommand(fallbackMethod = "getPaymentAlt")
	@GetMapping("/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days){
		
		
		Payment payment = paymentService.getPayment(workerId, days);
		
		return ResponseEntity.ok(payment);
	}
	
	
	public ResponseEntity<Payment> getPaymentAlt( Long workerId,  Integer days){
		
		Payment payment = new Payment("Teste", new BigDecimal(200.00), days);
		
		return ResponseEntity.ok(payment);
	}
	
	
}
