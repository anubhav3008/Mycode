
public class KSubsequence {

	public static void main(String[] args) {
	
	System.out.println(kSub(3, new int[]{1,2,3,4,1}));	
		
	}
	
	
    static long kSub(int k, int[] nums) 
    {
    	int N=nums.length;
    	int count[]=new int[N];
    	count[0] = 1;
    	int pref_sum = 0;
    	for (int elem : nums) {
    	    pref_sum += elem;
    	    pref_sum %= k;
    	    count[pref_sum]++;
    	  }
    	  
    	  long res = 0;
    	  for (int mod = 0; mod < k; mod++)
    	    res += (long)count[mod] * (count[mod] - 1) / 2;
    	  return res;
    	}

    	
    
    


}

