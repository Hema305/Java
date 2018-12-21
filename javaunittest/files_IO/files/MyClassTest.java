package com.files;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyClassTest {
	private MyClass myClassOne,myClassTwo,myClassThree,myClassFour,myClassFive;
	@Before
	public void setUp()
	{
		myClassOne=new MyClass();
		myClassTwo=new MyClass();
		myClassThree=new MyClass();
		myClassFour=new MyClass();
		myClassFive=new MyClass();
		
	}

	@Test
	public void myClassTest() {
		myClassOne.MyClass();
		
		Myclass classObjects[]={myClassOne,myClassTwo,myClassThree,myClassFour,myClassFive};
		
		
	}

}
