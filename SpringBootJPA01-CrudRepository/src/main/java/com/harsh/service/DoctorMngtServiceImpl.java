package com.harsh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsh.entity.Doctor;
import com.harsh.repository.IDoctorRepo;

@Service("doctorService")
public class DoctorMngtServiceImpl implements IDoctorService {

	@Autowired
	private IDoctorRepo doctorRepo;

	@Override
	public String registerDoctor(Doctor doctor) {
		System.out.println("docId (before save) : " + doctor.getDocId());

		Doctor doc = doctorRepo.save(doctor);

		return "docId (before save) : " + doc.getDocId();
	}

	@Override
	public long showDoctorCount() {
		long count = doctorRepo.count();
		return count;
	}

}
