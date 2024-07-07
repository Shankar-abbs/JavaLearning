package com.basicprograms.loops;

public class Co_prime {

	public static void main(String[] args) 
	{
		int a=4,b=7,hcf=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				if(b%i==0)
				{
					hcf=(i>hcf)?i:hcf;	
				}
			}
		}
		System.out.println((hcf==1)?a+" and "+b+" are coprimes":"a and b are not co-primes");
	}
}
