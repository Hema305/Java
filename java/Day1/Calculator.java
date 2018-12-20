class Calculator
{
	
	public static void main(String arg[])
	{
		System.out.println("Addition of numbers is ="+add(5,6));
		System.out.println("Subtraction of numbers is ="+sub(6,5));
		System.out.println( "Multiplication of numbers is ="+mul(5,6));
		System.out.println("Division of numbers is ="+div(30,6));
	}
	static void display()
	{
		System.out.println("disc");	
	}
	static float add(float numberOne,float numberTwo)
	{
		

		return (numberOne+numberTwo);
	}
	static float sub(float numberOne,float numberTwo)
	{
	

		return (numberOne-numberTwo);
	}
	static float mul(float numberOne,float numberTwo)
	{
		

		return (numberOne*numberTwo);
	}
	static float div(float numberOne,float numberTwo)
	{
		

		return (numberOne/numberTwo);
	}


}