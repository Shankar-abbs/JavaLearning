package com.basicprograms.test;

public class SampleFile
{
	public static void main(String[] args)
	{
		int a[]= {1,2,3,9,4,5,6,9,7,8,1,9};
		boolean b[] = new boolean[a.length];
		for(int i=0;i<a.length-1;i++) {
			if(b[i]) {
				break;
			}
			int fre=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					b[j]=true;
					fre++;
				}
			}
			if(fre>1) 
				System.out.println(a[i]+" occured "+fre+" times");
			else if(fre==1)
				System.out.println(a[i]);
		}
	}
}

