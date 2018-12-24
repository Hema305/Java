import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;


public class CarTest {
	private Car carOne,carTwo,carThree,carFour;
	private Set<Car> carSets=new HashSet<Car>();
	
	@Test
	public void setUp()
	{
		carOne=new Car("Honda","Civic",1980,700000);
		carTwo=new Car("Audi","5000s",1985,6000000);
		carThree=new Car("Suzuki","SJ",1989,500000);
		carFour=new Car("Audi","5000s",1985,6000000);
		//carFour=new Car("Toyota", "MR2",1992,300000);
		
		
		carSets.add(carOne);
		carSets.add(carTwo);
		carSets.add(carThree);
		carSets.add(carFour);
		
		for (Car car : carSets) {
			System.out.println(car);
		}
	}
	@Test
	public void testToObjectsAreSameOrNot() {
		carOne=new Car("Honda","Civic",1980,700000);
		carTwo=new Car("Audi","5000s",1985,6000000);
		carThree=new Car("Suzuki","SJ",1989,500000);
		carFour=new Car("Audi","5000s",1985,6000000);
		boolean result=carTwo.equals(carFour);
		assertEquals(true,result);
	}
	
	@Test
	public void toTestMakeAndModelAreSame() {
		carOne=new Car("Honda","Civic",1980,700000);
		carTwo=new Car("Audi","5000s",1985,6000000);
		carThree=new Car("Suzuki","SJ",1989,500000);
		carFour=new Car("Audi","5000s",1987,6000000);
		boolean result=carTwo.equals(carFour);
		assertEquals(true,result);
	}
			
	@Test
	public void toTestMakeAndModelAreNotSame() {
		carOne=new Car("Honda","Civic",1980,700000);
		carTwo=new Car("Audi","5000s",1985,6000000);
		carThree=new Car("Suzuki","SJ",1989,500000);
		carFour=new Car("Audi","5000s",1985,6000000);
		boolean result=carTwo.equals(carThree);
		assertEquals(false,result);
		
				
	}

}
