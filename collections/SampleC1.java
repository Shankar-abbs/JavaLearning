package com.basicprograms.collections;
import java.util.*;
public class SampleC1 {

	public static void main(String[] args) 
	{
		ArrayList <Integer> al = new ArrayList<Integer>();
		al.add(null);
		al.add(1);
		al.add(5);
		al.add(1);
		al.add(5);
		al.add(2);
		al.add(4);
		System.out.println("In ArrayList");
		System.out.println(al);
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(al);
		System.out.println("In set");//It doesnt allow duplicate values
		System.out.println(set);
	}

}
