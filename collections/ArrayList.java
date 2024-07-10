package com.basicprograms.collections;
import java.util.*;
public class Arraylist
{
	public static void main(String[] args) 
	{
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(10,"aaa");
		Student s2 = new Student(11,"bbb");
		Student s3 = new Student(12,"ccc");
		Student s4 = new Student(13,"ddd");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("in Linked List");
		System.out.println(al);
		Set<Student> set = new HashSet<Student>();
		System.out.println("in set");
		set.addAll(al);
		System.out.println(set);
		
	}
}
class Student
{
	int roll;
	String name;
	public Student(int roll, String name)
	{
		this.roll=roll;
		this.name=name;
	}
	@Override
	public String toString() {
	
		return roll+" "+name;
	}
	
}
