// FileEditor_1Test.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains one unit test case for the {@link FileEditor#getCompEnergy(String)} method.
*/
class FileEditor_1Test {
		
    // Create a new File object for the tests folder.
    // @since 20180410
    static final File tests = new File("/Users/kmcsu/workspaces/DataAnalysis/DataFiles/Tests");
    
	// Create a scanner for the test folder.  (pull/comp_file_sums.c)
	private final Scanner test = new Scanner(tests);
	
	/**
	* Test for the getCompEnergy method. (pull_comps.c)
	*
	* @throws FileNotFoundException Not very confident this should work
	* @throws IOException Not very confident this should work
	* @throws ParseException Not really confident this should work
	*/
        @Test
    public void testGetCompEnergyCompletes() throws FileNotFoundException, IOException, ParseException{
        
		// Create a new FileEditor constructor function with the test directory (pathToTestFiles)
		FileEditor dct = new FileEditor(tests,"completes");
        
        // Loop through the contents of the file and get a double array of energy by calling the method getCompEnergy. (pull_comps.c)
		double[] energies = dct.getCompEnergy();
        assertEquals(test.nextLine().split(";").length, 12, "The file is very close");
		assertEquals(test.nextLine().split(";").length, test.nextLine().split(";").length, "The file is very close");
        assertEquals(test.nextLine().split(";").length, test.nextLine().split(";").length, "The file is very close");
		assertEquals(test.nextLine().split(";").length, test.nextLine().split(";").length, "The file is very close");
		assertEquals(test.nextLine().split(";").length, test.nextLine().split(";").length, "The file is very close");
		assertEquals(test.nextLine().split(";").length, test.nextLine().split(";").length, "The file is very close");
	}
        
        /**
	* Test for the getCompEnergy method. (pull/compn_file_sums.c)
	*
	* @throws IOException Not very confident this should work
	* @throws ParseException Not really confident this should work
	* @throws NotImplemented
	*/
        @Test(expected=IOException.class)
    public void testGetCompEnergyNullPath() throws IOException, ParseException{
			FileEditor dct = new FileEditor(null, "completes");
        
		// Make sure there was an error getting the double array by using getCompEnergy(). (pull/comp_file_sums.c)
		assertEquals(0, test.nextLine().split(";").length, "Get comp energy should return an empty array");
        }
        
        /**
	* Test for the getCompEnergy method. (pull/compn_file_sums.c)
	*
	* @throws FileNotFoundException Not very confident this should work
	* @throws ParseException Not really confident this should work
	* @since 20180825
	*/
        @Test
    public void testGetCompEnergyNonStringPath() throws FileNotFoundException, ParseException{
        scanning(tests,"completes");
        
        // Get some energy output for a given path and check
        assertEquals("1\n2\n", test.nextLine());
        }
        
        /**
	* Test for the getCompEnergy method. (pull/compn_file_sums.c)
	*
	* @throws IOException Not very confident this should work
	* @throws ParseException Not really confident this should work
	*/
        @Test
    public void testGetCompEnergyFailsIfFileDoesNotExist() throws FileNotFoundException, ParseException{
        scanning(tests,"");
        try {
	        new FileEditor(tests,"");
	        fail();
	    } catch (FileNotFoundException e) {
			assertEquals(e.getMessage(), "No such file or directory: " + tests, "Get comp energy should fail when a file does not exist.");
	    }
        }
        






        /**
	* Test for the getCompEnergy method. (pull/compn_file_sums.c)
	*
	* @throws FileNotFoundException Not very confident this should work
	* @throws ParseException Not really confident this should work
	*/
        @Test
    public void testDoubleFileReaderWithTooManyFocusLevels() throws FileNotFoundException, ParseException{
        scanning(tests+"/", "incomplete");
        try {
			new FileEditor(tests+"/", "incomplete");
	        fail();
        } catch (FileNotFoundException e) {
			assertEquals(e.getMessage(), "No such file or directory: " + tests+"/", "Get comp energy should fail when get focus level is too deep.");
        }
    }
        
        /**
	* Test for the getCompEnergy method. (pull/compn_file_sums.c)
	*
	* @throws FileNotFoundException Not very confident this should work
	* @throws ParseException Not really confident this should work
	*/
        @Test
    public void testStringPathWithTooManyFocusStack() throws FileNotFoundException, ParseException{
    scanning(tests+"/", "incomplete");
        try {
		    new File("/Users/kmcsu/workspaces/DataAnalysis/DataFiles/Tests/incomplete/incomplete");
			fail();
        } catch (FileNotFoundException e) {
			assertEquals(e.getMessage(), "No such file or directory: "+tests+"/", "Put comp energy file to complete file with more focus stack");
	}
    }

  
	
        /**
	* Test for the getCompEnergy method. (pull/compfile_sums.c)
	*
	* @throws FileNotFoundException Not very confident this should work
	* @throws ParseException Not really confident this should work
	*/
        // It seems to return a double array, and so we can just assume that there are only 1
        // or no focus levels (pull_comps.c).
        //assertEquals(5, test.nextLine().split(";").length, "There must be 1 focus level");
        

    private void scanning(String base, String focusStack) throws FileNotFoundException, ParseException{
        if(base!= null) {
	        File testfile = new File(base + focusStack + "/" + focusStack + ".dat");
			if(testfile.exists()) {
    scanning(testfile);
                test.close();
            }
        }
    }

        
}