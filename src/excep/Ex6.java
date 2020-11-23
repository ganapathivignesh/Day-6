package excep;

public class Ex6 extends Exception{


	public Ex6(String string) {
		super(string);
	}
	
public static void main(String[] args) throws Ex6 {
		
	    Ex6 e6=new Ex6(null);
		
			e6.f();
		

	}
	
	public void f()
	{     
		    g();//calling the other method
			
	}
		
	
	
	public void g()
	{
		  try
		  {
			  System.out.println("end of g()");
			  throw new Ex6("exception has been catched");//throwing exception
			  
		  }
		  catch(Ex6 e)
		  {
			  System.out.println(e.getLocalizedMessage());//caught by g() function catch block
		  }
		  finally
		  {
			  System.out.println("end of f() and g()");
		  }
	}

	
}
