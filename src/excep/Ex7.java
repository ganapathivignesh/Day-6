package excep;

public class Ex7 extends Exception{

	  public Ex7(String msg)
	     {
	    	 super(msg);
	     }

		public void expFunction3()
	    {
	        try
	       {
	    	 throw new Ex7("exception 1 catched");//throwing exception 1 customly
	       }
	        catch(Ex7 e)
	       {
	    	 System.out.println(e.getLocalizedMessage());
	       }
	        finally
	        {
	        	System.out.println("First Exception");
	        }
	
     }
}
