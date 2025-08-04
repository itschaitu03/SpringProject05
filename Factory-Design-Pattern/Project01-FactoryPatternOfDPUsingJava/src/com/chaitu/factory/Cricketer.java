package com.chaitu.factory;

import java.util.Scanner;

import com.chaitu.commons.MRFBat;
import com.chaitu.commons.SGBat;
import com.chaitu.commons.SSBat;

public class Cricketer {

	private ICricketBat b;

	public ICricketBat bat() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Select the bat ::");
		String s = sc.next();
		sc.close();
		if (s.equalsIgnoreCase("mrf")) {
			b = new MRFBat();
		}

		else if (s.equalsIgnoreCase("ss")) {
			b = new SSBat();
		}

		else if (s.equalsIgnoreCase("sg")) {
			b = new SGBat();
		}

		else {
			throw new IllegalArgumentException("Invalid Value");
		}

		return b;
	}

	public Cricketer() {
		System.out.println("Cricketer :: 0 param Constructor");
	}

	public String batter(String name) {
		return "Today " + name + " is scored :: " + b.scoreRun() + " runs";
	}

	public ICricketBat getB() {
		return b;
	}

}
