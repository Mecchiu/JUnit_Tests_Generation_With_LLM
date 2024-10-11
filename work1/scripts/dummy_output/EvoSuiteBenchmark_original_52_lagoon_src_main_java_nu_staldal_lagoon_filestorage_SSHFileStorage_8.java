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
		
		/** Empty constructor - will be a no-op on Java 7. */
		private SSHFileStorageTest() {}

    /**
     * Test of createFile() method, of class SSF.
	 * @throws MalformedURLException 
     * @throws IOException 
     */
	@Test
    public void testCreateFile() throws MalformedURLException, IOException {
        FileStorage.clear();
        RemoteFileStorage.clear();
        SSF.setConfig(null, System.getProperty("user.home") + File.separator +  new File(".").getName());
        SSF.setContext();
        SSF.setOutputHandler();
        assertEquals(null, SSF.getOutputHandler());
    }
    
}