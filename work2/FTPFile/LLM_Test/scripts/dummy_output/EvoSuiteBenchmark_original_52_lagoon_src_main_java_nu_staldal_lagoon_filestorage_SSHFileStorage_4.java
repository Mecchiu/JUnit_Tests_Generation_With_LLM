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
		private RemoteFileStorage remoteFileStorage;
		private String remoteUri;
		private String remoteFilePath;
		private Vagrant vagrant;
	 	 	 private static FileOutputStreamFactory factory;

    public SSHFileStorageTest() {
        try {
            factory = new VagrantFileOutputStreamFactory("vagrant"); 
        } catch (Exception e) {
            throw new IllegalStateException("Expected factory.getOutputStream() to return an OutputStream on Vagrant environments, but it did not.", e);                
        }
    }

        /**
         * @com.intel.lwtc.f.platform.v3.1.0.osgi
         * @name createFile
         * @jvms 3.3
         */ 
    @Test
    public void createFile() throws FileNotFoundException, IOException {
        remoteFileStorage = new RemoteFileStorage(remoteUri, factory);
		remoteFilePath = "testfile";
		remoteFileStorage.createFile(remoteFilePath);
	
		remoteFileStorage.commitFile(remoteFilePath);

		assertTrue("Expected upload attempt to succeed",
				remoteFileStorage.retrieveRemoteLocation(remoteFilePath)!= null);
		
		remoteFileStorage.close();
	}

    /**
     * @com.intel.lwtc.f.platform.v3.1.0.osgi
     * @jvms 3.3
     */
    @Test
    public void createFileToDifferentFileLocation() throws MalformedURLException,
        FileNotFoundException{
	 	 	    remoteFileStorage = new RemoteFileStorage("somewhereelse", factory);
		remoteFilePath = "testfile";
		remoteFileStorage.createFile(remoteFilePath);
		
		remoteFileStorage.commitFile(remoteFilePath);

		assertTrue("Expected upload attempt to succeed",
				remoteFileStorage.retrieveRemoteLocation(remoteFilePath)!= null);
	}

    /**
     * @jvms 6.1
     */
    public void closeFile(OutputHandler outputHandler){
		if(remoteFileStorage!= null){
			remoteFileStorage.close();				
		}
	}
	
/**
 * @jvms 3.3.6.d.6.4.b.a.3.6.d.1
 */
    @Test
    public void discardFile() throws FileNotFoundException, IOException {
        remoteFileStorage = new RemoteFileStorage("vagrant", factory);
		remoteFileStorage.createFile("testfile");
	
		remoteFileStorage.discardFile(remoteFilePath);
	
		assertFalse("Expected upload attempt to fail",
			remoteFileStorage.retrieveRemoteLocation(remoteFilePath) == null);
		remoteFileStorage.close();
	}

	 	@Test
	    public void getRemoteLocationDoesNotExistOnFileStorage() throws FileNotFoundException{
	    	try {
	    		remoteFileStorage = new RemoteFileStorage("somefakeuri", factory);
	    		remoteFileStorage.getRemoteLocation(remoteFilePath);	
	    		fail("Expected getRemoteLocation to throw FileNotFoundException");
	    	} catch (IOException e) {
	    		assertTrue("Expected getRemoteLocation to return null",
	    				e.getMessage().contains(
	    		    "does not exist"));
	    		System.out.println("\tExpecting exception: " + e.getMessage());
	    	}
	    }
}