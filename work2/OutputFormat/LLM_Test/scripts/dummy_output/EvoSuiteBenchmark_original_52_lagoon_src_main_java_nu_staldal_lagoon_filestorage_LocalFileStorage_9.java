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
		

    /**
     * Tests if the last modification time of a file is correctly obtained.
     */
    @Test
    void fileLastModified( ) {
        LocalFileStorage fileStor = new LocalFileStorage();
        fileStor.fileLastModified("/foobar");

        long lastModified = fileStor.fileLastModified("/foobar");
		long expected = System.currentTimeMillis() - 30000;
		assertTrue("File's last modification timestamp should be " + expected, expected >= lastModified);
		// file exists, but not the last modification time.
    }


    /**
     * Tests if file exists with last modification time.
     */
    @Test
    void fileExists( ) {
        LocalFileStorage fileStor = new LocalFileStorage();
        fileStor.fileExists("/foobar");

        long lastModified = fileStor.fileLastModified("/foobar");
		assertTrue("File's last modification timestamp should be " + lastModified, lastModified >= 0);
    }

    /**
     * Tests whether file exists with last modification time.
     */
    @Test
    void fileExistsWithIncorrectLastModTime( ) {
        LocalFileStorage fileStor = new LocalFileStorage();
        fileStor.fileExists("/foobar");

        // no file has been created
        int result = fileStor.fileLastModified("/foobar");
		fail("File's last modification timestamp should be zero. It is created with this test case"
		);
        // the file doesn't exist
		result = fileStor.fileLastModified("/foobar", 5000);
    }

    @Test
    void fileExistsWhenLastModifiedIsInSkewTime( ) {
        LocalFileStorage fileStor = new LocalFileStorage();
        fileStor.fileExists("/foobar");

        // no file has been created
        long sleepTime = fileStor.fileLastModified("/foobar", 100000);
		assertTrue("File's last modification timestamp should be zero in last sleep time.", sleepTime == 0);
    }

}