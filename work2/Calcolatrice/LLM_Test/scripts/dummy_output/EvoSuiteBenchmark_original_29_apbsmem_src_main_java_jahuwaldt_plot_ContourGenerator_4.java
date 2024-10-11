// ContourGeneratorTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourGenerator}.
* It contains one unit test case for the {@link ContourGenerator#done()} method.
*/
class ContourGeneratorTest {
		
    /** Creates a new instance of ContourGeneratorTest */
    ContourGeneratorTest(String description) {
	
	// This array is the input data
	String[][] inputData = { { "#", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" },
			            { "0", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" } };

	// This array is the test for data to be shown
	String[][] testData = { { " #1", "A", "B", "C", "D", "E", "F", "G", "H" },
			            { " 0", "A", "B", "C", "D", "E", "F", "G" } };

	// this is the start of test data
	String testerName = "test1";
		
	//////////////////////////////////////////////
	//  This method will be called every time one of the tests in this class is run.
	//  The next time one of the methods are called, this one will be executed.
	//////////////////////////////////////////////
	void invoke(String[][] inputData, String[][] testData) {

	    checkArray(testerName, inputData, testerName);
	    checkArray(testerName, testData, testerName);

	    done();
	}

	/**
	* Checks that the array of string data contains the expected data
	* This will be a dummy test, the rest of it just checks that the given strings
	* are in the expected shape. Not good as these tests should also give a sensible
	* estimate.
	*
	* @param testerName The name of the unit test. Used both in the class
	*       description and in this method
	* @param inputData The array of data to be checked
	* @param testerName The name of the unit test
	*   
	*/
	void checkArray(String testerName, String[][] inputData, String testerName) {
		
	    // first make sure that no data is missing
	    assertFalse(testerName + " data missing",
		    ArrayUtils.isEmpty(inputData));
	    
	    // make sure that all input data is of the right size
	    assertEquals(testerName + " wrong number of data points",
		    inputData.length, testData.length);

	    // make sure the input data agrees with the expected output
	    for(int i = 0; i < inputData.length; ++i) {
	      assertEquals(testerName + " wrong data points",
			   inputData[i].length, testData[j].length);
	    }

	}

}


// run()
// Description: Runs test suite; tests done by invoking the invoke() call.
//          
// Arguments: The name of the unit test
//          The name of the test
//
// Returns: none
// Exceptions: none
/*private void runTest(String test, String testName) {
 * throw new NullPointerException(test + " must " + testName + " be non-null"); *
 * }*/

/**
 * This is the unit test of {@link ContourGenerator#run()}.
 */
@Test
public void testContourGeneratorRun() {
	ContourGenerator obj = new ContourGenerator();
	
	// run it!
	obj.run();

	obj.done();
	System.out.println("Done.");
}
  
}