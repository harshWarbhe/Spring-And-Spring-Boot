package com.harsh.test;

import com.harsh.comps.Flipkart;
import com.harsh.factory.FlipkartFactory;

public class FlipkartFactoryTest {
	public static void main(String[] args) {

		//use Factory pattern to target class obj
		Flipkart flipkart = FlipkartFactory.getInstance("DTDC");
		
		//invoke b. method
		String result = flipkart.shopping(new String[]{"Shirt","pant"}, new double[] {1000.0,1599.0});
		
		System.out.println(result);
	}
	
}
