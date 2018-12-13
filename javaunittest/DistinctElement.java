import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DistinctElement {
	private DistinctElementInArray findDistinctElementInArray;
	@Before
	public void setup()
	{
		findDistinctElementInArray =new DistinctElementInArray();
	}
	
	@Test
	public void givenMoreElements() {
		int inputArray[]={9,6,4,2,3,5,7,0,1};
		int distinctElement=findDistinctElementInArray.findDistinctElement(inputArray);
		assertEquals(8,distinctElement);
	}
	@Test
	public void givenLessElements()
	{
		int inputArray[]={3,0,1};
		int distinctElement=findDistinctElementInArray.findDistinctElement(inputArray);
		assertEquals(2,distinctElement);
	}
	@Test
	public void givenSomeElements()
	{
		int inputArray[]={3,0,1,2,8,9,6,7,4};
		int distinctElement=findDistinctElementInArray.findDistinctElement(inputArray);
		assertEquals(5,distinctElement);
	}
		
}
