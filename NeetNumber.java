import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NeetNumber {

	public static void main(String[] args) {
		
		int a= 342342;
		String num=""+a;
		List<Integer> number= new ArrayList<>();
		for(int i=0;i< num.length(); i ++ ) {
			number.add(Character.getNumericValue(num.charAt(i)));
		}
		
		
		int i=0;
		for(i=0;i< number.size()-1 ; i++) {
			
			if(number.get(i)> number.get(i+1)) {
				
				int y=i-1;
				int counter=0;
				while(y>=0) {
					if(number.get(y)==number.get(y+1)) {
						counter++;
					}
					else
						break;
					y--;
				}
				i=i-counter;
				break;
			}
		}
		List<Integer> original = new ArrayList<>();
		for(Integer  x:  number) {
			original.add(x);
		}
	    Collections.sort(number.subList(i, number.size()));
		int x=0;
	    for(x=i;x<number.size();i++) {
	    	if(number.get(x)<original.get(x)) {
	    		number.set(x, original.get(x)-1);
	    		x++;
	    		break;
	    	}
	    }
	    while(x<number.size()) {
	    	number.set(x, 9);
	    	x++;
	    }
	    
	    System.out.println(number);
		
	

	}

}
