import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;


public class CarNamesTest {
	private CarNamesOrder carOne,carTwo,carThree,carFour;
	private Set<CarNamesOrder> carSets=new HashSet<CarNamesOrder>();
	@Test
	public void setUp()
	{
		carOne=new CarNamesOrder("Honda","Civic",1980,700000);
		carTwo=new CarNamesOrder("Audi","5000s",1985,6000000);
		carThree=new CarNamesOrder("Suzuki","SJ",1989,500000);
		carFour=new CarNamesOrder("Audi","5000s",1985,6000000);
		//carFour=new Car("Toyota", "MR2",1992,300000);
		
		
		carSets.add(carOne);
		carSets.add(carTwo);
		carSets.add(carThree);
		carSets.add(carFour);
		
		for (CarNamesOrder car : carSets) {
			System.out.println(car);
		}
	}
	@Test
	public void testToObjectsAreSameOrNot() {
		carOne=new CarNamesOrder("Honda","Civic",1980,700000);
		carTwo=new CarNamesOrder("Audi","5000s",1985,6000000);
		carThree=new CarNamesOrder("Suzuki","SJ",1989,500000);
		carFour=new CarNamesOrder("Audi","5000s",1985,6000000);
		boolean result=carTwo.equals(carFour);
		assertEquals(true,result);
	}
	
	@Test
	public void toTestMakeAndModelAreSame() {
		carOne=new CarNamesOrder("Honda","Civic",1980,700000);
		carTwo=new CarNamesOrder("Audi","5000s",1985,6000000);
		carThree=new CarNamesOrder("Suzuki","SJ",1989,500000);
		carFour=new CarNamesOrder("Audi","5000s",1987,6000000);
		boolean result=carTwo.equals(carFour);
		assertEquals(true,result);
	}
			
	@Test
	public void toTestMakeAndModelAreNotSame() {
		carOne=new CarNamesOrder("Honda","Civic",1980,700000);
		carTwo=new CarNamesOrder("Audi","5000s",1985,6000000);
		carThree=new CarNamesOrder("Suzuki","SJ",1989,500000);
		carFour=new CarNamesOrder("Audi","5000s",1985,6000000);
		boolean result=carTwo.equals(carThree);
		assertEquals(false,result);
		
				
	}

}
