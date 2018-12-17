
public class DistanceOfNumber {
	int feet;
	double inches;

	public DistanceOfNumber(int i, double d) {
		if(i>0 && d >0){
		this.feet=i;
		this.inches=d;
		}
	}

	public static String displayDistanceOfNumber(DistanceOfNumber number) {
		String distanceOfNumber=number.feet+","+number.inches;
		return distanceOfNumber;
	}

	public static String displayDistanceOfSum(DistanceOfNumber distanceOne, DistanceOfNumber distanceTwo) {
		int feetSum=distanceOne.feet+distanceTwo.feet;
		double inchesSum=distanceOne.inches+distanceTwo.inches;
		String sumValue=feetSum+","+inchesSum;
		return sumValue;
	}
	

}
