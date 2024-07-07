package com.basicprograms.basics;

public class Third 
{
	public static void main(String[] args) 
	{
		int a[]= new int[] {8,7,9,14,11,12,13,8,11,11,14,17};
		int freq=0,index=0,element=11,indexat=0,lastat=0;
		for(int temp:a)
		{
			index++;
			if(temp==element)
			{
				freq++;
				lastat=index;
			}
			if(temp==element&&indexat<1)
			{
				indexat=index;	
			}			
		}
		System.out.println("element first found at index "+indexat);
		System.out.println("for "+freq+" times");
		System.out.println("element last found at index "+lastat);
	}
}
