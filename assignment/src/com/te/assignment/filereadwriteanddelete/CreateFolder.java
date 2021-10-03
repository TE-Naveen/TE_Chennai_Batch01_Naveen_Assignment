package com.te.assignment.filereadwriteanddelete;

import java.io.File;

public class CreateFolder {
	public void createFloder(String name) {
		File file = new File(name);
		boolean ref =file.exists();
		if(ref==false) {
			file.mkdir();
			System.out.println("folder created");
		}else {
			System.out.println("already folder exist");
		}
	
	}
}
