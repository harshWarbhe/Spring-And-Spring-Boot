package com.harsh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsh.repository.IIPLPlayerRepository;
import com.harsh.repository.IIPLTeamRepository;

@Service
public class IPLLeagueMgmtSErviceImpl implements IIPLLeagueMgmtService {
	@Autowired
	private  IIPLTeamRepository  teamRepo;
	@Autowired
	private  IIPLPlayerRepository  playerRepo;
	
	@Override
	public List<Object[]> fetchTeamAndPlayerDataByJoins() {
		return teamRepo.showTeamAndPlayersDataUsingJoins();
	}

	
}
