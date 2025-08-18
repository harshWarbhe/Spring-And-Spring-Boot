package com.harsh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.entity.JobSeeker;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {

}
