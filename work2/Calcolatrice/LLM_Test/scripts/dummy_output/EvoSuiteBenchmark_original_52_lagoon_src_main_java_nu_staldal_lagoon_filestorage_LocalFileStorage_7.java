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
     * Test the behaviour when a file doesn't exist.
     */
    @Test
    void checkNull() {
        LocalFileStorage result = new LocalFileStorage();
        assertEquals(0L, result.fileLastModified(null));
    }
    
    /**
     * Test the behaviour when an empty path.
     */
    @Test
    void checkEmpty() {
        LocalFileStorage result = new LocalFileStorage();
        assertNotNull(result.fileLastModified(""));
    }

    /**
     * Test the behaviour when path contains null path.
     */
    @Test
    void checkNullPath() {
        LocalFileStorage result = new LocalFileStorage();
        assertNull(result.fileLastModified("path is still null"));
    }

    /**
     * Test the behaviour when file exists.
     */
    @Test
    void checkFileExists() {
        LocalFileStorage result = new LocalFileStorage();
        assertEquals(Long.MAX_VALUE, result.fileLastModified(getTestDataFile()));
    }
    
    /**
     * Test the behaviour when file can not be created
     */
    @Test
    void checkFileCouldOnlyBeCreatedThenRemoved() {
        LocalFileStorage result = new LocalFileStorage();
        File file = new File(getTestDataFile());
        file.setLastModified(new Date(file.lastModified() - 100));
        assertEquals(Long.MAX_VALUE, result.fileLastModified(file));
    }

    /**
     * Test the behaviour when the file was last modified by the system.
     */
    @Test
    void checkFileWasLastModifiedBySystem() {
        LocalFileStorage result = new LocalFileStorage();
        File file = new File(getTestDataFile());
        int timeOut = 5000;
        while (!file.exists() && ((System.currentTimeMillis() - file.lastModified()) < timeOut) ) {
            System.gc();
            file.setLastModified(new Date(file.lastModified() - 1000));
        }
        assertTrue(file.lastModified() > Long.MAX_VALUE);
    }
	
    /**
     * Test the behaviour when the file can only be read.
     */
    @Test
    void checkFileCanRead() {
        LocalFileStorage result = new LocalFileStorage();
        File file = new File(getTestDataFile());
        assertEquals(Long.MAX_VALUE, result.fileLastModified(file));
    }
	
    /**
     * Test the behaviour when the file can only be written.
     */
    @Test
    void checkFileCanWrite() {
        LocalFileStorage result = new LocalFileStorage();
        File file = new File(getTestDataFile());
        assertEquals(Long.MAX_VALUE, result.fileLastModified(file));
    }
    
    /**
     * Test the behaviour when the directory can only be created.
     */
    @Test
    void checkCreateDirectory() {
        LocalFileStorage result = new LocalFileStorage();
        assertFalse(result.createDirectory(getTestDataFile()));
    }
    
    /**
     * Test the behaviour when directory will be created based on last modified.
     */
    @Test
    void checkCreateDirectoryWhenLastModified() {
        LocalFileStorage result = new LocalFileStorage();
        assertTrue(result.createDirectory(getTestDataFile()));
    }
    
    /**
     * Test the behaviour when directory should exist.
     */
    @Test
    void checkCreateDirectoryDoesNotExist() {
        LocalFileStorage result = new LocalFileStorage();
        assertTrue(result.createDirectory(getTestDataFile()));
    }
    
    private File getTestDataFile() {
        // return new File(System.getProperty("user.dir") + "/test/testfile.txt");
        return new File(System.getProperty("java.io.tmpdir") + "/" + getTestDataFile());
    }

	
    public static String getTestDataFile() {
        return System.getProperty("java.io.tmpdir") + "/test/testfile.txt";
    }
}