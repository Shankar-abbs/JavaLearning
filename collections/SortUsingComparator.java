package com.basicprograms.collections;
import java.util.*;
public class SortUsingComparator {
	public static void main(String[] args) {
		
		ArrayList<Student1> al = new ArrayList<Student1>();
		Student1 s1 = new Student1(18,"Shankar",'A');
		Student1 s2 = new Student1(17,"Ananth",'Z');
		Student1 s3 = new Student1(7,"Vamsi",'B');
		Student1 s4 = new Student1(21,"Yeswanth",'C');
		Student1 s5 = new Student1(10,"Chandu",'^');
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println("Student objects ArrayList");
		System.out.println(al);
		System.out.println("Sorted Student Objects Using Names");
		Collections.sort(al, new SortByName());
		System.out.println(al);
		System.out.println("Sorted Student Objects Using Roll");
		Collections.sort(al, new SortByRoll());
		System.out.println(al);
		Collections.sort(al, new SortBySec());
		System.out.println(al);
		

	}
}
class Student1{
	int roll;
	String name;
	char sec;
	public Student1(int roll, String name, char sec){
		this.roll=roll;
		this.name=name;
		this.sec = sec;
	}
	@Override
	public String toString() {
		return name+" "+roll;
	}
}
class SortByName implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
class SortByRoll implements Comparator<Student1>
{
	@Override
	public int compare(Student1 o1, Student1 o2) {
		return Integer.compare(o1.roll, o2.roll);
	}
}
class SortBySec implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return Character.compare(o1.sec, o2.sec);
	}
}
