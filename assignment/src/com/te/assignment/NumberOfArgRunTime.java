package com.te.assignment;

public class NumberOfArgRunTime {
	public static void main(String[] args) {
		System.out.println("Argument passed at runtime ");
		
		for (int i = 0; i < args.length; i++) {
			
			System.out.println("argument" + i + "="
			                   + args[i]);
		}
	}

}
