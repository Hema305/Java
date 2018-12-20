import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RemoveWordInString {
	private RemoveWordInGIvenString RemoveWordPerform;
	
	@Before
	public void setup()
	{
		RemoveWordPerform=new RemoveWordInGIvenString();
	}

	@Test
	public void testForSentence() {
		String input="A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY";
		String wordTogetRemove="IS";
		int position=6;
		String resultantSentence=RemoveWordPerform.RemoveWordAndSpacesInGivenString(input,wordTogetRemove,position);
		assertEquals("A MORNING WALK IS A BLESSING FOR THE WHOLE DAY ",resultantSentence);
	}
	@Test
	public void testForSentenceTwo() {
		String input="AS YOU    SOW, SO   SO YOU REAP";
		String wordTogetRemove="SO";
		int position=4;
		String resultantSentence=RemoveWordPerform.RemoveWordAndSpacesInGivenString(input,wordTogetRemove,position);
		assertEquals("AS YOU SOW, SO YOU REAP ",resultantSentence);
	}

}
