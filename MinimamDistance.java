
import java.lang.Math;
//find the minimam distance between any two given numbers in an array
public class MinimamDistance {

	public static void main(String[] args) 
	{

		int arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
		int a=3;
		int b=6;
		int lastoccuranceofa=0;
		int lastoccuranceofb=0;
		while(arr[lastoccuranceofa]!=a)
			lastoccuranceofa++;
		while (arr[lastoccuranceofb]!=b) 
			lastoccuranceofb++;
		int minmiamdistance=Math.abs(lastoccuranceofb-lastoccuranceofa);
		int i=Math.max(lastoccuranceofa, lastoccuranceofb)+1;
		while(i<arr.length)
		{

			if(arr[i]==a)
			{
				lastoccuranceofa=i;
			}
			else if(arr[i]==b)
			{
				lastoccuranceofb=i;
			}
			if(arr[i]==b || arr[i]==a)
				minmiamdistance=Math.min(minmiamdistance, Math.abs(lastoccuranceofb-lastoccuranceofa));
			i++;
		}
		System.out.println(minmiamdistance);
	}

}
