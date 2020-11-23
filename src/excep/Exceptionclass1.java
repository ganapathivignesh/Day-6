package excep;
import java.util.Scanner;
public class Exceptionclass1 {

	private static boolean i;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");//getting a string
		String word=sc.next();
		boolean b=isInt(word);//invoking method isInt
		System.out.println(b);

	}
	
	public static boolean isInt(String s)
	{
	  
		  boolean i;
		  if(s.contains("abcdefghijklmnopqrstuvwxyz"))//this method returns true if the string is int
		  {
			     return i=false;
		  }
		 return i=true;
	 
	 
		
	  }
		
}
