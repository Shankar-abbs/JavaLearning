package com.basicprograms.loops;

public class Twin_primes 
{
		public static void main(String[] args)
		{
			int a=29,b=31,count1=0,count2=0;
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					count1++;
				}
			}

			for(int i=1;i<=b;i++)
			{
				if(b%i==0)
				{
					count2++;
				}
			}
			if(count1==2 && count2==2 && (a-b==2||a-b==-2))
			{
				System.out.println(a+" and "+b+" are Twin primes");
			}
			else {
				System.out.println("a and b are not Twin primes");
			}
		}
}
