package com.basicprograms.basics;

public class Sample 
{
	public static int n=1;
	public static void main(String[] args)
	{
	
		for(n=1;n<=500;n++)
		{
			if(palin())
			{
				System.out.println(n+" is palindrome");
			}
		}
	}

	public static boolean palin() {
		int temp=n,rev=0;
		for(;temp>0;temp/=10)
		{
			int rem = temp%10;
			rev = rev*10+rem;
		}
		if(rev==n)
		{
			return true;
		}
		else
			return false;
		}
	
}

