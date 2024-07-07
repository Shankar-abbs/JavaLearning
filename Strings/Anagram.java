package com.basicprograms.Strings;
public class Anagram 
{
	public static void main(String[] args) 
	{
		String s1 = "adecimalpoint";
		String s2 = "imadotinplace";
		
		Anagram1 ag = new Anagram1();
		System.out.println(ag.checkAg(s1, s2));
	}
}
class Anagram1
{
	String checkAg(String s1, String s2)
	{
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(s1.length()!=s2.length())
			return s1+" and "+s2+" are not Anagrams";
		else
		{
			int count=0;
			for(int x=0;x<s1.length();x++)
			{
				for(int y=0;y<s2.length();y++)
				{
					if(s1.charAt(x)==s2.charAt(y))
					{
						count++;
						break;
					}
				}
			}
			if(count==s1.length())
				return s1+" and "+s2+" are Anagrams"; 
			else
				return s1+" and "+s2+" are not Anagrams";
		}
	}
}
