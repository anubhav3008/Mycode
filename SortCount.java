
	


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortCount {
	
	static void customSort(int[] arr) {
		
		Map<Integer, Integer> count= new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(count.containsKey(arr[i])) {
				count.put(arr[i], count.get(arr[i])+1);
			}
			else
				count.put(arr[i],1);
		}
		
		Map<Integer, List<Integer>> list = new TreeMap<>();
		
		for(Map.Entry<Integer,Integer> entry : count.entrySet()) {
			  Integer key = entry.getKey();
			  Integer value = entry.getValue();

			  if(list.containsKey(value)) {
				  List<Integer> ll= list.get(value);
				  ll.add(key);
			  }else {
				  List<Integer> ll= new ArrayList<>();
				  ll.add(key);
				  list.put(value, ll);
			  }
		}
		
		for(Map.Entry<Integer,List<Integer>> entry : list.entrySet()) {
			int frequency =  entry.getKey();
			List<Integer> values= entry.getValue();
			
			Collections.sort(values);
			
			for(int i=0;i<values.size();i++) {
				for(int j=0;j<frequency;j++) {
					System.out.println(values.get(i));
				}
			}
			
		}
		

    }
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int arr_size = 0;
        arr_size = Integer.parseInt(in.nextLine().trim());

        int[] arr = new int[arr_size];
        for(int i = 0; i < arr_size; i++) {
            int arr_item;
            arr_item = Integer.parseInt(in.nextLine().trim());
            arr[i] = arr_item;
        }

        customSort(arr);
        
    }
}
