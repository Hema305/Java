package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWordCount {
	int wordCount=0;
	String line="";
	public int checkNumberOfWords(FileReader fr) throws IOException {
		
		BufferedReader br=new BufferedReader(fr);
		// Read line from file
	     while ((line = br.readLine()) != null)
	     {
	 
	               
	    	 // split line using space as delimiter
	    	 String[] words = line.split(" ");
		     
		     wordCount = wordCount + words.length;//word counting
		 
	   
	    
	     }        
		 
		return wordCount;
	}

}
