package com;

public class RotateArray {

	public static void main(String[] args) 
	{
		int a[]={1, 2, 3, 4, 5, 6, 7};
		int d=2;
		int count=0;
		int tmp=a[0];
		int i=0;
		while(count<a.length-1)
		{
			a[i]=a[(i+d)%a.length];
			i=(i+d)%a.length;
			count++;
		}
		a[i]=tmp;
		
		for(int j:a) System.out.print(j+"\t");
	}

}
