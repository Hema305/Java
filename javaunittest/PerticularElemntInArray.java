import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PerticularElemntInArray {
	private findPerticularElementInArray findPerticularElementInArrayObject;
@Before
	public void setup()
	{
		findPerticularElementInArrayObject=new findPerticularElementInArray();
	}
	@Test
	public void elementFindtest() {
		int numbers[][]={{1,2,3,45,12},{4,5,6,7,10}};
		int number=6;
	boolean result=findPerticularElementInArrayObject.checkElementPresence(numbers,number);
	assertEquals(true,result);
		
		
	}
	

}
