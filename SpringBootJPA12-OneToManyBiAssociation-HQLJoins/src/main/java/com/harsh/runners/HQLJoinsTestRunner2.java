package com.harsh.runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.harsh.service.IIPLLeagueMgmtService;

@Component
public class HQLJoinsTestRunner2 implements CommandLineRunner {

	@Autowired
	private  IIPLLeagueMgmtService  leagueService;


	@Override
	public void run(String... args) throws Exception {
		
		try {
			List<Object[]>  list=leagueService.fetchTeamAndPlayerDataByJoins();
			list.forEach(row->{
				System.out.println(Arrays.toString(row));
			});
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
				
	}//main

}//class
