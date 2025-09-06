package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
	public static void main(String[] args) {
		
		//Creating an integer list
		List<Integer> intList = new ArrayList<>();
		
		System.out.println("Enter the values into the list");
		// to pass the inputs dynamically
		Scanner scan = new Scanner(System.in);
		
		// Generating random values we use this Random()
		Random rand = new Random();
		
		while(scan.hasNextInt()) {   				// It takes the inputs until character is passed in console
			intList.add(scan.nextInt());			// Here entered values are stores in List
		}
		System.out.println("List of values: "+ intList);
		
		//int getIndex = rand.nextInt(intList.size()-1); // this is give random index every time we run the program
		int getIndex = intList.size()-1;				 // this is to get the original size of array
		
		System.out.println("Index value is: "+ getIndex);
		
		System.out.println("Value at index is : "+ intList.get(getIndex));
	}
}
