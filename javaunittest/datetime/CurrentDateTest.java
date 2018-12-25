package com.capgemini.datetime;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import org.junit.Test;

public class CurrentDateTest {
	private CurrentDate currentdate;

	@Test
	public void currentDateTest() {
		currentdate=new CurrentDate();
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
		String givenDateFormat=currentdate.toString(sdf);
		String expected="Tuesday, December 25, 2018";
		assertEquals(expected,givenDateFormat);
		
	}

}
