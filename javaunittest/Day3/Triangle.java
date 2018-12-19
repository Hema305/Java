public class Triangle {
	private float sideOne,sideTwo,sideThree;
	private int angleOne,angleTwo,angleThree;
	
	
	
	public Triangle(float sideOne, float sideTwo, float sideThree, int angleOne,
			int angleTwo, int angleThree) {
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
		this.angleOne = angleOne;
		this.angleTwo = angleTwo;
		this.angleThree = angleThree;
	}
	public Triangle() {
	}
	public boolean isRight(){
		if((angleOne==90)&&(angleTwo<90)&&(angleThree<90)&&((angleOne+angleTwo+angleThree)==180)){
			return true;
		}
		else
			return false;
		
	}
	public boolean isScalene(){
		if(((sideOne!=sideTwo)&&(sideTwo!=sideThree)&&(sideThree!=sideOne))&&((angleOne!=angleTwo)&&(angleTwo!=angleThree)&&(angleThree!=angleOne))&&(angleOne+angleTwo+angleThree==180)){
			return true;
		}
		else
			return false;
	}
	public boolean isIscoceles(){
		if(((sideOne==sideTwo)||(sideTwo==sideThree)||(sideThree==sideOne))&&((angleOne==angleTwo)||(angleTwo==angleThree)||(angleTwo==angleThree)&&((angleOne+angleTwo+angleThree)==180))){
			return true;
		}
		else
			return false;
	}
	public boolean isEquilateral(){
		if(((sideOne==sideTwo)&&(sideTwo==sideThree))&&((angleOne==angleTwo)&&(angleTwo==angleThree)&&((angleOne+angleTwo+angleThree)==180))){
			return true;
		}
		else
		return false;
	}
}