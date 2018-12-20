import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DefferenceNumberPresenceTest {
	private DefferenceNumberPresence DefferenceNumberPresenceTestObject;
	@Before
	public void setup()
	{
		DefferenceNumberPresenceTestObject=new DefferenceNumberPresence();
	}

	@Test
	public void DefferenceNumberPresencetest() {
		int value=2;
		int numbers[]={4,5,6,7,8};
		boolean resultOfNumbers=DefferenceNumberPresenceTestObject.findNumber(numbers,value);
		assertEquals(true,resultOfNumbers);
	}

}
