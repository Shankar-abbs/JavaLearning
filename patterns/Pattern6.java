package com.basicprograms.patterns;

public class Pattern6 
{

	public static void main(String[] args) 
	{
		int rows=10;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c>=1;c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
