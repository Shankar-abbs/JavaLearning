package com.basicprograms.arrays;
public class HIghString 
{
	public static void main(String[] args) 
	{
		String[] s = new String[] {"Shankar","Gowtham","Vamsi","Bhavani","deepak"};
		int high = 0,index=0;
		
		for(int i=0;i<s.length;i++)
		{		
			if(s[i].length()>high)
			{
				high = s[i].length();
				index = i;
			}
		}
		System.out.println("Hihest String in Array is "+s[index]);
	}
}
