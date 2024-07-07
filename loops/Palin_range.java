package com.basicprograms.loops;

public class Palin_range 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			int num=0,temp=i;
			for(;temp>0;temp/=10)
			{
				int rem = temp%10;
				num = num*10+rem;
			}
			if(num==i)
				System.out.println(i+" is a palindrome");
		}
	}
}
