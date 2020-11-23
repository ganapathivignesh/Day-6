package excep;

public class Arrayindexoutofboundex {
public static void main(String[] args) {
		
		//creating object of the class
		Arrayindexoutofboundex ex=new Arrayindexoutofboundex();
		ex.display();//invoking display method

	}

	public void display()
	{
		int a[]= {1,2,3,4,5};//declaring and initialising array
		
		try
		{
			a[6]=10;//accesing 6th index
		}
		catch(Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getStackTrace());//printing the trace of exception
			System.out.println(e.getCause());//returns cause of throwable
			System.out.println(e.getLocalizedMessage());//returns localized description of throwable
		}
		finally
		{
			System.out.println("end of program");//finally block to print the message if exception happens or not
		}
		
		
		
	}
	
	
}