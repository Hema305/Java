package com.files;

import static org.junit.Assert.*;

import java.io.FileWriter;

import org.junit.Test;

public class EmployeeTest {
	private Employee employeeDetails;
	@Test
	public void employeeDetailsWriteTest() {
		employeeDetails=new Employee(305,"Hema",50000);
		String result=employeeDetails.toString();
		   try{    
	           FileWriter fw=new FileWriter("src\\com\\employee.txt");    
	           fw.write(result);    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	         assertEquals("Employee [employeeId=305, employeeName=Hema, salary=50000.0]",result);
	
	}

}
