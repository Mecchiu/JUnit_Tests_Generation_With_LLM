// AuthorTest.java


import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Author}.
* It contains one unit test case for the {@link Author#CreateDVDFileStructure(GUI)} method.
*/
class AuthorTest {
		
	/**
	 * A method to run the test
	 */
	@Test
	public void Run(){
		
		assertFalse( CreateDVDFileStructure(GUI()));
    };
}

class GUI{
	
	/* GUI Object */
	public static void main(String[] argv){
        try {
            
            //create new dvd player GUI object, this should be used for the DVD file structure
            new Author();
            
            assertTrue("Failed to create dvdauthor", true);	
            
        }
        catch(IOException err) {
            System.out.println("Error in executing " + err);
	    }
	}
}