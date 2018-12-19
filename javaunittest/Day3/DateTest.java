import static org.junit.Assert.*;

import org.junit.Test;


public class DateTest {
	private Date dateOne;
	
	@Test
	public void testForString() //toString method returns the current date
	{
		dateOne=new Date(20,04,2017);
		String result=dateOne.toString();
		assertEquals("20/04/2017" ,result);
		
	}
	
	@Test
	public void invokingObjectIsSmallerThanDateObject () { //It returns the true because invoking object is greater 
		dateOne=new Date(20,04,2019);
		boolean result=dateOne.isSmaller(dateOne);
		assertEquals(true,result);
		
	}
	
	@Test
	public void invokingObjectIsGreaterThanDateObject () { //It returns the false because invoking object is greater 
		dateOne=new Date(20,04,2027);
		boolean result=dateOne.isSmaller(dateOne);
		assertEquals(false,result);
	}
	
	@Test
	public void diffrenceDateAndMonthAndYearInvokingDateIsSmaller(){		//It stores the difference of date,month,year in the form of an array and invoking date is smaller than given date
		dateOne=new Date(20,04,2016);
		int[] result=dateOne.diff(dateOne);
		int[] expected={396,13,1};
		assertArrayEquals(expected,result);
	}
	
	@Test
	public void diffrenceDateAndMonthAndYearInvokingDateIsGreater(){		//It stores the difference of date,month,year in the form of an array and invoking date is Greater than given date
		dateOne=new Date(20,04,2019);
		int[] result=dateOne.diff(dateOne);
		int[] expected={699,23,2};
		assertArrayEquals(expected,result);
	}
	
}