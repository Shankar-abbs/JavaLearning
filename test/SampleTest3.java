package com.basicprograms.test;

import java.util.Arrays;

//import java.util.*;

//@SuppressWarnings("unused")
public class SampleTest3 {

	public static void main(String[] args) {

		String s1 = "shankar";
		String s2 = "sankarh";
		System.out.println(anagrams(s1,s2));
	}
	static String anagrams(String s1, String s2) {
		char a[] = s1.toCharArray();
		char b[] = s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b))
			return "Strings are anagrams";
		else
			return "Both Strings are not anagrams";
	}
			
}
	


