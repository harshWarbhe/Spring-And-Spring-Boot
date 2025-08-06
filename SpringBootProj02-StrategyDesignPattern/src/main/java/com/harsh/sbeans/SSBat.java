package com.harsh.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("ssbat")
public class SSBat implements ICricketBat {

	public SSBat() {
		super();
		System.out.println("ssBat :: 0 param constructor");

	}

	@Override
	public int scoreRun() {
		System.out.println("ssBat.scoreRun()");
		int score = new Random().nextInt(250);
		return score;
	}

}
