import static org.junit.Assert.*;

import org.junit.Test;

public class TimeToTest {
private TimeForAnObject timeOne,timeTwo,timeSum;

	@Test
	public void timeOne() {
		timeOne=new TimeForAnObject(4,20);
		String time=TimeForAnObject.displayTime(timeOne);
		assertEquals("4 hours 20 minutes",time);
	}
	
	@Test
	public void timeTwo() {
		timeTwo=new TimeForAnObject(6,30);
		String time=TimeForAnObject.displayTime(timeTwo);
		assertEquals("6 hours 30 minutes",time);
	}
	
	@Test
	public void timeSum(){
		timeOne=new TimeForAnObject(4,20);
		timeTwo=new TimeForAnObject(6,30);
		String timeSum=TimeForAnObject.displaySumOfTime(timeOne,timeTwo);
		assertEquals("10 hours 50 minutes",timeSum);
		
	}
	@Test
	public void timeForGreaterTimeSum(){
		timeOne=new TimeForAnObject(25,80);
		timeTwo=new TimeForAnObject(6,30);
		String timeSum=TimeForAnObject.displaySumOfTime(timeOne,timeTwo);
		assertEquals("0 hours 0 minutes",timeSum);
		
	}
}
	
	

