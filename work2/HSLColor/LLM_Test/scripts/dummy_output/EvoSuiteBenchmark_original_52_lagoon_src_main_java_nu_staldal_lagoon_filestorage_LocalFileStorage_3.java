// LocalFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import nu.staldal.lagoon.core.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalFileStorage}.
* It contains one unit test case for the {@link LocalFileStorage#fileLastModified(String)} method.
*/
class LocalFileStorageTest {
		
	// Unit test constructor
	// Create an unit test
	final private String file = "src/testdata/local-file-store";
			
	/**
	Constructor.
	*/
	public LocalFileStorageTest(final String file) {
		
	}

	// Unit test test method.
	// Verify the method was properly called.
	/**
	* Test if the method was called with the correct file.
	*/
	@Test
	public void testFileLastModified() {
			
		// Construct the method. This method contains one parameter.
		// The parameter must be a string with the path to the file.
		assertEquals("The method should not return nothing.", Boolean.false, Boolean.valueOf(true));

		// Call method.
		// The return should be a long which contains the time when the file was last modified.
		//
		// verify the method was called with a valid file (string).
	}

}