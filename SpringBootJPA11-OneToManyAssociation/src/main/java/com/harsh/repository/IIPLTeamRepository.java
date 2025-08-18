package com.harsh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.entity.IPLTeam;

public interface IIPLTeamRepository extends JpaRepository<IPLTeam, Integer> {

}
