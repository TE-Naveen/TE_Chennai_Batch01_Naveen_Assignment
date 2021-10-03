package com.te.assignment;

public class NestedTry {
	int id =3;
	public static void main(String[] args) {
		NestedTry ref =null;
		try {
			  System.out.println(ref.id);
			try {
				int a= 20;
				int b= 0;
				int c = a/b;
				System.out.println(c);
			}catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("arithmetic handled");
			}
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("nullpointer handled");
			
		}
	}

}
