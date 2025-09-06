package activities;

interface Addable {
	
	int add(int a, int b);
}
public class Activity12 {
	public static void main(String[] args) {

		// Lambda function with out data type
		Addable add1 = (a,b) -> (a+b);
		System.out.println("Add1 value is : "+ add1.add(5,8));
		
		// Lambda function with data type
		Addable add2 = (int a, int b) -> {
			return (a+b);
		};
		System.out.println("Add2 value is :" +add2.add(3, 6));
				
				
	}

}
