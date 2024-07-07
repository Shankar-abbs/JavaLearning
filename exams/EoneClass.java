package com.basicprograms.exams;

public class EoneClass
{
	public static void main(String[] args) 
	{
		Exam e = new Exam();
		for(int i=7;i<=70;i++)
		{
			System.out.println(i+" is "+e.Evil(i)+" number");
			System.out.println(i+" is "+e.Power(i)+" number");
			System.out.println(i+" is "+e.Automatic(i)+" number");
			System.out.println(i+" is "+e.Technology(i)+" number");
			System.out.println(i+" is "+e.Busy(i)+" number");
		}
	}
}
class Exam
{
	String Evil(int n)
	{
		int temp=n*n,sum=0;
		for(;temp>0;temp/=10)
		{
			int rem = temp%10;
			sum+=rem;
		}
		return (sum==n)?"Evil":"Not Evil";
	}
	
	int Power(int n)
	{
		int sum=0,pro=1,temp=n;

		for(;temp>0;temp/=10)
		{
			int rem=temp%10;
			sum = sum+rem;
			pro = pro*rem;
		}
		return ((sum==pro)?n:0);
	}
	
	String Automatic(int n)
	{
		int temp=n,count=0;
		int s = n*n;

		for(;temp>0;temp/=10)
		{
			count++;
		}
		int last = s % (int)Math.pow(10,count);

		return ((last==n)?"automatic number":"not an automatic");
	}
	
	String Technology(int n)
	{
		int temp=n,count=0,first=0,second=0,fin=0;
		
		for(;temp>0;temp/=10)
		{
			count++;
		}
		
		first = n/(int)Math.pow(10,count/2);
		second = n%(int)Math.pow(10,count/2);

		fin = (first+second)*(first+second);

		return ((fin==n)?"Technology":"not a technology");
	}
	
	String Busy(int n)
	{
		int last=0;
		last = n%10;
		
		if(last==7 || last%7==0)
		{
			return "a busy";
		}
		else
		{
			return "not a busy";
		}
	}
}
