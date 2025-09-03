package com.harsh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
