package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
	public static void main(String[] args)
	{
		Set<Object> numSet = new HashSet<>(); // HashSet wont store the order which we given thats why we will get output in different order
		
		numSet.add(100);  				// object - will store both the integer and Strings
		numSet.add(12145);
		numSet.add(12467);
		numSet.add(86432);
		numSet.add(34532);
		numSet.add("Rupesh");
		
		// to print all the values
		for(Object num : numSet)
		{
			System.out.println(num);
		}
		
		// Size of set
		System.out.println("Size of Set is: "+ numSet.size());
		
		// remove value --> here it will remove value directly because we won't have index
		numSet.remove(12145);
		
		System.out.println("Size of Set after removing value  is: "+ numSet.size());
		
		//contain - searching the values
		System.out.println("does have present: "+ numSet.contains(1001));
		
		// print values without loop
		System.out.println(numSet);
		
		// to replace the value
//		"Rupesh".replace("h", "H");
//		System.out.println(numSet);
//		//numSet.replace("Rupesh","Harish");
				
		// clear all the values in Set
		numSet.clear();
		System.out.println(numSet);
		
		
	}

}
