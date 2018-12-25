package com.capgemini.datetime;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class DaysAliveTest {
	private DaysAlive daysAlive;

	@Test
	public void daysAlivetest() {
		daysAlive=new DaysAlive();
		LocalDate dateBefore = LocalDate.of(1997, Month.JUNE, 9);
	
		long numberOfDays=daysAlive.numberOfDaysAlive(dateBefore);
		assertEquals(7869,numberOfDays);
		
		
	}

}
