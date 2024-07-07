package com.basicprograms.loops;

public class EvensumOddproductsOfDigits 
{
	public static void main(String args[])
	{
		int n=4529,temp=n,evensum=0,oddpro=1;
		for(;temp>0;temp=temp/10)
		{
			int rem = temp%10;
			if(rem%2==0)
				evensum+=rem;
			else
				oddpro*=rem;
		}
		System.out.println("even digits sum in "+n+" is "+evensum);
		System.out.println("odd digits product in "+n+" is "+oddpro);
	}

}
