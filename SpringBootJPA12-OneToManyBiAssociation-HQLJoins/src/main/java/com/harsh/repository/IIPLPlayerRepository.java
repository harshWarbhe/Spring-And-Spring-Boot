package com.harsh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.entity.IPLPlayer;

public interface IIPLPlayerRepository extends JpaRepository<IPLPlayer, Integer> {

}
