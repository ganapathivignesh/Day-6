package excep;

public class Exmethods extends Exception{

	Exmethods()
	{
		super("invalid");
		
	}
    public static void main(String[] args) {
		
		Exmethods ex=new Exmethods();
		String n="tyui";
		int a[]= {4,5,6,7};
	
		 try
		 {   int c=9/0;//arithmetic exception
			 System.out.println(c);
		 }
		 catch(Exception e)
		 {
			 e.getCause();
			 e.fillInStackTrace();
			 System.out.println(e.hashCode());
		 }
		 finally
		 {
			 System.out.println("exception at divide by zero");
			 
		 }
		 
		 try
		 {
			 System.out.println(a[3]);//array out of bound exception
			 System.out.println(a[4]);
			 
		 }
		 catch(Exception e)
		 {
			System.out.println( e.getMessage());
			System.out.println( e.getStackTrace());
			
	      }
		 finally
		 {
			 System.out.println("array accessing completed");
		 }

		  try
		 {
			 int b=Integer.parseInt(n);//numberformat exception
		 }
		 catch(Exception e)
		 {
			 System.out.println(e.getClass());
			 System.out.println(e.toString());
		 }
		  finally
		  {
			  System.out.println("conversion completed");
		  }
	}
}
