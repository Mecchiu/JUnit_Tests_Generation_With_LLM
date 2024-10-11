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
	 * Checks for the removeOutputDestination() function
	*/
			
		@Test
		public void removeFile() {
				
				// Set up the list of output destinations to be removed
				final OutputDestination outputDestination = getOutputDestination();
				

				// Instances of this class should not be possible after a successful
				// call to this method
				try {
					FileFollower.removeOutputDestination(outputDestination);
					fail("This should not be possible after an successful call to remove an output destination during a successful call to execute a file by a stream.");
				} catch (RuntimeException expected) {

				}
		}

		@Test
		public void testConstructor1() {

				// Set the initial buffer size used by this run of the following code.
				final int bufferSize = 81920;

				// Set up the list where instances should be removed
				final OutputDestination outputDestination = getOutputDestination();
				
				// Execute the following code once
				try {
					FileFollower.removeOutputDestination(outputDestination);
				} catch (RuntimeException expected) {

				}
		}

		@Test
		public void testConstructor2() {

				// Build the list of output destinations to be removed
}
}