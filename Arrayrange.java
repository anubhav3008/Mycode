import java.io.IOException;

public class Arrayrange {
	  static String solution(int[] a) {
		  StringBuilder sb= new StringBuilder();
		  int n=a.length;
		  int i=0, j=0;
		  while(i<n && j<n) {
			  j=i+1;
			  while(j<n && a[j]==a[j-1]+1) {
				  j++;
			  }
			  if(j-i>=3) {
				  sb.append(a[i]+"-"+a[j-1]+",");
			  }
			  else if(j-i==1) {
				  sb.append(a[i]+",");
			  }
			  else if(j-i==2) {
				  sb.append(a[i]+","+(a[i+1])+",");
			  }
			  i=j;
		  }
		  
		  return sb.substring(0, sb.length()-1).toString();

	    }
	
	
	
	public static void main(String[] args) throws IOException {

        String res = solution(new int[] {1,2,3});
        System.out.println(res);
      
    }

}
