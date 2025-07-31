package com.harsh.comps;

import java.util.Arrays;
import java.util.Random;

public class Flipkart { //target class

	private Courier courier;

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
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
