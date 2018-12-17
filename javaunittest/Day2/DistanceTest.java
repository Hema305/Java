import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceTest {
	private DistanceOfNumber distanceOne,distanceTwo;

	@Test
	public void distanceOne() {
		distanceOne=new DistanceOfNumber(4,3.5);
		String distance=DistanceOfNumber.displayDistanceOfNumber(distanceOne);
		assertEquals("4,3.5",distance);
	}
	
	@Test
	public void distanceTwo() {
		distanceTwo=new DistanceOfNumber(5,8.5);
		String distance=DistanceOfNumber.displayDistanceOfNumber(distanceTwo);
		assertEquals("5,8.5",distance);
	}
	
	@Test
	public void distanceSumTest() {
		distanceOne=new DistanceOfNumber(4,3.5);
		distanceTwo=new DistanceOfNumber(5,8.5);
		String distanceSum=DistanceOfNumber.displayDistanceOfSum( distanceOne,distanceTwo);
		assertEquals("9,12.0",distanceSum);
		
	}
	
	@Test
	public void zeroSumTest() {
		distanceOne=new DistanceOfNumber(-2,-3.3);
		distanceTwo=new DistanceOfNumber(-3,-8.5);
		String distanceSum=DistanceOfNumber.displayDistanceOfSum( distanceOne,distanceTwo);
		assertEquals("0,0.0",distanceSum);
		
	}
}
