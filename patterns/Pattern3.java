package com.basicprograms.patterns;

public class Pattern3 
{

	public static void main(String[] args) 
	{
		int rows=10,cols=10;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				if(r==1||r==rows||c==1||c==cols)
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
