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
		
    @Test
    void getFile() throws MalformedURLException, IOException {
        SSHFileStorage ss = RemoteFileStorage.createSSHFileStorage();
		SSHFileStorage.createFile("tmpfile");
		SSHFileStorage.createFile("tmpfile.txt");
		SSHFileStorage.createFile("tmpfile.txt.dat");

        OutputHandler.setLineSeparator(System.getProperty("line.separator"));
        OutputHandler.setEncoding(null, InputStream.class);

        OutputHandler.setLineSeparator(System.getProperty("line.separator"));
        OutputHandler.setEncoding(null, OutputStream.class);

        OutputHandler.setLineSeparator(System.getProperty("line.separator"));
        OutputHandler.setEncoding(null, File.class);

        OutputHandler.setLineSeparator(System.getProperty("line.separator"));
        OutputHandler.setEncoding(null, String.class);

        SSHFileStorage.createFile(null);

        assertEquals(null, ss.getFile(null));
    }
}