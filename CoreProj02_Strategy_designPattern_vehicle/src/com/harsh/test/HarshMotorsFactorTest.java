package com.harsh.test;

import com.harsh.comps.HarshMotors;
import com.harsh.factory.HarshMotorsFactor;

public class HarshMotorsFactorTest {

	public static void main(String[] args) {
		
		HarshMotors harshMotors = HarshMotorsFactor.getInstance("PetrolEngine");
		
		String journey = harshMotors.journey("warora", "hyderabad");
		
		System.out.println(journey);
	}
}
