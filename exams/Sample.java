package com.basicprograms.exams;
public class Sample
{
	public static void main(String[] args)
	{
		Child c1 = new Child();
		String s1 = "----";
		String s2 = "Hello";
		
		System.out.println(c1.add(s1, s2));
		
	}
}




class Parent
{
	String add(String s1, String s2)
	{
		String res = "";
		res = s1.substring(0,2)+s2+s1.substring(s1.length()-2,s1.length());
		return res;
	}
}
class Child extends Parent
{
	String add(String s1, String s2)
	{
		return super.add(s1,s2);
	}
}
