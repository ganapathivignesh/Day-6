package excep;
import java.io.File;
public class Exceptionclass {
	File f=null;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=null;
	    try
	    {
	    	f=new File("file1.txt");//creating a new file
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);//catching the exception 
	    }
	    finally
	    {
	        boolean b=fileExists(f);	//returns a boolean value
	    }
	    
	    
		
	}
	
	public static boolean fileExists(File f2)
	{
		  if(f2.exists())
		  {
			  return true;
		  }
		return false;
	}
}


