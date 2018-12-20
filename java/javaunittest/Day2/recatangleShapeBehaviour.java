
public class recatangleShapeBehaviour {
	int legthOfRecatangleOne,breadthOfRectangleOne,area1,area2,legthOfRecatangleTwo,breadthOfRectangleTwo,firstParemeter,secondParemeter;
	public recatangleShapeBehaviour() {
		// TODO Auto-generated constructor stub
	}
	public int rectangleOneParemeterValue(int lengthOfRecatangleOne,int breadthOfRectangleOne )
	{
		firstParemeter= 2*(lengthOfRecatangleOne+breadthOfRectangleOne);
		
		return firstParemeter;
		
	}
	public int rectangleTwoParemeterValue(int lengthOfRecatangleTwo,int breadthOfRectangleTwo ) {
		
		secondParemeter= 2*(lengthOfRecatangleTwo+breadthOfRectangleTwo);		
		return secondParemeter;
	}
	public boolean findRectangleParemetersAreEqual(
			int rectangleOneParemeterValue, int rectangleTwoParemeterValue) {
		boolean val;
			if(rectangleOneParemeterValue==rectangleTwoParemeterValue)
				
				val= true;
			else
				val= false;
		
		return val;
		
	}
	public int rectangleOneAreaValue(int lengthOfRecatangleOne,int breadthOfRectangleOne) {
				return lengthOfRecatangleOne*breadthOfRectangleOne;
	}
	public int rectangleTwoAreaValue(int lengthOfRecatangleTwo,int breadthOfRectangleTwo) {
				return lengthOfRecatangleTwo*breadthOfRectangleTwo;
	}
	public boolean findRectangleAreassAreEqual(int rectangleOneAreaValue,
			int rectangleTwoAreaValue) {
		boolean val;
		if(rectangleOneAreaValue==rectangleTwoAreaValue)
			
			val= true;
		else
			val= false;
	
	return val;
	}
	

}
