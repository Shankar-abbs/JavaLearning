package com.basicprograms.loops;

public class PrimeRange {

	public static void main(String[] args) 
	{
		int i=1;
		
		for(;i<=100;)
		{
		int loop=1,count=0;
		for(;loop<=i;loop++)
		{
			if(i%loop==0)
				count++;
		}
		if(count==2)
			System.out.println(i+" is a prime number");
		i++;
		}
	}

}
