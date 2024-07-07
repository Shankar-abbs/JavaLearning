package com.basicprograms.StringBuffer;
public class Capacity
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("malayalam");
		StringBuffer sb1 = new StringBuffer(sb).reverse();
		String s = "Hello";
		StringBuilder sb2 = new StringBuilder("Hello");
		StringBuilder sb3 = new StringBuilder("Hello");
	
		System.out.println(s.contentEquals(sb));
		System.out.println(s.contentEquals(sb2));
		
		System.out.println(sb);
		System.out.println(sb.compareTo(sb1));
		System.out.println(sb2.compareTo(sb3));
		
		System.out.println(sb.compareTo(sb1)==0?"palindrome":"not a palindrome");
		
	}
}
