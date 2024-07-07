package com.basicprograms.patterns;

public class Pattern2 
{
	public static void main(String[] args) 
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=rows;c++)
			{
				if(r==3 && c==3)
				{
					System.out.print("# ");
				}
				else if(r==c || r+c==rows+1) {
					System.out.print("@ ");
				}
				else {
				System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
}
