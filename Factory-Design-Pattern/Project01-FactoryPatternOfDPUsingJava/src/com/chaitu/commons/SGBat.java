package com.chaitu.commons;

import java.util.Random;

import com.chaitu.factory.ICricketBat;

public class SGBat implements ICricketBat {

	public SGBat() {
		System.out.println("SGBat :: 0 param Constructor");
	}

	@Override
	public int scoreRun() {
		int n = new Random().nextInt(200);
		return n;
	}

}
