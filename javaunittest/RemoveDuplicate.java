import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RemoveDuplicate {
	private DuplicateRemovedString remove;
	@Before
	public void setup()
	{
		remove=new DuplicateRemovedString();
	}
	

	@Test
	public void firstString() {
		String input="abcabcabc";
		String result=remove.removeChar(input);
		assertEquals("abc",result);
	}
	@Test
	public void secongString() {
		String input="javaforschool";
		String result=remove.removeChar(input);
		assertEquals("javforschl",result);
	}
	@Test
	public void thirdString()
	{
		String input="Mississippi";
		String result=remove.removeChar(input);
		assertEquals("Misp",result);
	}

}
