package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
	public static void main(String[] args)
	{
		List<String> strList = new ArrayList<>();
		
		strList.add("Apple");
		strList.add(0,"Mango");
		strList.add(1,"pineapple");
		strList.add("Papaya");
		strList.add("Mango");
		
		for(String name : strList)
		{
			System.out.println(name);
			
		}
		System.out.println("3rd value is: "+ strList.get(2));
		System.out.println("does Mango exists:" + strList.contains("Mango"));
		System.out.println("Size of list :"+ strList.size());
		strList.remove("Mango");
		System.out.println("After remove Mango Size of list is :"+ strList.size());
		
		strList.clear();
		System.out.println("no value "+ strList);
		
		
	}
}
