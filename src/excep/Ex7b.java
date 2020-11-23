package excep;

public class Ex7b extends Exception{
	public Ex7b(String message) {
		super(message);
		
	}
    
     public void expFunction2()
    {
        try
       {
    	 throw new Ex7b("exception 3 catched");//throwing exception 3 customly
       }
        catch(Ex7b e)
       {
    	 System.out.println(e.getLocalizedMessage());
       }
        finally
        {
        	System.out.println("Third Exception");
        }

    }

}
