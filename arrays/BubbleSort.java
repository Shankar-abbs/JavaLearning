/*
 * 1.Quick Sort:
 * Average case O(nlogn) worst case O(n^2)
 * Often the fastest in practice for large datasets.
 * Space complexity O(logn) due to the recursive stack.
 * 
 * 2.Merge Sort
 * Time complexity O(nlogn)in all cases.
 * Stable sort, meaning it maintains the relative order of equal elements.
 * Space complexity O(n)due to auxiliary arrays.
 * 
 * 3.Heap Sort:
 * Time complexity O(nlogn)
 * Space complexity O(1),making it an in-place sort.
 * Not stable.
 * 
 * 4.Timsort:
 * Hybrid sorting algorithm derived from Merge Sort and Insertion Sort.
 * Used in Python's sort() and Java's Arrays.sort().
 * Time complexity O(nlogn)
 * Space complexityO(n)
 */
package com.basicprograms.arrays;
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] a = new int[] {2,4,11,5,68,2,79,0,2};
		for(int t:a)
		{
			System.out.print(t+" ");
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("\nAfter doing bubble sort");
		for(int t:a)
		{
			System.out.print(t+" ");
		}
	}
}

