package com.ty.assignment;

import java.util.*;

public class Occurence {

	public static void main(String[] args) {
		
		LinkedList<Integer> ref = new LinkedList();

		ref.add(11);
		ref.add(12);
		ref.add(10);
		ref.add(12);
		ref.add(57);
		ref.add(23);
		ref.add(16);
		ref.add(114);
		ref.add(15);
		
		System.out.println("=========list values==========");
		System.out.println(ref);
		
		System.out.println("=====first and last occurences");
		Object s1=ref.getFirst();
		Object s2=ref.getLast();
        
		System.out.println("first element "+" "+s1);
		System.out.println("last element "+" "+s2);

	}

}
