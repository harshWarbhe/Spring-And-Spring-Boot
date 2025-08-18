package com.harsh.service;

import com.harsh.entity.JobSeeker;

public interface IJobSeekerMgmtService {
    public  String  registerJobSeeker(JobSeeker seeker);
    public   JobSeeker  showJobSeekerById(int id);
}
