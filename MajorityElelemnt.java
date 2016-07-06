
//Moore voting algorthm 
//http://www.geeksforgeeks.org/majority-element/
public class MajorityElelemnt {

	public static void main(String[] args) 
	{
		int a[]={3, 3, 4, 2, 4,6, 2};
		int maximumoccurigelemnt=maxoccuring(a);
		boolean ismajority=isthismajorityElement(a, maximumoccurigelemnt); 
		if(ismajority)
			System.out.println(maximumoccurigelemnt);
		else
			System.out.println("None");
	}
	static int maxoccuring(int a[])
	{
		int i=1,majority=a[0],majoritycount=0;
		while(i<a.length)
		{
			if(a[i]==majority)
			{
				majoritycount++;
			}
			else
			{
				majoritycount--;
				if(majoritycount<0)
				{
					majority=a[i];
					majoritycount=0;
				}
			}
			i++;
			
		}
		return majority;
	}
	
	static boolean isthismajorityElement(int a[],int number)
	{
		int count=0;
		for(int x:a)
		{
			if(number==x)
				count++;
		}
		if(count>=a.length/2)
			return true;
		return false;
	}
}
