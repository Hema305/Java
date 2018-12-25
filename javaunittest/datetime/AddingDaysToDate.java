package com.capgemini.datetime;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class AddingDaysToDate {
	private AddingDays addingDays;
	@Test(expected=RuntimeException.class)
	public void test() {
		addingDays=new AddingDays();
		LocalDate date2 =  LocalDate.of(2016, 10, 32).plusDays(20);
		String resultDate=addingDays.findNewDate(date2);
		
	}
	@Test
	public void addingDays() {
		addingDays=new AddingDays();
		LocalDate date2 =  LocalDate.of(2016, 10, 14).plusDays(20);
		String resultDate=addingDays.findNewDate(date2);
		String expected="newdate 2016-11-03";
		assertEquals(expected, resultDate);
	}
}
