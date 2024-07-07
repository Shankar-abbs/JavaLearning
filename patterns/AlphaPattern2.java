package com.basicprograms.patterns;

public class AlphaPattern2 {

	public static void main(String[] args) 
	{

		for(int r=65;r<=70;r++)
		{
			for(int c=r;c>=65;c--)
			{
				System.out.print((char)c+" ");
			}
			System.out.println();
		}
	}

}
