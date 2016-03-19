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
/* There exists one more method: resversal algorithm : http://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
  rotate(arr[], d, n)
  reverse(arr[], 1, d) ;
  reverse(arr[], d + 1, n);
  reverse(arr[], l, n);
  
 There is another approch: bock swap algorithm : http://www.geeksforgeeks.org/block-swap-algorithm-for-array-rotation/ :
 Initialize A = arr[0..d-1] and B = arr[d..n-1]
1) Do following until size of A is equal to size of B

  a)  If A is shorter, divide B into Bl and Br such that Br is of same 
       length as A. Swap A and Br to change ABlBr into BrBlA. Now A
       is at its final place, so recur on pieces of B.  

   b)  If A is longer, divide A into Al and Ar such that Al is of same 
       length as B Swap Al and B to change AlArB into BArAl. Now B
       is at its final place, so recur on pieces of A.

2 Finally when A and B are of equal size, block swap them.
