package com.basicprograms.Strings;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String s1 = "adecimalpoint";
		String s2 = "imadotinplace";
		
		Anagram1 ag = new Anagram1();
		System.out.println(ag.checkAg(s1, s2));
	}
}
class Anagram1
{
	String checkAg(String str1, String str2)
	{
		String s1 = str1.toLowerCase();
		String s2 = str2.toLowerCase();
		if(s1.length()!=s2.length())
			return str1+" and "+str2+" are not Anagrams";
		else{
			char[] a = s1.toCharArray();
			char[] b = s2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			if(Arrays.compare(a,b)==0)
				return "Anagrams";
			else
				return "Not Anagrams";
		}
	}
}
