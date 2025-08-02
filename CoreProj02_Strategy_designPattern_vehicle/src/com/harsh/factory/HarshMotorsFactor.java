package com.harsh.factory;

import com.harsh.comps.DieselEngine;
import com.harsh.comps.ElectricEngine;
import com.harsh.comps.HarshMotors;
import com.harsh.comps.PetrolEngine;
import com.harsh.comps.Vehicle;

public class HarshMotorsFactor {//

	public static HarshMotors getInstance(String engineType) {

		Vehicle vehicle = null;

		if (engineType.equalsIgnoreCase("PetrolEngine")) {
			vehicle = new PetrolEngine();
		} else if (engineType.equalsIgnoreCase("DieselEngine")) {
			vehicle = new DieselEngine();
		} else if (engineType.equalsIgnoreCase("ElectricEngine")) {
			vehicle = new ElectricEngine();
		} else {
			throw new IllegalArgumentException("Invalid courier type!");
		}

		// create target class obj
		HarshMotors harshMotors =new HarshMotors(); 

		// assign dependent class obj to target class obj
		harshMotors.setVehicle(vehicle);

		return harshMotors;

	}
}
