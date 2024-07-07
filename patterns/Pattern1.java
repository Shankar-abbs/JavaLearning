package com.basicprograms.patterns;

import java.util.Scanner;

public class Pattern1
{

	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter Number of rows: ");
			int rows = s.nextInt();
			System.out.println("Enter Number of columns: ");
			int cols = s.nextInt();
			for(int r=1;r<=rows;r++)
			{
				for(int c=1;c<=cols;c++)
				{
					System.out.print("# ");
				}
				System.out.println();
			}
		}
	}

}
