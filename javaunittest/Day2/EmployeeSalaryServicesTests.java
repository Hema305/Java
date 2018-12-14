import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class EmployeeSalaryServicesTests {
	private EmployeeSalaryServices FindEmployeeSalaryServices;

	@Before
	public void setup() {
		FindEmployeeSalaryServices=new EmployeeSalaryServices();
		FindEmployeeSalaryServices.setMonthlyBasic(50000);
		FindEmployeeSalaryServices.setName("Hema");
		FindEmployeeSalaryServices.setPFRate(10);
		
		
	}
	@Test
	public void toGetAnnualBasic()
	{   
		int annualBasic =FindEmployeeSalaryServices.employeeAnualSalary();
		assertEquals(600000,annualBasic);
	}
	@Test
	public void toGetMonthlyGrossSalary()
	{   
		int monthlyGrossSalary =FindEmployeeSalaryServices.employeeMonthlyGrossSalary();
		assertEquals(77050,monthlyGrossSalary);
	}
	@Test
	public void toGetAnnualGrossSalary()
	{   
		int annualGrossSalary =FindEmployeeSalaryServices.employeeAnualGrossSalary();
		assertEquals(924600,annualGrossSalary);
	}
	@Test
	public void toGetMonthlyDeductions()
	{   
		int monthlyDeductions =FindEmployeeSalaryServices.employeemonthlyDeductions();
		assertEquals(6600,monthlyDeductions);
	}
	@Test
	public void toGetMonthlyTakeHome()
	{   
		int monthlyTakeHome =FindEmployeeSalaryServices.employeemonthlyTakeHome();
		assertEquals(70450,monthlyTakeHome);
	}
	@Test
	public void toGetAnualTakeHome()
	{   
		int anualTakeHome =FindEmployeeSalaryServices.employeeAnualTakeHome();
		assertEquals(845400,anualTakeHome);
	}
}