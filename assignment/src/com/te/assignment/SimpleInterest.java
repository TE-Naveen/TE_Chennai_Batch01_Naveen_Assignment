package com.te.assignment;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String[] args) {
		/*
		 * double si;//Is=simple interest 
		 * int p=10000;//p=principle of amount double
		 * r=12.5;//r= rate of interest 
		 * double n=2.5;//n=number of years 
		 *  we can apply formula simple interest=(p*n*r)/100
		 */
		double si;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principle amount");
		int p = scan.nextInt();
		System.out.println("Enter the rate of interest");
		double r = scan.nextDouble();
		System.out.println("Enter the number of years");
		double n = scan.nextDouble();

		si = (p * n * r) / 100;
		System.out.println("the simple interest :" + si);

	}

}


