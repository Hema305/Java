package com.capgemini.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DaysAlive {

	public long numberOfDaysAlive(LocalDate dateBefore) {
		LocalDate today = LocalDate.now();
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, today);
		
		return noOfDaysBetween;
	}

}
