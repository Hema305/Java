package com.files;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class FileNumberOfWordsTest {
	private FileWordCount fileWordCount;
	@Test
	public void numberOfWordsTest() throws IOException {
		fileWordCount =new FileWordCount();
		FileReader fr=new FileReader("src\\com\\hema.txt");
		int numberOfWordsInFile=fileWordCount.checkNumberOfWords(fr);
		int expected=11;
		assertEquals(expected,numberOfWordsInFile);
		
	}
	@Test
	public void numberOfWordsTestAgain() throws IOException {
		fileWordCount =new FileWordCount();
		FileReader fr=new FileReader("src\\com\\text.txt");
		int numberOfWordsInFile=fileWordCount.checkNumberOfWords(fr);
		int expected=4;
		assertEquals(expected,numberOfWordsInFile);
		
	}

}
