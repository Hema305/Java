package com.files;

import java.io.File;

public class FileExist {

	public boolean fileFoundChecking(File find) {
		if(find.exists())
		{
			return true;
		}
		
		return false;
	}

}
