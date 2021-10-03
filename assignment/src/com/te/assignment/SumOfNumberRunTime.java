package com.te.assignment;

public class SumOfNumberRunTime {
	public static void main(String[] args) {
		int i,sum =0,length = args.length;
     	double average;
		for(i=0;i<args.length;i++) {
			sum=sum+Integer.parseInt(args[i]);
			
		}
		average=sum/length;
		System.out.println(sum);
		System.out.println(average);
	}

}
