package excep;

public class Ex3 {

public static void main(String[] args) throws Ex1 {
		
		try
		{
			throw new Ex1("invalid message");//creating or defining customised exception
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
		finally
		{
			System.out.println("message is printed");
		}

	}

}
