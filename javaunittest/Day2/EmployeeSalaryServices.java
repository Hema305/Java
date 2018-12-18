
public class EmployeeSalaryServices {
private int monthlyBasic;
private String name;
private int medicalAllowance=1250;
private int conveyanceAllowance=800; 
private static int providentFund;
private static float PFRate;
	public int employeeAnualSalary() //getAnnualBasic() //(return 12 * monthlyBasic;)
	{
		
		return 12*monthlyBasic;
	}
	public int getMonthlyBasic() {
		return monthlyBasic;
	}
	public void setMonthlyBasic(int monthlyBasic) 
	{
		this.monthlyBasic = monthlyBasic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int employeeMonthlyGrossSalary()//getMonthlyGrossSalary()//(monthlyBasic + hra + medical + conveyance)
	{
		
		return monthlyBasic+hra()+medicalAllowance+conveyanceAllowance;
	}
	int hra()//HRA calculation
	{
		return (50*monthlyBasic)/100;
	}
	public int employeeAnualGrossSalary() //getAnnualGrossSalary() //(12 * MonthlyGrossSalary)
	{
		
		return 12*employeeMonthlyGrossSalary();
	}
	public int employeemonthlyDeductions()//getMonthlyDeductions() //(pf + esic + profTax)
	{
		
		return pf()+esic()+professionalTax();
	}
	int pf()//PF calculation
	{
			 providentFund=(int) ((PFRate*monthlyBasic)/100);
			if(providentFund<=6500)
				providentFund=6500;
			else
				providentFund=providentFund;
		return providentFund;
	}
	int esic()//ESIC calculation
	{
			int esic;
			if(monthlyBasic<=5000)
				esic=(int) ((4.75*monthlyBasic)/100);
			else 
				esic=0;
		return esic;
	}
	int professionalTax()//professional tax calculation
	{
		if(employeeMonthlyGrossSalary()<=10000)
			return 50;
		else
			return 100;                 
	}
	public static float getPFRate() {
		return PFRate;
	}
	public static void setPFRate(float pFRate) {
		PFRate = pFRate;
	}
	public int employeemonthlyTakeHome()//getMonthlyTakeHome() //(MonthlyGrossSalary- MonthlyDeductions)
	{
		
		return employeeMonthlyGrossSalary()-employeemonthlyDeductions();
	}
	public int employeeAnualTakeHome() {
		
		return 12*employeemonthlyTakeHome();
	}
	
	

}
