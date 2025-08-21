package com.harsh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

}
