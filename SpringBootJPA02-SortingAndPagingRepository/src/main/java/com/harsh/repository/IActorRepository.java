package com.harsh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.harsh.entity.Actor;

public interface IActorRepository extends CrudRepository<Actor, Integer>,PagingAndSortingRepository<Actor, Integer> {

}
