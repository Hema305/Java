import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringInStringArrayTest {
	private WordPresent object;
@Before
public void setup()
{
	object=new WordPresent();
}
	

	@Test
	public void test() {
		String names[]={"hema","latha","kalyan","hema","ash","yeshi","saj","amrutha","Santhosh","Naveen","Bhanu","Bindu"};
		int result=object.CheckPresence(names,"hema");
		assertEquals(2,result);
	}

}
