package com.te.assignment.filereadwriteanddelete;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteOp {
	public static void main(String[] args) {
		
		try {
			FileWriter ref = new FileWriter("C:\\Users\\david\\Desktop\\java.txt");
			ref.write("this is naveen");
			ref.flush();
			ref.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
