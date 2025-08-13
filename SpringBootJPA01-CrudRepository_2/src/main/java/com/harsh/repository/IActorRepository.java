package com.harsh.repository;

import org.springframework.data.repository.CrudRepository;

import com.harsh.entity.Actor;

public interface IActorRepository extends CrudRepository<Actor, Integer> {

}
