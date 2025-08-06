package com.harsh.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("mrfBat")
public class MRFBat implements ICricketBat {

	
	public MRFBat() {
		super();
		System.out.println("mrfBat :: 0 param constructor");
	}

	@Override
	public int scoreRun() {
		System.out.println("mrfBat.scoreRun()");
		int score = new Random().nextInt(250);
		return score;
	}

}
