package excep;

public class Ex1 extends Exception{
	String message;
	Ex1(String message)//constructor 
	{
		super("invalid");//passing string to base Execption class
		this.message=message;
	}
	public static void main(String[] args) {
		
		try
		{
			throw new Ex1("invalid");//throwing base class Exception using throw keyword
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("message is printed");
		}
}
	
}
