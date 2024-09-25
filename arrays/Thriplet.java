package com.basicprograms.arrays;

import java.util.HashSet;
import java.util.Set;

public class Thriplet {
	
	public static void main(String args[]) {
		
		String s = "The quick brown fox jumps over the lazy dog";
		
		s = s.toLowerCase();
		
		Set<Character> set = new HashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(ch>='a' && ch<='z') {
				set.add(ch);
			}
		}
		
		if(set.size()==26)System.out.println("Given String contains all alphabets");
		else System.out.println("Given String doesn not contains all alphabets");
		
		
	}
}
