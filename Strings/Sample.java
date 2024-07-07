package com.basicprograms.Strings;
public class Sample 
{
	public static void main(String[] args)
	{
		String s = "Hel";	
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			
			for(int y=i+1;y<=s.length();y++)
			{
				System.out.println(s.substring(i,y));
				count++;
			}
		}
		System.out.println(count);
	}
}
