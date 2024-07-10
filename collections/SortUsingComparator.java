package com.basicprograms.collections;
import java.util.*;
public class SortUsingComparator 
{
	public static void main(String[] args) 
	{
		ArrayList<Student1> al = new ArrayList<Student1>();
		
		Student1 s1 = new Student1(101,"aaa");
		Student1 s2 = new Student1(11,"bbb");
		Student1 s3 = new Student1(16,"ccc");
		Student1 s4 = new Student1(18,"ddd");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al,new SortByName());
		System.out.println(al);
	}
}
class Student1
{
	int roll;
	String name;
	public Student1(int roll, String name)
	{
		this.roll=roll;
		this.name=name;
	}	
}
class SortByName implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return (o1.name).compareTo(o2.name);
	}
}