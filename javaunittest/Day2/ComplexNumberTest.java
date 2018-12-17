import static org.junit.Assert.*;

import org.junit.Test;


public class ComplexNumberTest {

	private ComplexOfNumber complexOne,complexTwo,complexSum;

	@Test
	public void complexNumberOneDisplayTest() {
		complexOne=new ComplexOfNumber(4.5,8.9);
		String ComplexNumber=ComplexOfNumber.displayComplexNumber(complexOne);
		
		assertEquals("4.5+8.9i",ComplexNumber);
		
	}
	@Test
	public void complexNumberTwoDisplayTest() {
		complexTwo=new ComplexOfNumber(3.5,0.1);
		String ComplexNumber=ComplexOfNumber.displayComplexNumber(complexTwo);
		
		assertEquals("3.5+0.1i",ComplexNumber);
		
	}
	@Test
	public void complexNumberSumTest() {
		complexOne=new ComplexOfNumber(4.5,8.9);
		complexTwo=new ComplexOfNumber(3.5,0.1);
		String complexNumberSum=ComplexOfNumber.displayComplexNumbersSum( complexOne,complexTwo);
		
		assertEquals("8.0+9.0i",complexNumberSum);
		
	}

	@Test
	public void minusComplexNumberOneDisplayTest() {
		complexOne=new ComplexOfNumber(-4.5,-8.9);
		String ComplexNumber=ComplexOfNumber.displayComplexNumber(complexOne);
		
		assertEquals("-4.5+-8.9i",ComplexNumber);
		
	}
	@Test
	public void minusComplexNumberTwoDisplayTest() {
		complexTwo=new ComplexOfNumber(-3.5,-0.1);
		String ComplexNumber=ComplexOfNumber.displayComplexNumber(complexTwo);
		
		assertEquals("-3.5+-0.1i",ComplexNumber);
		
	}
	@Test
	public void minusComplexNumberSumTest() {
		complexOne=new ComplexOfNumber(-4.5,-8.9);
		complexTwo=new ComplexOfNumber(-3.5,-0.1);
		String complexNumberSum=ComplexOfNumber.displayComplexNumbersSum( complexOne,complexTwo);
		
		assertEquals("-8.0+-9.0i",complexNumberSum);
		
	}

}

