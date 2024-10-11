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
    public void test_fileLastModified_() {
        String[] s = {
                Locale.getString("file.storage.example.directory.file.1")
                };
                        
        checkFileLastModifiedTest(Locale.getString("file.storage.example.directory.file.1"), false, 1, s, s[0]);

        List<String> x = new ArrayList<>();
        
        assertEquals((long) 1, LocalFileStorage.fileLastModified(Locale.getString("file.storage.example.directory.file.3")));
        
        checkFileLastModifiedTest(Locale.getString("file.storage.example.directory.file.4"), true, 1, s, s[0]);
    }

        
    public void checkFileLastModifiedTest(String file, boolean checkExists,
            int fileSize, Iterable<String> s, String expected) {
        
        String filename = (s!= null)? s.iterator().next() : file;

        String relativeFilename = filename;
        
        FilenameStorage fs = new BasicFilenameStorage(filename);
        
        assertEquals(expected, checkExists, fs.exists());
        
        // LocalFileStorage.getFileLength(FilenameStorage);
        
        long size = fs.length();
        
        if (checkExists) {
            File input = fs.getFile(FilenameStorage.getInputFileFormat());
            
        if (input.exists()) {
            if (input.isFile()) {
                assertEquals(size, input.length());
            }
            else {
                assertEquals(size, input.length());
            }

        }

        }
    }
}