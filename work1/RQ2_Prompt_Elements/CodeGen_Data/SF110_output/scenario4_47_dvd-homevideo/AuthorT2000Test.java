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
		 * This is the actual unit test method.
		*/
	@Test
	void CreateDVDFileStructure() {
		String Path = System.getenv("INI_PATH");

		/* Test case 1 - no error */
		System.out.println("Attempt to initialize the author instance with a valid DVD File Structure");
		File File = new File(Path + File.separator + "dvdauthor.txt");
		boolean bResult = CreateDVDFileStructure( new GUI(new FileInputStream(File)));
		assertTrue("Invalid return from the function. Returned false",bResult);
		System.out.print(bResult);


		/* Test case 2 - Error - bad DVD structure */
		File File = new File(Path + File.separator+ "dvdstruct.txt");
		boolean bResult = CreateDVDFileStructure( new GUI(new FileInputStream(File)));
		assertTrue("Invalid return from the function. Returned false",bResult);
		System.out.print(bResult);

		/* Test case 3 - File Not Exist exception  */
		try {
			File MyFile = new File(Path + File.separator + "dvdstruct.txt");
			/* Error in the call to CreateDVDFileStructure() */
			FileReader FileReader = new FileReader(File);

			/* Invalid Argument - FileReader - Invalid File Structure */
			FileWriter FileWriter = new FileWriter(FileReader);
			try {
	            FileWriter.write("Bad File Structure");
				bResult = CreateDVDFileStructure( new GUI(new FileInputStream(MyFile)));
				assertTrue("The incorrect return from the function. Returned false",bResult);
	            FileWriter.close();
			} catch (IOException e) {
				try {
					FileWriter.close();
					/* Invalid Argument. FileWriter could also throw NoSuchElementException */
					FileReader.read();
				} catch (NoSuchElementException e3) {
					// expected
			        try {FileWriter.close();} catch( Exception ignored) { }
			        

				} catch (IOException e2) {
					System.out.println("Error in the call to CreateDVDFileStructure()");

					System.out.println(e2.getMessage());

					if(e.getMessage()!= null)
						System.out.println(e.getMessage());

					System.out.println("This error was a bug in the program.  Please report to the author");
					System.out.println(e2.getMessage());
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("The DVD File Structure file could not be found on your system");
			assertTrue("Could not create a proper DVD File Structure for an empty file",false);
		} catch (IOException e) {
			System.out.println("IO error reading DVD File Structure");
			assertTrue("Could not create a proper DVD File Structure for a file that contains an ini or XML file",false);
		}
	}

}
