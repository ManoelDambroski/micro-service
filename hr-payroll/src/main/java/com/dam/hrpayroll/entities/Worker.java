package com.dam.hrpayroll.entities;

import java.io.Serializable;
import java.math.BigDecimal;

public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	
	private Long id;
	
	private String name;
	
	private BigDecimal dailyIncome;
	
	
	
	public Worker() {
		super();
	}

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public BigDecimal getDailyIncome() {
		return dailyIncome;
	}



	public void setDailyIncome(BigDecimal dailyIncome) {
		this.dailyIncome = dailyIncome;
	}
	
	
	
	
	
}
