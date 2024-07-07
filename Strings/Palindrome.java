package com.basicprograms.Strings;
public class Palindrome {
	public static void main(String[] args)
	{
		int i = 12321;
		String s1 = Integer.toString(i);
		String s2 = new StringBuffer(s1).reverse().toString();
		System.out.println((s1.equals(s2))?s1+" is a palindrome":s1+" is not a palindrome");
	}
}
