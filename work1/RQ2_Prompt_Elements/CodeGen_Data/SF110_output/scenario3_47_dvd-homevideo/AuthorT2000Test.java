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
		* Constructs a test cases of {@link Author#CreateDVDFileStructure(GUI)}
		* @throws IOException when the test fails
		*/
    public static void TestCase() throws IOException {
		try{
			GUI myGUI = new Author(new File("User"), "0.000.004.008", 2);
			System.out.println(myGUI);
			assertEquals(0,myGUI.Get_Index());

			myGUI = new Author(new File("User"), "0.000.004.008", 1000);
			System.out.println(myGUI);
			assertEquals(0,myGUI.Get_Index());
			}
			catch(IllegalArgumentException e){ System.err.println("Illegal Argument Exception: " + e.getMessage());  }
			catch (InterruptedException e) {
				System.err.println("Unexpected Interrupted Exception: " + e.getMessage());
			}
	}
}



