package com.harsh.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart { //target class

	@Autowired
	@Qualifier("dtdc")
	private ICourier courier;

	public void setCourier(ICourier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}
	
	
	
	public Flipkart() {
		super();
		System.out.println("Flipkart :: o param constructor");
	}



	//b.logic
	public String shopping(String items[], double Price[]) {
		
		double billAmount = 0.0;
		//calculate price
		for (double d : Price) {
			billAmount += d; 
		}
		
		//generate order id 
		int oid = new Random().nextInt(10000);
		
		//deliver the product using courier
		String msg = courier.deliver(oid);
		
		return Arrays.toString(items)+" item with bill amount : "+billAmount + "\n"+msg;
		
	}
	
	
}
