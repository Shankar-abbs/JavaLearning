package com.basicprograms.Strings;
public class Sample2 
{
	public static void main(String[] args) 
	{
		String s = "a4b6c2";
		
		for(int x=0;x<s.length();x++)
		{
			
			if(Character.isDigit(s.charAt(x)) && s.indexOf(s.charAt(x))>0)
			{
				int n = Character.getNumericValue(s.charAt(x));
				for(int i=1;i<=n;i++)
				{
					System.out.print(s.charAt(x-1));
				}
				System.out.println();
			}
		}
	}
}
