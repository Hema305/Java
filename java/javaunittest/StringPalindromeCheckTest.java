import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringPalindromeCheckTest {
	private StringPalindrome StringPalindromeObject;
	@Before
	public void setup()
	{
		StringPalindromeObject=new StringPalindrome();
	}
	@Test
	public void checkPalindrome() {
		String names[]={"Hema","amma","kalyan","nanna","nitin"};
		String exp[]={"amma","nitin"};
		
		String[] palindrome=StringPalindromeObject.checkPlaindrome(names);
		assertArrayEquals(exp,palindrome);
	}
	@Test
	public void checkLength(){
		int num[]={4,5};
		String exp[]={"amma","nitin"};
		int[] length=StringPalindromeObject.lengthOfPalindrome(exp);
		assertArrayEquals(num,length);
	}
		
		//String [] Desc=StringPalindromeObject.findDesc(palindrome);
		
		
		
		
	}

