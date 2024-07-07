package com.basicprograms.classes;

public class PrimeRangetill 
{
	static int n=1,primerange=1;
	public static void main(String[] args) 
	{
		int k=18;
		for(;primerange<=100;)
		{
			if(isprime())
			{
				if(primerange==k)
					System.out.println(primerange+" th prime number is "+n);
				primerange++;
			}
			n++;
		}
	}
	static boolean isprime()
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
			return true;
		else
			return false;
	}
}
