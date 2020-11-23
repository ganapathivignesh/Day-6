package excep;

public class Ex2 extends Exception{

	String message;
	Ex2(String message)
	{
		super(message);
	}
	public static void main(String[] args) {
		
		try
		{
			throw new Exception("invalid");//throwing new exception of base class
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());//returns the localised message of throwable
			System.out.println(e.getStackTrace());
		}
		finally
		{
			System.out.println("throwing exception");
		}

	}
}
