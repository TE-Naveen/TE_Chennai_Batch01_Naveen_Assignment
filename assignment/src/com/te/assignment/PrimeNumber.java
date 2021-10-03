package com.te.assignment;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void prime(int number) {
		if(number==1||number==2) {
			System.out.println("prime");
			return;
		}
		for(int i=2; i<=number;i++) {
			
			if(number%i==0){
				System.out.println(" not prime number");
				break;
			}
			else {
				System.out.println("prime");
				break;
			}
		}
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter");
	int number= scanner.nextInt();
	    prime(number);
	
	
	
}
}
