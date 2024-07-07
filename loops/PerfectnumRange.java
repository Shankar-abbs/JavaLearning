package com.basicprograms.loops;

public class PerfectnumRange
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
		int sum=0;
		for(int j=1;j<i;j++)
		{
			if(i%j==0)
			{
				sum+=j;
				System.out.println(i+" factors "+j);
			}
		}
		if(sum==i)
		{
			System.out.println(i+" is perfect number");
		}
		}
	}

}
