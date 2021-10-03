package com.te.assignment;

public class TryWithMultipleCatch {
	int ivalue= 23;
	public static void main(String[] args) {


		TryWithMultipleCatch ref =null;
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println(c);
			System.out.println(ref.ivalue);
			
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("arithematic");

		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("null pointer");
		}

	}
}
