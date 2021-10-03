package com.te.assignment.filereadwriteanddelete;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	void createFile(String path) {
		File file = new File(path);
		boolean ref =file.exists();
		if(ref==false) {
			try {
				file.createNewFile();
				System.out.println("file created");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			System.out.println("file exist");
		}
		

	}
}
