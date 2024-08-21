package com.basicprograms.test;

public class SampleTest4 {
	
	public static void main(String[] args) {
		int j=0;
		int k=1;
		System.out.println(j);
		System.out.println(k);
		for(int i=1;i<15;i++) {
			int l=j+k;
			System.out.println(l);
			j=k;
			k=l;
		}
	}

}
