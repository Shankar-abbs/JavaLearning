package com.basicprograms.patterns;

public class RTrainglePattern {

	public static void main(String[] args) 
	{
		for(int r=5;r>=1;r--)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
