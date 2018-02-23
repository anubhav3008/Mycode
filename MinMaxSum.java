import java.util.Scanner;

public class MinMaxSum {
	
	  static void miniMaxSum(int[] arr) {
	        int min = 0;
	        int max =  0;
	        
	        for(int i=0;i<arr.length ;i++) {
	        	if(arr[i]<arr[min]) {
	        		min=i;
	        	}
	        	if(arr[i]>arr[max]) {
	        		max=i;
	        	}
	        }
	        long maxSum=0, minSum=0;
	        
	        for(int i=0;i<arr.length;i++) {
	        	if(i!=min) {
	        		maxSum+=arr[i];
	        	}
	        	if(i!=max) {
	        		minSum+=arr[i];
	        	}
	        }
	        System.out.println(minSum+" "+maxSum);
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int[] arr = new int[5];
	        for(int arr_i = 0; arr_i < 5; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        miniMaxSum(arr);
	        in.close();
	    }

}
