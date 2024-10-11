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
		* Tests if the CreateDVDFileStructure(GUI) throws an exception in the 
		* method if an error occurs.
		*/
		@Test
		public void testCreateDVDFileStructure()
				throws NullPointerException, IllegalArgumentException, IOException, NoSuchElementException, NoSuchElementException, NumberFormatException, IllegalArgumentException, NoSuchElementException, ParserConfigurationException, ParserConfigurationException, IOException, InterruptedException {
			// TODO Auto-generated method stub
			//System.err.println("TEST AUTHOR");
			PrintStream err = System.err;
			err.println("TEST AUTHOR:");
			err.println("-------------------------------------------");
			int TestNum = 2;
			int TestCaseNum = 3;
			String TestFile = null;
			String TestFolder = "./target/test_Output";
			createTestCase(TestFile, TestNum, TestCaseNum, err);
			String result = Author.CreateDVDFileStructure(new File(TestFile));
			assertTrue(result.equals("AuthorTestingSuccessful"));
			String [] ErrorArray = result.split("/");
			err.println("Found error arrays: " + result);
			err.println("Authorly-ing the following: ");
			err.print("-------------------------------------------");
			err.print(errorArray[0]);
			err.println(errorArray[1]);
			err.println("-------------------------------------------");
		}
		/**
		*  Creates a test case in the TestFile.
		*  It is the actual method to be called when the 
		*  the user clicks OK in the author form
		*  It creates a new test file and 
		*  its name and fileName will
		*  become part of the testcase
		* @param   TestFile The file to be created in the TestFile
		* @param   TestNum The number of the TestCase
		* @param   TestCaseNum The number of the TestCase
		* @param   err
		* @throws IllegalArgumentException
		* @throws IOException
		* @throws NoSuchElementException
		* @throws ParserConfigurationException
		* @throws ParserConfigurationException
		* @throws NullPointerException
		* @throws ResourceNotFoundException
		* @throws ResourceNotFoundException
		* @throws ParserConfigurationException
		* @throws ParserConfigurationException

		* @see Author
		*/
		private void createTestCase(File TestFile, int TestNum, int TestCaseNum, PrintStream err)
				throws IOException, ParserConfigurationException, 
				ParserConfigurationException, NullPointerException, ResourceNotFoundException, 
				ResourceNotFoundException, ParserConfigurationException, NoSuchElementException,
		
				InterruptedException{
            
            
            
			
			String testName = "/dvdtest" + TestNum;
			String testFile = TestFile.getPath() + "-" + testName + ".mxf";
			String testFolder = TestFolder + "/" + testName;
			File testFileDir = new File(testFolder);
			testFileDir.mkdir();
			File testfile = new File(testFileDir + "/" + testName);
			System.err.println("TESTING TESTING");
            
			System.err.println("Test name: " + testName);
			System.err.println("File name: " + testfile.getName());
			System.err.println("Test folder: " + testFolder);

			String [] testArray = testFile.list();
			String [] tempStr = new String [testArray.length];
			
			for(int i = 0;i< testArray.length;i++){
				tempStr[i] = testArray[i];
			}
			   
			FileWriter fstream = new FileWriter(testfile);
			BufferedWriter out = new BufferedWriter(fstream);
			for(int i = 0; i< testArray.length;i++){
				out.write(testArray[i] + "\n");
			}
			out.close();			
			
			String testError = "";
			String testCase = "";
			String testCaseCount = "";
			
			BufferedReader errorStream = new BufferedReader(new InputStreamReader(new FileInputStream(TestFile)));

			String line;
			line = errorStream.readLine();
			errorStream.close();
			
}
}