package com.capgemini.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.time.LocalDate;
import java.time.Month;

public class CurrentDate {
	String stringDate="";

	
	public String toString(SimpleDateFormat sdf) {
		String stringDate = sdf.format(new Date());
		
		return stringDate;
	
	}

}
