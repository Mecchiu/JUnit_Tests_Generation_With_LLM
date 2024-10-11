// FileFollower_1Test.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollower}.
* It contains one unit test case for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
*/
class FileFollower_1Test {
		
  /**
	 * Test removeOutputDestination() method.
	 */
	@Test
    public final void testRemoveOutputDestination()
	{

		List<OutputDestination> outputDestinationsList = new ArrayList<OutputDestination>(List.nil());
		outputDestinationsList.add(new FileOutputDestination());

		OutputDestination[] outputDestinations = outputDestinationsList.toArray(new OutputDestination[0]);

		assertNotNull("Returned null array after call to removeOutputDestination.", outputDestinations);

		List<OutputDestination> outputDestinationsList2 = new ArrayList<OutputDestination>();

		try
		{
	    	OutputDestination[] outputDestinations2 = outputDestinationsList.toArray(new OutputDestination[1]);
	    	OutputDestination outputDestination = outputDestinations2[0];

		    System.out.println("List after call to removeOutputDestination():");

	    	outputDestinationsList2.clear();

	    	System.out.println(outputDestinationsList2);

		    if (!outputDestinations2[0].equals(outputDestination))
		    {
			    throw new RuntimeException("Returned incorrect outputDestination.");
		    }


		    assertTrue("Returned incorrect outputDestinationsList.", outputDestinationsList2.size()==1);
		    OutputDestination outputDestination2=(OutputDestination)outputDestinations2[0];

		    outputDestinationsList2.addAll(outputDestinationsList.toArray(new OutputDestination[1]));

		    System.out.println(outputDestinationsList2);

		System.out.println("List after call to removeOutputDestination():");

	    	outputDestinations2 = outputDestinationsList2.toArray(new OutputDestination[1]);
	    	OutputDestination outputDestination3 = outputDestinations2[0];

		    outputDestinations2.addAll(outputDestinationsList2.toArray(new OutputDestination[1]));

		    System.out.println(outputDestinations2[0]);
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
			System.out.println("Unexpected exception = "+exception.getMessage());
			System.out.println("Exception = " + exception);
		}

    }

}

/*
 * Location of this class:<a href="goolong.jar">goolong.jar</a>
 */
class FileOutputDestination {
	/**
	 * Instantiates a new FileOutputDestination instance.
	 */
	public FileOutputDestination()
	{
		/**  This should not be set until after the constructor is called.
         * If the constructor is not called it will get generated and executed. */
	}

	/**
	 * Prints a String to System.out and closes the file if the file is
	 * empty before closing it.
	 * @throws IOException if the close operation fails.
	 */
	public static void printOut(String text)
            throws IOException
    {
    	try
    	{
	        BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File("./logs/")));
	        OutputDestination.outputFile(text, in);

    		in.close();

    		System.out.println("Log file closed: "+text);

	    	System.out.println("This should not be set until after the constructor is called");
    		System.out.println("Returned null.");
    	}
    	catch(IOException ex)
    	{
    		throw ex;
    	}
    	catch(Exception ex)
    	{
    		ex.printStackTrace();
    		System.out.println("Unexpected exception = "+ex.getMessage());
    		System.out.println("Exception = "+ex);
    	}
    }

	/**
	 * Prints a character array to System.out and closes the file if the file
	 * is empty before closing it.
	 * @param text Characters array to print.
	 * @throws IOException if the close operation fails.
	 */
	public static void printOut(char[] text) throws IOException
    {
    	outputFile(text);

    	System.out.println("This should not be set until after the constructor is called");
    	System.out.print("Chars are : ");
		for(int i=0; i<text.length; i++)
    		if(i!=(text.length-1))
	    		System.out.print(" "+(char)text[i]);
	    	System.out.println();
	}

	/**
	 * Prints a file to System.out and closes the file if the file is
	 * empty before closing it.
	 * @param file File instance.
	 * @throws IOException if the close operation fails.
	 */
	private static void outputFile(File file)
            throws IOException
    {
    	FileOutputStream out = new FileOutputStream(file);
    	byte[] buffer = new byte[30];

		int length = 0;

    	while((length=file.length())>0)
    	{
	        in = new BufferedInputStream(new FileInputStream(file));
	        out.write(in.read(buffer));
	        length--;
        }

		out.close();

		if(length>0)
	    	System.out.println("This should not be set until after the constructor is called");
		else
		{
	    	System.out.println("This should not be set until after the constructor is called");
	    	System.out.print("File closed: ");
		}
    }
}

class OutputDestination
{
    /** Instantiates a new OutputDestination instance.
     * @throws IOException if the close operation fails.
     * */
    public OutputDestination() throws IOException
    {
        try
        {
	        this.file=new File("./src/goolong/scripts/follow.javatest-0.6.jar");
	        this.length=this.file.length();
            this.pos=new Long(this.file.lastModified());
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }

    }
    
	/** Returns a list of characters in the buffer.
     * @throws IOException if the close operation fails.
     * */
    public List<String> getBuffer() throws IOException
    {
}
}