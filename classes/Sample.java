package com.basicprograms.classes;

import java.util.Scanner;

public class Sample 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		s.close();
		System.out.println("Enter a number to convert into roman: ");
		int n = s.nextInt();
		Sample1 s1 = new Sample1();
		s1.roman(n);
		
	}
}
class Sample1
{
	void roman(int n)
	{
		int temp=n,rev=0;
		for(;temp>0;temp/=10)
		{
			int rem = temp%10;
			rev = rev*10+rem;
		}
		String r = "";
		for(;rev>0;rev/=10)
		{
			int rem = rev%10;
			r = switch(rem)
			{
			case 0 -> "0 cant be converted to roman";
			case 1 -> "I";
			case 2 -> "II";
			case 3 ->"III";
			case 4 -> "IV";
			case 5 -> "V";
			case 6 -> "VI";
			case 7 -> "VII";
			case 8 -> "VIII";
			case 9 ->"IX";
			default -> throw new IllegalArgumentException("Unexpected value: " + rem);
			};
			System.out.print(r+" ");
		}
		
	}
}
