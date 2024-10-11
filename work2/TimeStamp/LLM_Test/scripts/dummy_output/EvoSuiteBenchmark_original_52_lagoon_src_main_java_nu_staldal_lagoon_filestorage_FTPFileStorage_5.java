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
	 * Tests the {@link FTPFileStorage} constructor.
	 * @throws java.io.IOException if test fails
	 */
	@Test
    public void testFileStorageBuilder() throws IOException {
		
		boolean expectedResult = false;
		RemoteFileStorage ftp = new FTPFileStorage();
		
		RemoteFileStorage.Builder builder = ftp.createFile("C:\Users\Nova\Lagoon\Desktop").builder();
		expectedResult = expectedResult;
		
		String url = "ftp://Nova.Lagoon.desktop/" + builder.getHostname();
		InputStream is = builder.build(new BufferedInputStream(new FTPImpl(url)));
		assertTrue(expectedResult);
	}
}