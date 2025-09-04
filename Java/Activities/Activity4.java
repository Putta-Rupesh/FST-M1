package activities;
import java.util.Arrays;

public class Activity4 {
	
	static void ascendingSort(int array[]) {
		System.out.println("Before sorting the array : ");
        System.out.println(Arrays.toString(array));
        
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
    
    public static void main(String args[]) {
        int[] data = { 9, 5, 1, 4, 3 };
        ascendingSort(data);
        
        System.out.println("After Sorting the array in Ascending order: ");
   //     System.out.println(data);
        System.out.println(Arrays.toString(data));
    }
}
