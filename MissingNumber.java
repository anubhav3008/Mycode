
//print missing number that lye in the range of 0 to 99
public class MissingNumber {

	public static void main(String[] args) {
		int a[]={9, 6,5, 90,99};
		boolean present[]=new boolean[100];
		for(int x:a)
		{
			if(x<100 && x>=0)
			{
				present[x]=true;			
			}
			
		}
		int start=0,end=0;
		int i=0;
		while(i<100)
		{
			if(present[i]==true){ i++; continue;}
			start=i;
			while(i<100 && present[i]==false)
			{
				i++;
			}
			end=i-1;
			if(end==start) System.out.println(end);
			else
				System.out.println(start+"-"+end);
			
		}
		

	}

}
