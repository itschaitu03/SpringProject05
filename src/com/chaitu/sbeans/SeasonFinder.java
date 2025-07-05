package com.chaitu.sbeans;

import java.time.LocalDate;

public class SeasonFinder {

	private LocalDate month;

	public SeasonFinder() {
		System.out.println("SeasonFinder::0 parameter constructor");
	}

	public void setMonth(LocalDate month) {
		System.out.println("SeasonFinder.setMonth()");
		this.month = month;
	}

	public String showSeason(String userName) {

		int d = month.getMonthValue();
		if (d <= 3) {
			return "Spring Season ::" + userName;

		}

		else if (d <= 6) {
			return "Summer Season ::" + userName;

		}

		else if (d <= 9) {
			return "Riany or Autumn Season ::" + userName;

		}

		else {
			return "Winter Season ::" + userName;

		}

	}
}
