package com.chaitu.main;

import com.chaitu.factory.Cricketer;

public class Cricket {

	public static void main(String[] args) {
		Cricketer c = new Cricketer();
		c.bat();
		System.out.println(c.batter("Rohit"));

	}
}
