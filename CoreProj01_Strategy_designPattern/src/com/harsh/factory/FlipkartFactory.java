package com.harsh.factory;

import com.harsh.comps.BlueDart;
import com.harsh.comps.Courier;
import com.harsh.comps.DTDC;
import com.harsh.comps.Flipkart;

public class FlipkartFactory {	//factory pattern class

	public static  Flipkart getInstance(String courierType) {
		
		//create dependent class obj
		Courier courier = null;
		
		if (courierType.equalsIgnoreCase("DTDC")) {
			courier = new DTDC();
		}
		else if (courierType.equalsIgnoreCase("BlueDart")) {
			courier = new BlueDart();
		}
		else {
			throw new IllegalArgumentException("Invalid courier type!");
		}
		
		//create target class obj
		Flipkart flipkart = new Flipkart();
		
		//assign dependent class obj to target class obj
		flipkart.setCourier(courier);
		
		return flipkart;
		
	}
}
