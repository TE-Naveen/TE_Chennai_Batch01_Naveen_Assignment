package com.ty.assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SpecifiedPosition {

	public static void main(String[] args) {

			List<Integer> ref = new LinkedList();

			ref.add(11);
			ref.add(12);
			ref.add(10);
			ref.add(12);
			ref.add(57);
			
			Iterator<Integer> itr=ref.listIterator(1);//starting from index 1 (we can write 2 for second and so on
			while(itr.hasNext()) {
				System.out.print(itr.next()+" ");
			}
	}

}
