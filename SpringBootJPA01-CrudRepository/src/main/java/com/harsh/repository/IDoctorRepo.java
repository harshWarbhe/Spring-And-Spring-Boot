package com.harsh.repository;

import org.springframework.data.repository.CrudRepository;

import com.harsh.entity.Doctor;

public interface IDoctorRepo extends CrudRepository<Doctor, Integer>{

}
