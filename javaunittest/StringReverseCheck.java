import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringReverseCheck {
	private SentenceReverse sentenceReverseObject;
	
	@Before
	public void setup()
	{
		sentenceReverseObject=new SentenceReverse();
	}
	
	@Test
	public void CheckReversedSentece()
	{
		String reversedSentence=sentenceReverseObject.findReverseOfSentence("Let's take LeetCode contest");
		assertEquals("s'teL ekat edoCteeL tsetnoc",reversedSentence);
	}

}
