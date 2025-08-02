package com.harsh.comps;

public class HarshMotors {	//target class

	private Vehicle vehicle;

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public String journey(String strat, String end) {
		
		String msg = vehicle.engine();
		
		return "journey start from "+strat+" to "+end+" with your loved "+ msg+" vehicle";
		
	}
}
