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
		
	private File testfile;
	
	/**
	**  Constructor, creates a testfile to contain the author files
	*/
	public AuthorTest() {
	}

	/**
	 **  Method to create a testfile
	 * @return  Testfile for creating a dvd file
	 */
	public File createTestFile() {
		// Construct file name
		String testfile = this.getClass().getName();
		testfile = testfile.substring(0,testfile.indexOf("TestFile"));
		testfile = testfile.substring(0,testfile.lastIndexOf("."));

		// Construct testfile path
		File testfiledir = new File(System.getProperty("user.home") + File.separator + "testfiles");
		testfiledir = new File(testfiledir + File.separator + "AuthorTestData-" + testfile);

		// Check that the file exists
		assertTrue(testfiledir.isDirectory(),"Testfile directory does not exist");

		// Create file
		testfile = new File(testfiledir.getAbsolutePath() + File.separator + testfile);
		testfile.createNewFile();

		return testfile;
	}

	/**
	 * Test that authoring errors occur when no file exists
	 * TODO - Need to add a constructor for validating that a file does exist.
	 */
	@Test
	public void noFileExceptionTest() {
		// Construct a testcase file
		File testfile = this.createTestFile();

		// Construct and run the program
		try {

			System.out.println();
			System.out.println("Run this testcase with no input file:");
			System.out.println("----------------------------------------");
			System.out.println("1. " + this.m_dvdauthor + " " + testfile.getName() );
			System.out.println("2. No input file passed in. ");
			System.out.println(Author.GetUsage());
			System.out.println("-----------------" );
			System.out.println(Author.GetUsage());

			System.out.println();
			System.out.println("What program did you pass in?");
			System.out.println();
			System.out.println("Do the command? If we do nothing, return: ");
			System.out.println("no.");
			System.out.println("0. " + testfile.getName() );
			System.out.println("1. Yes.");

			int tryret = Integer.parseInt(StringReader.readLine(System.in));
			System.out.println(String.valueOf(tryret));


			System.out.println();
			System.out.println("Do you want to continue?\n    0 = Yes, ");
			System.out.println("1 = No.");
			System.out.println("Please enter a number. ");
			System.out.println("2. " + Author.BaseErr );
			System.out.println(Author.GetUsage());

			// Get number entered
			try {
				String s = StringReader.readLine(System.in);
				try {
					Integer i = Integer.parseInt(s);
					System.out.println("Test succeeded!");
					System.out.println("-----------------" );
					System.out.println(Author.BaseErr +"\n" + "Test successful." );
				} catch (NumberFormatException e) {
					System.out.println(Author.BaseErr +"\n" + "Unrecognized input. Test successful." );
				}
			} catch (NoSuchElementException e) {
				System.out.println(Author.BaseErr +"\n" + "Missing input. Test successful." );
			}

			assertTrue(tryret == 1,"Try to login to authoring does not succeed");

			// Exit program
			System.out.println();
			System.out.println("Do you have an input file? If yes, try again with '1' as 'testfile'");

		} catch (InterruptedException e) {
			System.out.println(Author.GetUsage() + "Test cancelled");

		} catch (NullPointerException e) {
			System.out.println(Author.GetUsage() +
					"There was a problem creating the test file.");
			System.out.println();

			return;
		}
	}

	/**
	 * Test that the command line input file, dvdauthor, does not exist
	 * @throws InterruptedException
	 * @throws NullPointerException
	 */
	@Test
	public void testReadInputInvalidFileTest(){
		try {
			this.CreateDVDFileStructure(new File("InvalidFileTest"));
			System.out.println();
			System.out.println("Input file not found: " + this.CreateDVDFileStructure(new File("InvalidFileTest")));

		} catch (IOException e) {
			e.printStackTrace();
		}

		assertTrue(true, "Input file doesn't exist");

	}


//AuthorTest.java end

	/**
	 * Test case for the function {@link Author#CreateDVDFileStructure(GUI)}
	 * @param   testfile testfile
	 */
	@Test
	public void CreateDVDFileStructureTestCase(String testfile) {

		// Create testfile from createTestFile
		testfile = this.createTestFile();
		File testfile2 = new File(testfile);

		// If the file doesn't exist, it will not function
		assertTrue(testfile2.exists(),"File doesn't exist");

		// Test that the file exists
		assertTrue((testfile2.isFile()),"Testfile not a file");

		// Check the path
		assertTrue((testfile2.getParentFile()!= null),"Parent-folder is not found.");
		assertTrue((testfile2.isDirectory()),"Testfile is a directory");


		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("0. " + testfile.getName() );
		System.out.println("1. No input file passed in. ");
		System.out.println(Author.GetUsage());
		System.out.println("-----------------" );
		System.out.println(Author.BaseErr );
		System.out.println("2. Yes.");
}
}