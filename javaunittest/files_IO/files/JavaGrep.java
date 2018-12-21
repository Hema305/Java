package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaGrep {

	public String findLineNumberandLine(FileReader fr, String wordForSearch) throws IOException {
		String lineNumberAndLine="";
		String line="";
		int lineNumber=0;
		BufferedReader br=new BufferedReader(fr);
		   while ((line = br.readLine()) != null)
			     {
			 
			             lineNumber++;  
			    	 // split line using space as delimiter
			    	 String[] words = line.split(" ");
			    	 for(int counter=0;counter<words.length;counter++)
			    	 {
			    		if(words[counter].equals(wordForSearch))
			    		{
			    			
			    			lineNumberAndLine+=lineNumber+" "+line+"\n";
			    			 
			    			 
			    		}
			    	 }
			
			     }
		return lineNumberAndLine;
	}

}
