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
		
    @Test
    void fileLastModified() {
        long original = System.currentTimeMillis();
        LocalFileStorage.localFile(LocalTest.TEST_FILE);
        assertNotNull("The test file isn't null!", LocalFileStorage.localFile(LocalTest.TEST_FILE));
        long time = LocalFileStorage.fileLastModified(LocalTest.TEST_FILE);
        assertTrue("The test file wasn't modified in time!", time >original);   	
    }
}