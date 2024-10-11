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
	 * Tests the removal of an OutputDestination from the list of OutputDestinations
	 *
	 * @throws IOException
	 * @throws UnsupportedOperationException
	*/
	@Test
    void testRemoveOutputDestination() throws IOException {
        List<OutputDestination> outputDestinations = new ArrayList<OutputDestination>();
        fileFollower.outputDestinations = outputDestinations;
        
        OutputDestination outputDestination = fileFollower.removeOutputDestination("one");
        assertNotNull(outputDestination);
        assertNotNull(outputDestinations);
        assertEquals(outputDestinations.size(), 0);
        
        outputDestination = fileFollower.removeOutputDestination("two");
        assertNotNull(outputDestination);
        assertNotNull(outputDestinations);
        assertEquals(outputDestinations.size(), 0);
		
        outputDestination = fileFollower.removeOutputDestination("three");
        assertNotNull(outputDestination);
        assertNotNull(outputDestinations);
        assertEquals(outputDestinations.size(), 0);
        
        try {
            fileFollower.removeOutputDestination("test");
            fail("Should have thrown an IllegalArgumentException.");
        } catch (NullPointerException expected) {
        }
    }

    /**
	 * Tests printing a File to a 'buffered' stream
	 *
	 * <pre>
	 * print to stdout using 'buffered' flag
	 *
	 * </pre>
	 */
	@Test
    void testPrintFileToBufferedStream() throws IOException {
        System.setProperty("java.util.logging.SimpleFormatter.output", "buffered");
        
        fileFollower.outputDestinations = new ArrayList<OutputDestination>();
        boolean outputDestsionEnabled = true;
        
        FileOutputStream outputStream; 
        OutputDestination outputDestination = fileFollower.removeOutputDestination("one");
        assertNotNull(outputDestination);
        assertTrue(outputDestsionEnabled);
        
        outputStream = new BufferedOutputStream(new FileOutputStream("file.txt"));
        outputStream.write("one" + "\n".getBytes());
        outputStream.close();
        
        if (outputDestsionEnabled) {
            outputDestination = fileFollower.removeOutputDestination("two");
            assertNotNull(outputDestination);
            assertFalse(outputDestsionEnabled);
        }
        
        outputDestination = fileFollower.removeOutputDestination("three");
        assertNotNull(outputDestination);
        assertTrue(outputDestsionEnabled);
        
        outputDestination = fileFollower.removeOutputDestination("four");
        assertNotNull(outputDestination);
        assertFalse(outputDestsionEnabled);
        
        outputDestination = fileFollower.removeOutputDestination("five");
        assertNotNull(outputDestination);
        assertTrue(outputDestsionEnabled);
        outputDestination = fileFollower.removeOutputDestination("six");
        assertNotNull(outputDestination);
        assertFalse(outputDestsionEnabled);

        
        OutputDestination outputDestination2 = fileFollower.removeOutputDestination("three");
        assertEquals(outputDestination, outputDestination2);
        assertNotNull(outputDestination2);
        assertTrue(outputDestsionEnabled);
        
        outputDestination2 = fileFollower.removeOutputDestination("seven");
        assertNotSame(outputDestination, outputDestination2);
        assertFalse(outputDestsionEnabled);
        
        outputDestination = fileFollower.removeOutputDestination("eight");
        assertNotNull(outputDestination);
        assertFalse(outputDestsionEnabled);
        
        outputDestination2 = fileFollower.removeOutputDestination("ten");
        assertNotSame(outputDestination, outputDestination2);
        assertFalse(outputDestsionEnabled);
    }
}
