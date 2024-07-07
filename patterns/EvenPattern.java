package com.basicprograms.patterns;

import java.util.Scanner;

public class EvenPattern 
{
	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter no of rows: ");
			int rows = s.nextInt();
			System.out.println("Enter no of rows: ");
			for(int r=1;r<=rows;r++)
			{
				for(int c=1;c<=5;c++)
				{
					if(r%2==0)
					{
						System.out.print("# ");
					}
					else {
						System.out.println();
					}
				}
			}
		}

	}

}
