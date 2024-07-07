package com.basicprograms.patterns;

public class Pattern4 
{

	public static void main(String[] args) 
	{
		int rows=10,cols=10;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r==1||c==1||r==rows||c==cols||r==c||r+c==rows+1)
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
