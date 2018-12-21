package com.files;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class ReadEmployeeTest {
	private ReadEmployee readEmployee; 
	@Test
	public void readEmployeetest() throws IOException {
		readEmployee=new ReadEmployee();
		FileReader fr=new FileReader("src\\com\\employee.txt");
		String employeeDetails=readEmployee.readEmployeeAndWrite(fr);
		String expected="Employee [employeeId=305, employeeName=Hema, salary=50000.0]";
		assertEquals(expected, employeeDetails);
	}

}
