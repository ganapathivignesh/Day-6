package excep;
import java.util.Scanner;
public class EXceptionex extends Exception{

	
public static void main(String[] args) {
		
        EXceptionex et=new EXceptionex();//instantiating class
        et.display();//invoking method
	}
	
	public void display()
	{
		Scanner sc=new Scanner(System.in);
	   try
	   {
		while(true)
		{   System.out.println("enter number");//getting values repeatedly in a continous loop
			int a=sc.nextInt();
		   
		}
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
		
	}
}
