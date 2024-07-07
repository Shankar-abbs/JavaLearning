package com.basicprograms.classes;
import java.util.Scanner;

public class BankClass 
{
	public static void main(String[] args) 
	{
		Bank emp1 = new Bank();
		
		emp1.greet();
	    emp1.debt();
		emp1.total();
		
	}
}
class Bank
{
	Scanner s = new Scanner(System.in);
	int p=0,i=0;
	void greet()
	{
		System.out.println("Enter Your name: ");
		String hi = s.nextLine();
		System.out.println("Hello "+hi);
		System.out.println("Welcome to ISSMART Bank");
	}
	void debt()
	{
		System.out.println("Enter how much amount you have taken from bank: ");
		p = s.nextInt();
		int r=18,t=1;
		i = (p*t*r)/100;
		System.out.println("Your Intrest amount is "+i);
	}
	void total()
	{
		int total;
		total = p+i;
		System.out.println("Total Amount needs to pay is "+total);
		System.out.println("Thankyou for Maintaining Relation with our bank ");
	}
}
