package com.basicprograms.questioneire;

public class OopsLast {

	public static void main(String[] args) {
		
		A a1 = new A(1000);
		B b1 = new B(5000);
		C c1 = new C(2000);
		System.out.println("Balanace in Bank A "+a1.getBalance());
		System.out.println("Balanace in Bank B "+b1.getBalance());
		System.out.println("Balanace in Bank A "+c1.getBalance());

	}

}
abstract class Bank{
	
	abstract int getBalance();
	
}
class A extends Bank{
	private int balance;
	public A(int balance) {
		this.balance = balance;
		}
	
	@Override
	int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}	
}
class B extends Bank{
	private int balance;
	public B(int balance) {
		this.balance = balance;
		}
	
	@Override
	int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}	
}
class C extends Bank{
	private int balance;
	public C(int balance) {
		this.balance = balance;
		}
	
	@Override
	int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}	
}