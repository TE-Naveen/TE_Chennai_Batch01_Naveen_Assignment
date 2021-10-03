package com.te.assignment.filereadwriteanddelete;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderOp {
	public static void main(String[] args) {
		int unicode =0;
		FileReader ref = null;
		try {
			 ref=new FileReader("C:\\Users\\david\\Desktop\\java.txt");
         	
			while ((unicode=ref.read())!=-1) {
				
		 		System.out.print((char)unicode);
		 		
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
