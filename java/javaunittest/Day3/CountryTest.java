import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountryTest {
	private  Countries countriesOne,countriesTwo,countriesThree,countriesFour,country;
	@Before
	public void setUp()
	{
		countriesOne = new Countries("India", 96685000, 58734);
		countriesTwo = new Countries("Australia",9000000, 5876);
		countriesThree = new Countries("America", 96445000, 587578);
		countriesFour = new Countries("Japan", 800000, 56755);
		country=new Countries();
		
		
	}
	@Test 
	public void countryWithLargestPopulationTest()
	{
		Countries countries[]={countriesOne, countriesTwo, countriesThree, countriesFour};
		String CountryName=country.countryWithLargestPopulation(countries);
		String expected="India";
		assertEquals(expected, CountryName);
		
	}
	@Test 
	public void countryWithLargestAreaTest()
	{
		Countries countries[]={countriesOne, countriesTwo, countriesThree, countriesFour};
		String CountryName=country.countryWithLargestArea(countries);
		String expected="America";
		assertEquals(expected, CountryName);
		
	}
	@Test 
	public void countryWithLargestPopulationDensityTest()
	{
		Countries countries[]={countriesOne, countriesTwo, countriesThree, countriesFour};
		String CountryName=country.countryWithLargestPopulationDensity(countries);
		String expected="India";
		assertEquals(expected, CountryName);
		
	}
	
	
	
}
