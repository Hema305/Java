package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadEmployee {

	public String readEmployeeAndWrite(FileReader fr) throws IOException {
		String line="";
		String details="";
		BufferedReader br=new BufferedReader(fr);
		 while ((line = br.readLine()) != null)
		 {
			 details+=line;
		 }
	    
		return details;	 	
	}

}
