
public class findPerticularElementInArray {

	public boolean checkElementPresence(int[][] numbers, int number) {
		boolean value = false; 
		for(int row=0;row<numbers.length;row++)
		{
			for(int column=0;column<numbers[row].length;column++)
			{
				if(numbers[row][column]==number)
					value=true;
			}
			
		}
		return value;
	}

}
