package excep;

public class Ex7a extends Exception {

	  public Ex7a(String message) {
			super(message);
			
		}
	    
	     public void expFunction1()
	    {
	        try
	       {
	    	 throw new Ex7a("exception 2 catched");//throwing exception 2 
	       }
	        catch(Ex7a e)
	       {
	    	 System.out.println(e.getLocalizedMessage());
	       }
	        finally
	        {
	        	System.out.println("Second Exception");
	        }
	
      }
}
