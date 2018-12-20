
public class ComplexOfNumber {
		private double realPart;
		private double imaginaryPart;

	public ComplexOfNumber(double d, double e) {
			this.realPart=d;
			this.imaginaryPart=e;
			
		}



	public static String displayComplexNumber(ComplexOfNumber number) {
		
		String complexNumber=number.realPart+"+"+number.imaginaryPart+"i";
		return complexNumber;
	}

	public static String displayComplexNumbersSum(ComplexOfNumber complexOne, ComplexOfNumber complexTwo) {
		double realPartSum=complexOne.realPart+complexTwo.realPart;
		double imaginaryPartSum=complexOne.imaginaryPart+complexTwo.imaginaryPart;
		String sumValue=realPartSum+"+"+imaginaryPartSum+"i";
		return sumValue;
	}

}
