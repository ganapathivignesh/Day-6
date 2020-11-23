package excep;
import java.util.Scanner;

public class Exceptionclass2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");//getting a string
		String word=sc.next();
		
		boolean t=isDouble(word);//invoking method isDouble
		System.out.println(t);

	}
	public static boolean isDouble(String s)
	{
	  try
	  {
		  double a=Double.parseDouble(s); //converting String object to double
		  if(Double.isFinite(a))//returns true if argument is finite double
		  {
			  return true;
		  }
		 
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  return false;
		
	  }
}
