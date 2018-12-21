package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileNumberOfLines {
	    int lineCount=0;
    

	public int checkNumberOfLines(FileReader fr) throws IOException {
		 BufferedReader br=new BufferedReader(fr);
		 while(br.readLine()!=null)
		 {
			 lineCount++;
		 }
		return lineCount;
	}


}
