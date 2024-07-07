package com.basicprograms.collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Sample1 
{
	public static void main(String[] args) 
	{
		Stack l = new Stack();
		l.add("Shankar");
		l.add("vinay");
		l.add(18);
		l.add(1.8);
//		System.out.println(l);
		l.pop();
//		System.out.println(l);
		l.pop();
//		System.out.println(l);
		l.push(18);
		l.push(1.8);
//		System.out.println(l);
		ArrayList al = new ArrayList();
		al.add(l);
//		System.out.println(al);
		HashSet hs = new HashSet();
		hs.add(l);
		List ll = new ArrayList();
		for(int i=0;i<l.size();i++)
		{
//			System.out.println(l.get(i));
		}
		for(Object temp : l)
		{
			System.out.println(temp);
		}
	}
}