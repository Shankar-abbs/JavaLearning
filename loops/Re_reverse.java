package com.basicprograms.loops;

public class Re_reverse 
{

	public static void main(String[] args) 
	{
		int n=1234,rev=0,count=0,re_rev=0;
		System.out.println(n+" value before reverse");
		for(;n>0;n/=10)
		{
			int rem=n%10;
			rev = rev*10+rem;
			if(rev==0)
			{
				count++;
			}
		}
		System.out.println(rev+" rev value");

		for(;rev>0;rev/=10)
		{
			int re_rem=rev%10;
			re_rev = re_rev*10+re_rem;
		}
		re_rev *=(int)Math.pow(10, count);
		
		System.out.println(re_rev+" re-reversed value");
	}
}


