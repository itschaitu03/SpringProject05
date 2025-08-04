package com.chaitu.commons;

import java.util.concurrent.ThreadLocalRandom;

import com.chaitu.factory.ICricketBat;

public class SSBat implements ICricketBat {

	public SSBat() {
		System.out.println("SSBat :: 0 param Constructor");
	}

	@Override
	public int scoreRun() {
		int n = ThreadLocalRandom.current().nextInt(200);
		return n;
	}

}
