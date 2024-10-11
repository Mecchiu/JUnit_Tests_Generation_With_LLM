// SSHFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.MalformedURLException;
import nu.staldal.lagoon.core.FileStorage;
import nu.staldal.lagoon.core.OutputHandler;
import nu.staldal.lagoon.core.RemoteFileStorage;
import nu.staldal.lagoon.core.LagoonContext;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SSHFileStorage}.
* It contains one unit test case for the {@link SSHFileStorage#createFile(String)} method.
*/
class SSHFileStorageTest {
		
    /**
     * Test method for {@link SSHFileStorage#createFile(String[])}.
     */
    @Test
    public void testCreateFile() throws IOException, MalformedURLException {
        SSHFileStorage fs = new SSHFileStorage();
		assertEquals("Wrong type", FileStorage.Type.SSH, fs.getType());
        String[] files;
        files = new String[]{"testfile", "luna.txt"};
        String[] paths;
        paths = new String[]{"a", "b", "c"};
        fs.createFile(files);
        fs.commitFile(files);
        files = new String[]{"b", "d"};
        fs.createFile(files);
        fs.commitFile(files);
        files = new String[]{"c"};
        fs.createFile(files);
        fs.discardFile();
        assertEquals("Wrong file count", 2, fs.getFiles().length);
        files = new String[]{
                    "testfile",
            "luna.txt",
            "b",
          "d",
        };
        assertEquals("Wrong filenames", files, fs.getFiles());
        File file = fs.getFile("luna.txt");
        assertNotNull("File is null", file);
        assertEquals("Wrong path of the file", Paths.SYSTEM.lookup("a"), file.getAbsolutePath());
    }
}
