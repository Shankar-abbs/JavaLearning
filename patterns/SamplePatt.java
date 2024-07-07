package com.basicprograms.patterns;

public class SamplePatt 
{

	public static void main(String[] args)
	{
		for(int r=1;r<=5;r++)
		{
			for(int c=5;c>=r;c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
