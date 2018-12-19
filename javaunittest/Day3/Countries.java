
public class Countries {
private String countryName="";
private int population;
private int area;
	public Countries(String countryName, int population, int area) {
		this.countryName=countryName;
		this.population=population;
		this.area=area;
	}
	public Countries() {
		
	}
	

	public String countryWithLargestArea(Countries[] countries)
	{
			int largestArea=-10000000,position=0;
			for(int counter=0;counter<countries.length;counter++)
			{
				if(largestArea<countries[counter].area)
				{
					largestArea=countries[counter].area;
					position=counter;
				}
			}
			
			return countries[position].countryName;
		
	}
	public String countryWithLargestPopulation(Countries[] countries) {
		int largestPopulation=-1000000000,positionOne=0;
		for(int counter=0;counter<countries.length;counter++)
		{
			if(largestPopulation<countries[counter].population)
			{
				largestPopulation=countries[counter].population;
				positionOne=counter;
			}
		}
		
		return countries[positionOne].countryName;
	}
	public String countryWithLargestPopulationDensity(Countries[] countries) {
		int largestPopulation=-1000000000,positionTwo=0,populationDensity=0;
		for(int counter=0;counter<countries.length;counter++)
		{
			populationDensity=countries[counter].population/countries[counter].area;
			if(largestPopulation<countries[counter].population/countries[counter].area)
			{
				largestPopulation=countries[counter].population/countries[counter].area;
				positionTwo=counter;
			}
		}
		
		return countries[positionTwo].countryName;
	}

}
