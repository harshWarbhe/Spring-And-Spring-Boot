package com.harsh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.entity.JobSeeker;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {

	public List<JobSeeker> findByJsNameEquals(String jsName);

	public List<JobSeeker> getByJsName(String jsName);

	public List<JobSeeker> readByJsNameIs(String jsName);

	public List<JobSeeker> findByJsNameStartingWith(String startchar);

	public List<JobSeeker> findByJsNameContainingIgnoreCase(String chars);

}
