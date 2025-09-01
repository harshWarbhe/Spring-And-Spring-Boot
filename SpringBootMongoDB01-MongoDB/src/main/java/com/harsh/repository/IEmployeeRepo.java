package com.harsh.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.harsh.document.Employee;

public interface IEmployeeRepo extends MongoRepository<Employee, String> {

	
}
