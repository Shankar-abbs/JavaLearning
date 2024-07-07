package com.basicprograms.classes;

public class PalinClass 
{

	public static void main(String[] args) 
	{
		Abc obj = new Abc();
		String s = obj.Palin();
		System.out.println("It is "+s);
	}
}
class Abc
{	int n=132;
	int rev()
	{
		int temp=n,rev=0;
		for(;temp>0;temp/=10)
		{
			int rem = temp%10;
			rev = rev*10+rem;
		}
		return rev;
	}
	String Palin()
	{
		int rev = rev();
		return (n==rev)?"a Palindrome":"not a palindrome";
	}
}
