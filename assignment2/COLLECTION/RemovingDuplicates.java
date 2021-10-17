package com.ty.assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemovingDuplicates {

	public static void main(String[] args) {
		
		ArrayList<Integer> ref = new ArrayList();

		ref.add(11);
		ref.add(12);
		ref.add(10);
		ref.add(12);
		ref.add(57);
		ref.add(11);
		ref.add(25);
		ref.add(45);
		ref.add(30);
		
		//converting to LinkedHashSet using stream API
	    Set<Integer> s1=ref.stream().map(x->x).collect(Collectors.toCollection(LinkedHashSet::new));
	    
	    System.out.println("after removing duplicates ");
	    System.out.println(s1);

	}

}
