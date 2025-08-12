package com.harsh.service;

import com.harsh.entity.Doctor;

public interface IDoctorService {

	public String registerDoctor(Doctor doctor);
	
	public long showDoctorCount();
}
