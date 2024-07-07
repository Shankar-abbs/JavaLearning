package com.basicprograms.loops;

public class Sample1 
{

	public static void main(String[] args) 
	{
		int n=145,sum=0,temp=n;
		for(;n>0;n/=10)
		{
			int fact=1;
			int rem = n % 10;
			for(int loop=1;loop<=rem;loop++)
			{
				fact = fact * loop;
			}
			sum += fact;
		}
		System.out.println((temp==sum)?temp+" is a strong number":temp+" is not a strong number");
	}
}
