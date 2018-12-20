import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {
	private Triangle triangle,triangleOne,triangleTwo,triangleThree;
	@Before
	public void setUp(){
		triangle = new Triangle(3,4,5,90,45,45);
		triangleOne = new Triangle(3,7,12,35,45,100);
		triangleTwo = new Triangle(5,5,10,80,50,50);
		triangleThree = new Triangle(8,8,8,60,60,60);
	}

	@Test
	public void isRightTest() {
		boolean expected = true;
		boolean actual=triangle.isRight();
		assertEquals(expected,actual);
	}
	@Test
	public void isRightTestOne() {
		boolean expected = false;
		boolean actual=triangleOne.isRight();
		assertEquals(expected,actual);
	}
	@Test
	public void isRightTestTwo() {
		boolean expected = false;
		boolean actual=triangleTwo.isRight();
		assertEquals(expected,actual);
	}
	@Test
	public void isRightTestThree() {
		boolean expected = false;
		boolean actual=triangleThree.isRight();
		assertEquals(expected,actual);
	}

	@Test
	public void isScaleneTest() {
		boolean expected = true;
		boolean actual=triangleOne.isScalene();
		assertEquals(expected,actual);
	}
	@Test
	public void isScaleneTestOne() {
		boolean expected = false;
		boolean actual=triangle.isScalene();
		assertEquals(expected,actual);
	}
	@Test
	public void isScaleneTestTwo() {
		boolean expected = false;
		boolean actual=triangleTwo.isScalene();
		assertEquals(expected,actual);
	}
	@Test
	public void isScaleneTestThree() {
		boolean expected = false;
		boolean actual=triangleThree.isScalene();
		assertEquals(expected,actual);
	}
	@Test
	public void isIsoceles() {
		boolean expected = true;
		boolean actual=triangleTwo.isIscoceles();
		assertEquals(expected,actual);
	}
	@Test
	public void isIsocelesTestOne() {
		boolean expected = false;
		boolean actual=triangle.isIscoceles();
		assertEquals(expected,actual);
	}
	@Test
	public void isIsocelesTestTwo() {
		boolean expected = false;
		boolean actual=triangleOne.isIscoceles();
		assertEquals(expected,actual);
	}
	@Test
	public void isIsocelesTestThree() {
		boolean expected = true;
		boolean actual=triangleTwo.isIscoceles();
		assertEquals(expected,actual);
	}
	@Test
	public void isEquilateral() {
		boolean expected = true;
		boolean actual=triangleThree.isEquilateral();
		assertEquals(expected,actual);
	}
	@Test
	public void isEquilateralTestOne() {
		boolean expected = false;
		boolean actual=triangle.isEquilateral();
		assertEquals(expected,actual);
	}
	@Test
	public void isEquilateralTestTwo() {
		boolean expected = false;
		boolean actual=triangleOne.isEquilateral();
		assertEquals(expected,actual);
	}
	@Test
	public void isEquilateralTestThree() {
		boolean expected = false;
		boolean actual=triangleTwo.isEquilateral();
		assertEquals(expected,actual);
	}

}