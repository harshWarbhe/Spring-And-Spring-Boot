package com.harsh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsh.entity.JobSeeker;
import com.harsh.repository.IJobSeekerRepository;

@Service
public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
	@Autowired
	private  IJobSeekerRepository  jsRepo;

	@Override
	public String registerJobSeeker(JobSeeker seekar) {
		int idVal=jsRepo.save(seekar).getJsid();
		return "JobSeeker is registered with id value::"+idVal;
	}
	
	@Override
	public JobSeeker showJobSeekerById(int id) {
		return jsRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id"));
	}

}
