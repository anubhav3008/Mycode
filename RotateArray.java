package com;

public class RotateArray {

	public static void main(String[] args) 
	{
		int a[]={1, 2, 3, 4, 5, 6, 7};
		int d=2;


		for(int j=0;j<gcd(a.length,d);j++)
		{
			int i=j;
			int tmp=a[i];
			while(true)
			{
				a[i]=a[(i+d)%a.length];
				i=(i+d)%a.length;
				if((i+d)%a.length==j)
				{
					a[i]=tmp; 
					break;
				}
			}
		}
		for(int j:a) System.out.print(j+"\t");
	}
	static int gcd(int a, int b)
	{

		if(b==0)
			return a;
		else
			return gcd(b, a%b);
	}

}
