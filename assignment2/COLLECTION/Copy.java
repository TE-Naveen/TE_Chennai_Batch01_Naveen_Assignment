package com.ty.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Copy implements Cloneable {

	public static void main(String[] args) {
		
		ArrayList<Integer> ref = new ArrayList();

		ref.add(11);
		ref.add(12);
		ref.add(10);
		ref.add(12);
		ref.add(57);
		ref.add(23);
		ref.add(16);
		ref.add(114);
		ref.add(15);

		 ArrayList<Integer> ref1=ref;// by shallow copy
		 
		 ArrayList<Integer> obj=( ArrayList<Integer>) ref.clone();//by clone method
		 
		 ArrayList<Integer> ref2=new ArrayList(ref);//by directly passing to the constructor
		 
		 System.out.println(ref2);
		 
		 System.out.println(obj);
		 
		 Iterator<Integer> itr=ref.iterator();
		 Iterator<Integer> itr1=ref1.iterator();
		 Iterator<Integer> itr2=obj.iterator();
		 
		 for (Integer integer : obj) {
			System.out.print(integer+" ");
		}
		 
		 System.out.println();
		 
		 for (Integer integer1 : ref) {
			System.out.print(integer1+" "); 
		 }
		 
		 System.out.println();
		 
		 for (Integer integer2 : ref1) {
			 System.out.print(integer2+" ");
		 }
		 
		 
		 
		 

	}

}
