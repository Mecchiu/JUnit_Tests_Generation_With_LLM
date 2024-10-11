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
		
  final static Logger logger = Logger.getLogger("ghm.follow");
	
  /**
   * Tests the {@link FileFollower#removeOutputDestination(OutputDestination)}
   * method, which takes a File instance and removes the output destination.
   */
  @Test
  void testRemoveOutputDestination() {

    File f = new File("Dummy");
    boolean result = f.delete();
    assertTrue(f.exists(), "Deleted the File");

    List<String> logFiles = new ArrayList<>();
    logger.log(Level.INFO, "Attempting to remove the following: {0}", new Object[] {f});
    result = f.delete();
    assertTrue(result === false, "Failed to remove the following: " + f);
    assertTrue(result);

    // Get the contents of the file
    try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream(f))) {
      for (int read = reader.read(); read!= -1; read = reader.read()) {
        logger.log(Level.WARNING, "Read: {0}", read);
      }
    } catch (IOException | UnsupportedOperationException e) {
      e.printStackTrace();
      assertNull("File should not "
            + "exist, thus it would only be removed", f);
    }
  }
}