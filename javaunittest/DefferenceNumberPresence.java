
public class DefferenceNumberPresence {

	public boolean findNumber(int[] numbers, int value) {
		boolean result=false;
		for(int counter=0;counter<numbers.length;counter++)
		{
			for(int counter1=0;counter1<numbers.length;counter1++)
			{
				int difference = numbers[counter]-numbers[counter1];
				if(difference==value)
					result=true;
					
			}
		}
		return result;
	}

}
