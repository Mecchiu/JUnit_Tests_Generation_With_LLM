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
	 * Test of createFile(String)
	 */
    @Test
    public void testCreateFile() throws Exception {
        System.out.println("SSHFileStorageTest.testCreateFile");
		RemoteFileStorage sf1 = new SSHFileStorage();

		OutputHandler test = sf1.createFile("test");
		assertEquals("file.txt",
				   test.getOutputStream().toString());
		
		test = sf1.createFile("test.txt");
		assertEquals(
				"file.txt",
				test.getInputStream().toString());
		
		// this is really weird. but if there is no way to get this far,
		// the test can't throw an exception
		OutputHandler test2 = sf1.createFile("test2.txt");
		assertTrue(sf1.getInputStream()==null);
        assertTrue(sf1.getOutputStream()==null);
			try {
				sf1.createFile("/tmp");
				fail("File system root "/ was not available while creating the file");
			} catch (Exception e) {
				assertTrue(e instanceof FileNotFoundException);
			}
			
	}

}