package com.te.assignment.userdefinedexception;

public class ExceptionTestMain {
	public static void main(String[] args) {
		
		try {
			MyException ref = new MyException("this is naveen");
			throw ref;
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
	}

}
