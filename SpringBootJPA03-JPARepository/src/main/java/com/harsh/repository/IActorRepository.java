package com.harsh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor,Integer>{

}
