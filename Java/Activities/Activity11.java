package activities;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Activity11 {
	public static void main(String[] args) {
		Map<Integer, String> colour = new HashMap<>();
		
		colour.put(100, "Red");
		colour.put(101, "Green");
		colour.put(102, "Yellow");
		colour.put(103, "White");
		colour.put(104, "Black");
		
		for(Entry<Integer, String> item : colour.entrySet())
		{
			System.out.println(item.getKey() + ": "+ item.getValue());
		}
		// to get the only keys
		for(int key: colour.keySet())
		{
			System.out.println(key); 				// this will give key 
			//System.out.println(colour.get(key));	// this will give value of that key
		}
		
		// to remove the key
		colour.remove(100);
		
		// to check the value is present or not
		
		System.out.println("value present or not: "+ colour.containsValue("Red"));
		
		// Size of map
		System.out.println("Size of map is: "+ colour.size());
		
				
	}
}
