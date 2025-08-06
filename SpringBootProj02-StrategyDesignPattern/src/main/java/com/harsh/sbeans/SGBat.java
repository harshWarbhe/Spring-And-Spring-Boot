package com.harsh.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("sgbat")
public class SGBat implements ICricketBat {

	
	public SGBat() {
		super();
		System.out.println("sgBat :: 0 param constructor");

	}

	@Override
	public int scoreRun() {
		System.out.println("sgBat.scoreRun()");
		int score = new Random().nextInt(250);
		return score;
	}

}
