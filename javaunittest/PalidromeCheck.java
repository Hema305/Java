import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PalidromeCheck {
	private Palindrome checkPalindrome;
	
	@Before
	
	public void setup()
	{
		checkPalindrome=new Palindrome();
	}
	@Test

	public void forPositiveNumber() 
	{
		boolean result=checkPalindrome.findPalindrome(121);
		assertEquals(true,result);
		
	}
	@Test
	public void forNegativeNumber() 
	{
		boolean result=checkPalindrome.findPalindrome(-121);
		assertEquals(false,result);
		
	}
	@Test
	public void forSingleDigitNumber() 
	{
		boolean result=checkPalindrome.findPalindrome(1);
		assertEquals(false,result);
		
	}

}
