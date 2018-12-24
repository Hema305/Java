import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;


public class TelevisionTest {
	private Television tvOne,tvTwo,tvThree,tvFour;
	private Set<Television> tvSets=new HashSet<Television>();

	@Test
	public void setUp()
	{
		tvOne=new Television("LG","LCD",true,20000);
		tvTwo=new Television("SONY","plasma",false,9000);
		tvThree=new Television("SAMSUNG","LED",false,4000);
		tvFour=new Television("SONY","plasma",false,9000);
	
		
		
		tvSets.add(tvOne);
		tvSets.add(tvTwo);
		tvSets.add(tvThree);
		tvSets.add(tvFour);
		
		for (Television tv : tvSets) {
			System.out.println(tv);
		}
	}
	@Test
	public void testTwoObjectsAreSameOrNot() {
		tvOne=new Television("LG","LCD",true,20000);
		tvTwo=new Television("SONY","plasma",false,9000);
		tvThree=new Television("SAMSUNG","LED",false,4000);
		tvFour=new Television("SONY","plasma",false,9000);
	
		boolean result=tvTwo.equals(tvFour);
		assertEquals(true,result);
	}
	
	@Test
	public void toTestMakeAndModelAreSame() {
		tvOne=new Television("LG","LCD",true,20000);
		tvTwo=new Television("SONY","plasma",false,9000);
		tvThree=new Television("SAMSUNG","LED",false,4000);
		tvFour=new Television("SONY","plasma",false,9000);
	
		boolean result=tvTwo.equals(tvFour);
		assertEquals(true,result);
	}
			
	@Test
	public void toTestMakeAndModelAreNotSame() {
		tvOne=new Television("LG","LCD",true,20000);
		tvTwo=new Television("SONY","plasma",false,9000);
		tvThree=new Television("SAMSUNG","LED",false,4000);
		tvFour=new Television("SONY","plasma",false,9000);
	
		boolean result=tvTwo.equals(tvThree);
		assertEquals(false,result);
		
				
	}

}
