package com.basicprograms.loops;

public class Twisted_prime {

	public static void main(String[] args) 
	{
		int n=13,rev=0,count=0;
		for(int i=1;i<=13;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			for(;n>0;n/=10)
			{
				int rem=n%10;
				rev = rev*10+rem;
			}
		}
	}
}

