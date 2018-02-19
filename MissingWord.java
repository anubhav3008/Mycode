import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingWord {
	
	
	static String[] missingWords(String s, String t) {
		s=s.trim();
		t=t.trim();
		ArrayList<String> ans= new ArrayList<>();
		String [] sWords= s.split("\\s+");
		String [] tWords= t.split("\\s+");
		int i=0,j=0;
		while(i<tWords.length) {
			if(tWords[i].equals(sWords[j])) {
				i++;
				j++;
			}
			else {
				ans.add(sWords[j]);
				j++;
			}
		}
		while(j<sWords.length) {
			ans.add(sWords[j]);
			j++;
		}
		
		String []ansArray = new String[ans.size()];
		for(int ii=0;ii< ans.size();ii++) {
			ansArray[ii]=ans.get(ii);
		}
		return ansArray;


    }
	
	  static long kSub(int k, int[] nums) {

		  
		  long[] prefixModCount = new long[k];
			for(int i = 0; i < k; i++)
			{
				prefixModCount[i] = 0;
			}
			prefixModCount[0] = 1;

			int prefixSum = 0;
			for(int i = 0; i < nums.length; i++)
			{
				prefixSum += nums[i];
				prefixSum %= k;
				prefixModCount[prefixSum] += 1;
			}

			long result = 0;
			for(int mod = 0; mod < k; mod++)
			{
				result += prefixModCount[mod] * (prefixModCount[mod] - 1) / 2;
			}
			return result;

	    }
	
	
	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

       String[] res;
        String s;
        try {
            s = in.nextLine();
        } catch (Exception e) {
            s = null;
        }

        String t;
        try {
            t = in.nextLine();
        } catch (Exception e) {
            t = null;
        }

        res = missingWords(s, t);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }

}
