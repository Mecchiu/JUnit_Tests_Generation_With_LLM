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
     * Start a new test session by executing a new thread. 
     */
    @Test
    public void testCreateFile() {
        FileStorage fs = new SSHFileStorage(new LagoonContext("server", "user", "pw"), "localhost", "/Users/bob");

        try {
			FileWriter fw = new FileWriter();
			fw.write("Hello World!");
			fw.close();
	    } catch (IOException e) {
	    	e.printStackTrace();
			fail();
	    }
		fs.close();
    }

}

// LocalSSHFileStorage.java