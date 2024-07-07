package com.basicprograms.loops;

public class Palindrom 
{
	public static void main(String args[])
	{
		int n=182,temp=n,ans=0;
		for(;temp>0;temp=temp/10)
		{
			int rem = temp%10;
			ans = ans*10+rem;
			
		}
		System.out.println((n==ans)?n+" is palindrom":n+" is not a palindrom");
	}

}
