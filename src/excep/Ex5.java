package excep;

public class Ex5 extends Exception{

	public Ex5(String string) {
		super(string);
	}

	public static void main(String[] args){
		
	    Ex5 e5=new Ex5(null);
		 
	    try
	    {
			e5.f();
	    }
	    catch(Ex5 e)
	    {
	    	System.out.println(e.getLocalizedMessage());
	    }
		

	}
	
	public void f()throws Ex5//throwing the exception to callstack of method calls
	{     
		    g();
			
	    
     }
		
	
	
	public void g() throws Ex5
	{
		  try
		  {
			  System.out.println("end of g()");
			 throw new Ex5("exception been catched");//exception is catched  in g()
			  
		  }
		 
		  finally
		  {
			  System.out.println("end of f() and g()");
		  }
	}
	
}
