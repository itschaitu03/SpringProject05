package com.chaitu.commons;

import java.util.concurrent.ThreadLocalRandom;

import com.chaitu.factory.ICricketBat;

public class MRFBat implements ICricketBat {

	public MRFBat() {
		System.out.println("MRFBat :: 0 param Constructor");
	}

	@Override
	public int scoreRun() {
		System.out.println("MRFBat.scoreRun()");
		int n = ThreadLocalRandom.current().nextInt(200);
		return n;
	}

}
