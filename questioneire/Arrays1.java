package com.basicprograms.questioneire;
public class Arrays1 
{
	public static void main(String[] args)
	{
		//. Write a Java program to count the unique words in a String
		
		String s = "This code is really very very nice code";
		s = s.toLowerCase();
		String arr[] = s.split(" ");
		boolean[] b = new boolean[arr.length];
		int count = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			int y=i+1;
			if(b[i])
			{
				break;
			}
			int check=0;
			for(;y<arr.length;y++)
			{
				if(arr[i].equals(arr[y]))
				{
					check++;
				}
			}
			if(check<1)
			{
				count++;
				b[y-1] = true;
			}
		}
		System.out.println("Unique words in \n--"+s+"-- are\n"+count);
	}
}
