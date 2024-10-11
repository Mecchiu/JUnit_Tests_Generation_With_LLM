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
		
        @Test
        public void test()
                        throws FTPException, MalformedURLException, FileNotFoundException {

                /* This will write a 100 byte string to a file and verify that it is readable and writeable. */
                final FTPFile file1 = new FTPFile("dummy", "testfile", 100);
                final URL url1 = file1.getAddress().toURL();
                assertNotNull(url1);
                RemoteFileInputStream inFromFile = new RemoteFileInputStream(file1.pathname(), false);

                /* Create a file to be written. */
                final FTPFile file2 = new FTPFile("dummy", "testfile", 1);

                /* Verify that the file exists and can be read with a read stream. */
                assertTrue("Expected non-empty read stream after file creation.",
                            inFromFile.available() > 0);

                /* If writing is failed after the file exists, the read stream
                 * will be returned. */
                assertEquals("The stream should be empty.", 0,
                             new FTPFileInputStream(inFromFile, 0).available());

                /* We should only write one byte of the stream. */
                assertEquals("There should be 1 byte written", 1,
                             new FTPFileInputStream(inFromFile, 1).available());

                /* Write more data and verify that the reader has the correct bytes. */
                inFromFile.setAvailable(10);
                assertTrue("Expected more than 1 byte read", inFromFile.available() > 1);
                byte b = inFromFile.read();
                assertEquals("The last byte should be the first byte written.", b, inFromFile.available());

                /* Attempt to read the first byte and verify that it is the first byte of the file.*/
                assertEquals("The first character should be the character 'B', as described on the RFC. "
                                + "More characters for testing are currently not defined.",
                         'B', b);

                /* We want to close the stream using close. */
                File toClose = null;
                if (inFromFile!= null) {
                    inFromFile.close();
                    toClose = inFromFile.getFile();
                }

                /* Try closing the file first and check that the file was deleted correctly. */
                if (toClose!= null) {
                assertFalse("There is a deleted file " + toClose.getCanonicalPath() +
                            "in the file storage.",
                        toClose.delete());
                    }
            }

}