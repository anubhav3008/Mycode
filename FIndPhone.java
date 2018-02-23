import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FIndPhone {
	
	  static String find_phone_number(String text) {
		  String pattern="\\([0-9]{3}\\)\\s?[0-9]{3}-[0-9]{4}";
		  Pattern p = Pattern.compile(pattern);
	      Matcher m = p.matcher(text);
	      boolean found= m.find();
	      if(found)
	    	  return m.group();
	      
	      String pattern2="[0-9]{3}-[0-9]{3}-[0-9]{4}";
	      p = Pattern.compile(pattern2);
	      m = p.matcher(text);
	      found= m.find();
	      if(found)
	    	  return m.group();
	    
	      return "NONE";
	    }
	  
	  public static void main(String args[]) {
		  
		  System.out.println(find_phone_number("xxx(123) 456-7890111"));
	  }


}
