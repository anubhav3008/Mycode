package com;
//Rearrange an array such that ‘arr[j]’ becomes ‘i’ if ‘arr[i]’ is ‘j’

public class Rearrange {

	static void printarray(int a[])
	{
		for( int x:a)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
	}
	static void rearragngeutil(int a[], int start)
	{
		int i=a[start]-1;
		int val=-start-1;
		while(a[i]>0)
		{
			int tmp=a[i]-1;
			a[i]=val;
			val=-(i+1);
			i=tmp;
		}
		
	}
	static void rearrange(int a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				rearragngeutil(a,i);
			}
			
		}
	}
	
	public static void main(String[] args) 
	{
		int a[]={1,3,0,2};
		for(int i=0;i<a.length;i++)
		{
			a[i]++;
		}
		rearrange(a);
		for(int i=0;i<a.length;i++)
		{
			a[i]=-a[i]-1;
		}
		printarray(a);
		

	}
}
