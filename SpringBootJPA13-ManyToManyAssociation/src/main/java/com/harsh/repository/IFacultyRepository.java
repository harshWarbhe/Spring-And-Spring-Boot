package com.harsh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.entity.Faculty;

public interface IFacultyRepository extends JpaRepository<Faculty, Integer> {

}
