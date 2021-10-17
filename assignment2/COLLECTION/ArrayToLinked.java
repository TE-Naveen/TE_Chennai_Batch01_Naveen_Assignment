package com.ty.assignment;

import java.util.*;

public class ArrayToLinked {

	public static void main(String[] args) {
		
		ArrayList<Integer> ref = new ArrayList();

		ref.add(11);
		ref.add(12);
		ref.add(10);
		ref.add(12);
		ref.add(57);
		
		System.out.println(ref);
		
		LinkedList<Integer> li=new LinkedList<Integer>(ref);//converting to Linked List
		
		System.out.println(li);//

	}

}
