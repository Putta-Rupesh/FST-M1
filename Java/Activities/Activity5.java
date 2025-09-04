package activities;

abstract class Book
{
	String title;
	
//	public void setTitle(String str)
//	{
//		title =str;
//	}
	public String getTitle()
	{
		return title;
	}
}

class MyBook extends Book
{
	public void setTitle(String str)
	{
		title =str;
	}
}
public class Activity5 {
	public static void main(String [] arr)
	{
		MyBook obj = new MyBook();
		obj.setTitle("Hover Car Racer");
		
		System.out.println("The Title is : "+ obj.title);
	}

}
