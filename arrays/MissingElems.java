/*
 * Missing values in an Array Using Single Loop
 * 
 */
package com.basicprograms.arrays;

import java.util.Arrays;

public class MissingElems {

	public static void main(String[] args) {
		
		int a[] = {18,16,21,3,7,9};
		Arrays.sort(a);
		//[3,7,9,16,18,21]
		System.out.print("[");
		for(int t:a)
			System.out.print(t+" ");
		System.out.println("]");
		System.out.println("Missing values");
		System.out.print("[");
		for(int i=a[0],y=0;i<a[a.length-1];i++) {

			if(i!=a[y])
				System.out.print(i+" ");
			else
				y++;
		}
		System.out.println("]");
	}
}
