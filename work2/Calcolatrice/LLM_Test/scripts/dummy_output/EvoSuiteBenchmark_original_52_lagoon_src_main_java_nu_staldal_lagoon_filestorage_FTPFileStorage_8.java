// FTPFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.*;
import nu.staldal.lagoon.core.*;
import nu.staldal.ftp.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFileStorage}.
* It contains one unit test case for the {@link FTPFileStorage#createFile(String)} method.
*/
class FTPFileStorageTest {
		/**
		 * Test that all necessary files are created for successful transfer.
		 *
		 * @throws IOException
		 * @throws FTPException
		 */
    @Test
    void testCreateFile() throws IOException, FTPException {
        OutputHandler output = new OutputHandler();
        FTPFileStorage ftp = new FTPFileStorage();
        ftp.setOutputHandler(output);
        int result = ftp.createFile("/home/me/hello_world");
        assertTrue("File shall be created", true);
        assertEquals("Server response shall be correct",
                 "OK", output.getText("failserver"));
        assertEquals("Server response shall be correct",
                   0, result);

        output.reset();
        File file = new File(FTPClient.DEFAULT_BASE_DIR + "/home/me/hello_world");
        assertEquals("File shall be found", file, ftp.getFile("/"));
        assertFalse("File shall be not found",
                    ftp.getFile("/home/me/hello_world") == null);

        String fileLocation = System.getProperty("user.dir");
        output.reset();
        ftp = null;
        file = new File(fileLocation + "/home/me/hello_world");
        assertEquals("File shall be found", file, ftp.getFile(fileLocation + "/hello_world"));
        assertEquals("File shall be not found",
                    file, ftp.getFile("/hello_world/hello_world"));
        assertFalse("File shall be not found",
                    ftp.getFile("/hello_world") == null);

        output.reset();
        file = new File(FTPClient.DEFAULT_BASE_DIR + "/home/me/hello_world/hello_world");
        assertEquals(fileLocation + "/hello_world", file, ftp.getFile(fileLocation + "/hello_world/hello_world"));
        assertEquals(fileLocation + "/hello_world", ftp.getFile("/hello_world/hello_world"));

        output.reset();
        file = null;
        ftp = null;
        fails("Connect error", new Exception("Fluic connection error"));

        output.reset();
        file = new File(FTPClient.DEFAULT_BASE_DIR + "/home/me/hello_world/hello_world");
        assertEquals("File shall be found", file, ftp.getFile(fileLocation + "/hello_world/hello_world"));
        assertEquals("File shall be not found", file, ftp.getFile("/hello_world/hello_world"));
    }
}