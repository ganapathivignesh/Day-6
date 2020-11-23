package excep;

public class Ex4 {

public static void main(String[] args) {
		
		int a[]=null;
		
		try
		{
			System.out.println(a.length);//null pointer exception
		}
		catch(Exception e)
		{
		     System.out.println(e.getStackTrace());
		     e.printStackTrace();
		}
		finally
		{
			System.out.println("accessing null");
		}
		
		

	}
}
