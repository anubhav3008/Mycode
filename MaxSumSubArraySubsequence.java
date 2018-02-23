import java.util.Scanner;

public class MaxSumSubArraySubsequence {
	
	 static int[] maxSubarray(int[] arr) {
		 int [] result = new int[2];
		 
		 int sum=0;
		 int sumOfPositive=0;
		 int maxSum=Integer.MIN_VALUE;
		 int maxValue= Integer.MIN_VALUE;
		 for(int i=0;i<arr.length;i++) {
			 maxValue=Math.max(maxValue, arr[i]);
			 if(arr[i]>0){
				sumOfPositive+=arr[i]; 
			 }
			 
			 sum=sum+arr[i];
			 maxSum=Math.max(sum, maxSum);
			 if(sum<0) {
				 sum=0;
			 }
			 
		 }
		 if(sumOfPositive==0) {
			 result[1]=maxValue;
		 }
		 else {
			 result[1]=sumOfPositive;
		 }
		 result[0]=maxSum;
		 
		 
	       return result;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            int[] arr = new int[n];
	            for(int arr_i = 0; arr_i < n; arr_i++){
	                arr[arr_i] = in.nextInt();
	            }
	            int[] result = maxSubarray(arr);
	            for (int i = 0; i < result.length; i++) {
	                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
	            }
	            System.out.println("");


	        }
	        in.close();
	    }

}
