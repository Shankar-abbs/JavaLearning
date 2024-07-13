package com.basicprograms.collections;

import java.util.*;

public class SampleC3 {

	public static void main(String[] args) {
		
		Integer a[] = {18,17,16,17,19,19,11,12,11,12};
		
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(a));
//		Set set = new HashSet();
		ArrayList<Integer> uniq = new ArrayList<Integer>();
		System.out.println("Elements in array");
		System.out.println(al);
		System.out.println("Unique Values");
		for(int x=0;x<al.size();x++){
			if(al.indexOf(al.get(x))==al.lastIndexOf(al.get(x))) {
				System.out.print(al.get(x)+" ");			
			}
			else {
//				set.add(al.get(x));
				if(uniq.indexOf(al.get(x))==-1) {
					uniq.add(al.get(x));
				}
			}
		}
		System.out.println("\nDuplicate Elements in Array");
//		System.out.println(set);
		System.out.println(uniq);
	}

}
