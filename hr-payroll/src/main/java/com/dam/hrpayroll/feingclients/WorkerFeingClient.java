package com.dam.hrpayroll.feingclients;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dam.hrpayroll.entities.Worker;



@Component
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeingClient {

	
	@GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id);
	
	
}
