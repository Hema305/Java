package com.files;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class JavaGrepTest {
	private JavaGrep searchWord;
	@Test
	public void searchWordtest() throws IOException {
		searchWord =new JavaGrep();
		FileReader fr=new FileReader("src\\com\\hema.txt");
		String wordForSearch="hema";
		String actualLineAndLineNumber=searchWord.findLineNumberandLine(fr,wordForSearch);
		String expectedLineAndLineNumber="2 how are you hema\n4 hey good girl hema\n";
		assertEquals(expectedLineAndLineNumber,actualLineAndLineNumber);
		
	}

}
