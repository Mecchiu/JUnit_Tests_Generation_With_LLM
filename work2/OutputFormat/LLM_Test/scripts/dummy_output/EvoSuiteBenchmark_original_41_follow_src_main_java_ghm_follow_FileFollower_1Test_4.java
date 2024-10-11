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
	 * Constructor
	 *
	 */
	public FileFollower_1Test() {
	}
	
    /**
     * Constructor
     * <p>
     * Sets the OutputDestination to be removed after the test's completion
     *
     * @param outputDestination OutputDestination to be removed after the test
	 */
    public FileFollower_1Test(OutputDestination outputDestination) {
          this.outputDestination = outputDestination;
    }    
	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Test
    public void testSetup() {
        logger = Logger.getLogger("FileFollower");

		// Set up FileFollower instance
		FileFollower instance = new FileFollower();
        assertNotNull("Instance of 'FileFollower' could not be created.", instance);
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Test
    public void testTearDown() throws IOException {
		// Set up FileFollower instance
        logger = Logger.getLogger("FileFollower");

        // Delete the FileFollower instance and the inputDestination
        FileFileSender.init(outputDestination);
		FileFollower.tearDown();
        
		// Set up FileFollower instance and the inputDestination
		FileInputStream fis = new FileInputStream(filename);
		BufferedInputStream bis = new BufferedInputStream(fis);
        instance = new FileFollower();
        assertNotNull("Instance of 'FileFollower' could not be created.", instance);
        instance.setup(bis, outputDestination);
		instance.tearDown();
		logger.log(Level.FINE, "Finished cleanup for 'FileFollower':{0}", file);
	}

    /**
     * Set up outputDestination.
     *
     * @param destination TextFileDestination for the written out files
     *
     */
    void setup(OutputDestination destination) {
        logger.setLevel(Level.WARNING);
        logger.addHandler(OutputDebugHandler.getInstance());
        writeOutputDebugText.set(new Exception("No logger specified! It was not expected."));
        writeDebugText.set(new Exception("No logger specified! It was not expected."));
        writeOutputDebugText.set(null);
        writeDebugText.set(null);

        try {
            writeDebugText.set(new Exception("No logger specified! It was not expected."));
            destination.setOutputDestination(writeDebugText);
        } catch (Exception e) {
            writeOutputDebugText.set(null);
            destination.setOutputDestination(writeOutputDebugText);
        }
    }

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Test
    public void testTearDown() throws IOException {
        logger = Logger.getLogger("FileFollower");
        
        FileFileSender.init(outputDestination);
		instance.tearDown();
    }

	//---------------------------------------FileFollower_Test.java ends here---------------------------------------

}