package com.basicprograms.Strings;
public class UniquDoopCharsInString 
{
	public static void main(String[] args) 
	{
		String s = "hello all good morning";
		
		StringSort ss = new StringSort();
		System.out.println(ss.uniqueChar(s));
		System.out.println(ss.dooplicateChar(s));
		
	}
}


class StringSort
{
	String uniqueChar(String s)
	{
		String unique="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
			{
				unique += s.charAt(i);
			}
		}
		return unique;
	}
	String dooplicateChar(String s)
	{
		String dooplicate="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.indexOf(s.charAt(i))!=s.lastIndexOf(s.charAt(i)) && dooplicate.indexOf(s.charAt(i))==-1)
			{
				dooplicate += s.charAt(i);
			}
		}
		return dooplicate;
	}
}
