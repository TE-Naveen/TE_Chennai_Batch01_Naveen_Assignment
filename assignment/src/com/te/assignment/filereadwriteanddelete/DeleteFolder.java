package com.te.assignment.filereadwriteanddelete;

import java.io.File;

public class DeleteFolder {
	public static void main(String[] args) {
		
		File ref = new File("E:\\java");
		boolean bval = ref.exists();
		
		if(bval==true) {
			ref.delete();
			System.out.println("the folder deleted");
		}else {
			System.out.println("the folder is not exist");
			
		}
	}

}
