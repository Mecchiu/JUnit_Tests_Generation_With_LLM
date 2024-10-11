// FileFollower_0Test.java
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
* It contains one unit test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
*/
class FileFollower_0Test {
		/**
	 * Initialize class variables for the methods in a static initializer
		 */
    private static FileFollower instance;

		/**
	 * Test method for {@link FileFollower#addOutputDestination(OutputDestination)}.
	 */
    @Test
    public void testaddOutputDestination() {
        assertNotNull(instance);
        instance.addOutputDestination(new OutputDestination.LineLength());
        assertTrue(instance.addOutputDestination(new OutputDestination.LineLength()));
        assertEquals(instance.addOutputDestination(new OutputDestination.LineLength()), instance);
        assertEquals(instance.addOutputDestination(null), instance);
    }

        /**
	 * Test method for {@link FileFollower#follow(File, File)}.
	 *
	 * @throws IOException
	 */
    @Test
    public void testfollowFile() throws IOException {
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        List<String> expectedResults = new ArrayList<String>();
        
        expectedResults.add(file1.getName());
        expectedResults.add(file2.getName());
        expectedResults.add(file3.getName());

        assertNotEquals(file1, file2);
        assertNotEquals(file2, file3);
        assertEquals(file1, instance.follow(file2, file3));
        assertEquals(file1, instance.follow(file1, file2));
        assertEquals(file1, instance.follow(file1, file3));

        file1.delete();
        file2.delete();
        file3.delete();

        assertTrue(instance.addOutputDestination(new OutputDestination.LineLength()));
        assertEquals(expectedResults, instance.follow(file2, file3));

        file1.delete();
        file2.delete();
        file3.delete();
    }

        /**
	 * Test method for {@link FileFollower#flush(File)}.
	 */
    @Test
    public void testflushFile() {
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");

        List<String> expectedResults = new ArrayList<String>() { 
            { 
                add("file1");
                add("file2");
                add("file3");
            } 
        };

        assertNotEquals(file1, file2);
        assertNotEquals(file2, file3);

        assertEquals(file1, instance.flush(file2));
        assertEquals(file1, instance.flush(file1));
        assertEquals(file1, instance.flush(file2));
        assertEquals(file1, instance.flush(file3));

        file1.delete();
        file2.delete();
        file3.delete();

        assertTrue(instance.addOutputDestination(new OutputDestination.LineLength()));
        assertEquals(expectedResults, instance.flush(file1));
    }

        /**
	 * Test method for {@link FileFollower#flush(File)}.
	 * @throws RuntimeException
	 * @throws IOException
	 */
	@Test
    public void testflushFileException() throws IOException, RuntimeException
    {
        File file1 = new File("file1");
        Logger.getLogger(FileFollower.class.getName()).log(Level.WARNING, null, new Throwable("Unhandled exception"));

        assertNotEquals(file1, file2);
        assertEquals(file1, instance.flush(file2));

        file1.delete();

        assertTrue(instance.addOutputDestination(new OutputDestination.LineLength()));
        assertThrows(IOException.class, () -> {
            instance.flush(file1);
        });
    }

        /**
	 * Test method for {@link FileFollower#flush(File)}.
	 * @throws RuntimeException
	 * @throws IOException
	 */
    @Test
    public void testflushFileException_multiple_exceptions() throws Exception
    {
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");

        Logger.getLogger(FileFollower.class.getName()).log(Level.WARNING, null, new Throwable("Unhandled exception 1"));
        Logger.getLogger(FileFollower.class.getName()).log(Level.WARNING, null, new Throwable("Unhandled exception 2"));

        assertNotEquals(file1, file2);
        assertEquals(file1, instance.flush(file2));

        file1.delete();

        assertTrue(instance.addOutputDestination(new OutputDestination.LineLength()));
        assertThrows(InterruptedException.class, () -> {
            instance.flush(file3);
        });

        File file2.delete();

        assertTrue(instance.addOutputDestination(new OutputDestination.LineLength()));
        assertEquals(file1, instance.flush(file2));
    }

        /**
	 * Test method for {@link FileFollower#flush(File)}.
	 * @throws IOException
	 */
    @Test
    public void testflushFileIOException() throws IOException
    {
        File file1 = new File("file1");
        Logger.getLogger(FileFollower.class.getName()).log(Level.WARNING, null, new Throwable("Unhandled exception"));

        assertNotEquals(file1, file2);
        assertEquals(file1, instance.flush(file2));

        file1.delete();

        assertTrue(instance.addOutputDestination(new OutputDestination.LineLength()));
        assertThrows(IOException.class, () -> {
            instance.flush(file1);
        });
    }

    /**
	 * Initialize class variables for all relevant static initializers.
	 */
    static {
        instance = new FileFollower();
        instance.addOutputDestination(new OutputDestination.LineLength());
        instance.follow(new File("/usr/local/bin/xterm"), new File("/usr/bin/xterm"));
    }
}