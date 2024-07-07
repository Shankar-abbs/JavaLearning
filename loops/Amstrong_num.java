package com.basicprograms.loops;
public class Amstrong_num 
{
public static void main(String args[])
{
	int n=1;
	while(n<=1000)
	{
	int count=0,temp=n,sum=0;
	
	for(;temp>0;temp=temp/10)
	{
		count++;
	}
	temp=n;
	for(;temp>0;temp=temp/10)
	{
		int rem=temp%10;
		sum += (int)Math.pow(rem, count);
	}
	if(sum==n)
		System.out.println(n+" is an armstrong number");
	n++;
	}
}
}
