import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author hemalatha motupalli
 *
 */
public class LaptopTest {
	private  Laptop lenovo,mac,hp,lenovoOne,lenovoTwo;
	private Set<Laptop> laptopSets=new HashSet<Laptop>();
	@Test
	public void setUp()
	{
		lenovo=new Laptop("lenovo","g4","windows","i3");
		mac=new Laptop("mac","a5","android","i7");
		hp=new Laptop("hp","a7","unix","i3");
		lenovoOne=new Laptop("lenovo","g4","windows","i3");
		lenovoTwo=new Laptop("lenovo","g4","windows","i5");
		laptopSets.add(lenovo);
		laptopSets.add(mac);
		laptopSets.add(hp);
		laptopSets.add(lenovoOne);
		laptopSets.add(lenovoTwo);
		for (Laptop laptop : laptopSets) {
			System.out.println(laptop);
		}
	}


	@Test
	public void testToObjectsAreSameOrNot() {
		lenovo=new Laptop("lenovo","g4","windows","i3");
		mac=new Laptop("mac","a5","android","i7");
		hp=new Laptop("hp","a7","unix","i3");
		lenovoOne=new Laptop("lenovo","g4","windows","i3");
		lenovoTwo=new Laptop("lenovo","g4","windows","i5");
		boolean result=lenovo.equals(lenovoTwo);
		assertEquals(true,result);
	}
		
	@Test
	public void toTestmodelAndCompanySame() {
		lenovo=new Laptop("lenovo","g4","windows","i3");
		mac=new Laptop("mac","a5","android","i7");
		hp=new Laptop("hp","a7","unix","i3");
		lenovoOne=new Laptop("lenovo","g4","ubuntu","i3");
		lenovoTwo=new Laptop("lenovo","g4","windows","i5");
		boolean result=lenovo.equals(lenovoOne);
		assertEquals(true,result);
	}
			
	@Test
	public void toTestmodelAndCompanyNotSame() {
		lenovo=new Laptop("lenovo","g4","windows","i3");
		mac=new Laptop("mac","a5","android","i7");
		hp=new Laptop("hp","a7","unix","i3");
		lenovoOne=new Laptop("lenovo","g4","windows","i3");
		lenovoTwo=new Laptop("lenovo","g4","windows","i5");
		boolean result=lenovo.equals(hp);
		assertEquals(false,result);
					
	}

}
