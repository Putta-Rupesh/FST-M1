package activities;

class CustomException extends Exception
{
	private String message = null;
	
	public void CustomException(String message)
	{
		this.message = message;
	}
	public String getMessage()
	{
		return message;
	}
}
public class Activity8 {
	public static void main(String[] args)
	{
		CustomException obj = new CustomException();
		obj.CustomException(null);
	//	System.out.println(obj.getMessage());
		String str = obj.getMessage();
		if (str == null)
		{
			System.out.println("String value is Null");
		}
		else
			System.out.println(str);
	}
//	static void exceptionTest(String str) throws CustomException
//	{
//		if (str == null)
//		{
//			System.out.println("String value is Null");
//		}
//		else
//			System.out.println(str);
//	}
}
