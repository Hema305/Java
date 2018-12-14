import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RecatangleShapeTest {
	private recatangleShapeBehaviour recatangleOneBehaviourCheck,recatangleTwoBehaviourCheck;
	@Before
	public void setup()
	{
		recatangleOneBehaviourCheck=new recatangleShapeBehaviour();
		recatangleTwoBehaviourCheck=new recatangleShapeBehaviour();
	}
	
	int paremeterOfRectangleOne,paremeterOfRectangleTwo,areaOfRectangleOne,areaOfRectangleTwo;
	
	@Test
	public void rectangleOneParemeter() {
		paremeterOfRectangleOne=recatangleOneBehaviourCheck.rectangleOneParemeterValue(10,20);
		assertEquals(60,paremeterOfRectangleOne);
	}
	@Test
	public void rectangleTwoParemeter() {
		 paremeterOfRectangleTwo=recatangleTwoBehaviourCheck.rectangleTwoParemeterValue(10,20);
		assertEquals(60,paremeterOfRectangleTwo);
	}
	@Test
	public void rectangleParemetersAreEqual() //checking equal or not
	{
		boolean result1=recatangleOneBehaviourCheck.findRectangleParemetersAreEqual(recatangleOneBehaviourCheck.rectangleOneParemeterValue(10,20),recatangleTwoBehaviourCheck.rectangleTwoParemeterValue(20,10));
		assertEquals(true,result1);
			
	}
	@Test
	public void rectangleOneParemetertest() {
		paremeterOfRectangleOne=recatangleOneBehaviourCheck.rectangleOneParemeterValue(10,20);
		assertEquals(60,paremeterOfRectangleOne);
	}
	@Test
	public void rectangleTwoParemetertest() {
		paremeterOfRectangleTwo=recatangleTwoBehaviourCheck.rectangleTwoParemeterValue(20,20);
		assertEquals(80,paremeterOfRectangleTwo);
	}
	@Test
	public void rectangleParemetersAreNotEqual() //checking equal or not
	{
		boolean result1=recatangleOneBehaviourCheck.findRectangleParemetersAreEqual(recatangleOneBehaviourCheck.rectangleOneParemeterValue(10,20),recatangleTwoBehaviourCheck.rectangleTwoParemeterValue(20,20));
		assertEquals(false,result1);
			
	}
	@Test
	public void rectangleAreaOne()
	{
		areaOfRectangleOne=recatangleOneBehaviourCheck.rectangleOneAreaValue(10,20);		
		assertEquals(200,areaOfRectangleOne);
	}
	@Test
	public void rectangleAreaTwo()
	{
		areaOfRectangleTwo=recatangleOneBehaviourCheck.rectangleTwoAreaValue(10,20);	
		assertEquals(200,areaOfRectangleTwo);
	}
	@Test
	public void rectangleAreasAreEqual() //checking equal or not
	{
		boolean result1=recatangleOneBehaviourCheck.findRectangleAreassAreEqual(recatangleOneBehaviourCheck.rectangleOneAreaValue(10,20),recatangleTwoBehaviourCheck.rectangleTwoAreaValue(10,20));
		assertEquals(true,result1);
			
	}
	@Test
	public void rectangleAreaOneTest()
	{
		areaOfRectangleOne=recatangleOneBehaviourCheck.rectangleOneAreaValue(10,20);		
		assertEquals(200,areaOfRectangleOne);
	}
	@Test
	public void rectangleAreaTwoTest()
	{
		areaOfRectangleTwo=recatangleOneBehaviourCheck.rectangleTwoAreaValue(20,20);	
		assertEquals(400,areaOfRectangleTwo);
	}
	@Test
	public void rectangleAreasAreNotEqual() //checking equal or not
	{
		boolean result1=recatangleOneBehaviourCheck.findRectangleAreassAreEqual(recatangleOneBehaviourCheck.rectangleOneAreaValue(10,20),recatangleTwoBehaviourCheck.rectangleTwoAreaValue(20,20));
		assertEquals(false,result1);
			
	}

}
