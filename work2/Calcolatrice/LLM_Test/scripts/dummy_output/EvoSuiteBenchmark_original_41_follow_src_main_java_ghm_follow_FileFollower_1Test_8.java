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
         * Run all tests.
         */
                    @Test
							@Deprecated
							public void testRemovalOfUnknownOutputDestinations() {
					
								final List<FileFollower> toBeRemoved = new ArrayList<FileFollower>();
								final OutputDestination removedOutputDestination = null;
								for (FileFollower toBeRemovedOutputDestination : toBeRemoved) {
									// Remove a particular OutputDestination from the list of those toBeRemoved outputs, which are not yet
									// registered
									toBeRemovedOutputDestination.removeOutputDestination(removedOutputDestination);
									toBeRemovedOutputDestination.close();
								}
								// Check that there were no more elements left in the list of elements to be removed
								assertTrue("There were no more OutputDestinations to be removed.",((toBeRemovedOutputDestination == null)? false : true));
							}
									
}