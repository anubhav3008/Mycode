import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dedupe {
	
	  static String dedup(String inputStr, int chunkSize) {
	   Map<String, List<Integer>> mp = new HashMap<String, List<Integer>>();
	   
	   int i=0;
	   while(i<inputStr.length()) {
		   String val=inputStr.substring(i, i+chunkSize);
		   if(mp.containsKey(val)) {
			   List<Integer> vals= mp.get(val);
			   vals.add(i);
			   mp.put(val, vals);
		   }
		   else {
			   List<Integer> vals= new ArrayList<>();
			   vals.add(i);
			   mp.put(val, vals);
		   }
		   i=i+chunkSize;
		   
	   }
	   StringBuilder sb= new StringBuilder();
	   
	   for (Map.Entry<String,List<Integer>> entry : mp.entrySet())
	   {
		   sb.append(entry.getKey());
		   List<Integer> vals= entry.getValue();
		   for(int k=0;k<vals.size();k++) {
			   if(k==vals.size()-1)
				   sb.append(vals.get(k)+"#");
			   else
				   sb.append(vals.get(k)+",");
			   
		   }
	   }
	  
	   return sb.substring(0, sb.length()-1);
		  
		  
	  }

	    static String redup(String deduplicatedStr, int chunkSize) {
	       int count=1;
	    	for(int i=0;i<deduplicatedStr.length();i++) {
	    	   char c= deduplicatedStr.charAt(i);
	    	  if(c==',' ||  c=='#') {
	    		  count++;
	    	  }
	       }
	    	
	    	int arraySize= chunkSize*count;
	    	char[] ans= new char[arraySize];
	    	String [] strings= deduplicatedStr.split("#");
	    	
	    	for(String s: strings) {
	    		
	    		String valueToInsert=s.substring(0,chunkSize);
	    		String[] postionToInsert=s.substring(chunkSize).split(",");
	    		for(int i=0;i<postionToInsert.length;i++) {
	    			int start=Integer.valueOf(postionToInsert[i]);
	    			for(int j=0;j<valueToInsert.length();j++) {
	    				ans[start]=valueToInsert.charAt(j);
	    				start++;
	    			}
	    		}
	    		
	    	
	    		
	    		
	    		
	    	}
	    	return new String(ans);
	    }

	
	
	
	 static String test(String inputStr, int chunkSize) {
	        String deduplicatedStr = dedup(inputStr, chunkSize);
	        if (deduplicatedStr.length() >= inputStr.length()) return "Deduplicated string length is greater than the input string length";
	        String originalStr = redup(deduplicatedStr, chunkSize);
	        return originalStr;
	    }
	    
	 
	 public static void main(String args[]) {
		 
		 String inputStr="aabbaaac";
		 int chunkSize=2;
		 
		 
		 String dedupe= dedup(inputStr, chunkSize);
		 String reddupe =  redup(dedupe, chunkSize);
		 
		 System.out.println();
		 System.out.println(dedupe);
		 System.out.println(reddupe);
		 
	 }

}
