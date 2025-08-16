package com.harsh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.entity.Politician;

public interface IPoliticianRepository extends JpaRepository<Politician	, Integer> {

}
