package com.basicprograms.collections;
import java.util.*;
public class SampleC2 {

	public static void main(String[] args) 
	{
		int a[] = {12,5,6,2,12,9,8,6,18};	
		ArrayList<Integer> al = new ArrayList<Integer>();
		Set <Integer>set = new TreeSet<Integer>();	
		for(int t:a)
		{
			set.add(t);
		}	
		System.out.println(set);
		Collections.sort(al);
		System.out.println("Using ArrayList Sort");
		System.out.println(al);
	}
}
