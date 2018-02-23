//https://www.geeksforgeeks.org/maximum-length-subsequence-difference-adjacent-elements-either-0-1/
public class MaxLengthSubsequence {
	
	public static void main(String args[]) {
		
		int ans= maxLengthSubsequence(new int[] {-2, -1, 5, -1, 4, 0, 3});
		System.out.println(ans);
	}
	
	
	public static int maxLengthSubsequence(int []a) {
		int n=a.length;
		if(n==0) return 0;
		if(n==1) return 1;
		int dp[]= new int[n];
		for(int i=0;i<n;i++) {
			dp[i]=1;
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(dp[i]<=dp[j] && ( Math.abs(a[i]-a[j])==1 ||  Math.abs(a[i]-a[j])==0) ) {
					dp[i]=dp[j]+1;
				}
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			max=Math.max(max, dp[i]);
		}
		
		return max;
	}

}
