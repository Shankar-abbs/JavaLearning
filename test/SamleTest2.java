package com.basicprograms.test;



public class SamleTest2 
{
	public static void main(String args[]) {
		String s = "Hello all Good morning";

		String arr[] = s.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			char a[] = arr[i].toCharArray();
			a[0] = Character.toUpperCase(a[0]);
			a[a.length-1] = Character.toUpperCase(a[a.length-1]);
			arr[i]="";
			for(char c:a) {
				arr[i]+=c;
			}
		}
		for(String t:arr) {
			System.out.print(t+" ");
		}
	}

}



