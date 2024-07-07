package com.basicprograms.Strings;
public class PalindromesInString 
{
	public static void main(String[] args) 
	{
		String s = "madam arora teaches malayalam";
		String[] a = s.split(" ");
		System.out.println(s);
		System.out.println("Contains these palindromes");
		
		for(String t: a)
		{
			String s1 = new StringBuffer(t).reverse().toString();
			if(s1.equals(t))
			{
				System.out.println(t);
			}
		}
	}
}
