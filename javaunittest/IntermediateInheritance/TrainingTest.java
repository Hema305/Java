package com.cg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrainingTest {
	private Training publicTraining,corporateTraining;

	
	@Before
	public void setUp(){
		publicTraining = new PublicTraining("java",5000,50);
		corporateTraining = new CorporateTraining("Big Data",35000,4);
	}
	
	
	//Testing for Public Training
	@Test
	public void testForPublicTraining(){
		double result = publicTraining.getOrderValue();
		assertEquals(250000,result,0.0);
	}
	
	
	//Testing for Corporate Training
	@Test
	public void testForCorporateTraining(){
		double result = corporateTraining.getOrderValue();
		assertEquals(140000,result,0.0);
	}

}
