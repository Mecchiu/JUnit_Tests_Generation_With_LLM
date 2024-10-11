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
private RemoteFileStorage rfs;
		
    	/**
    	* Create a new FileStorage.
    	*
    	* <p>
    	* It calls {@link #rfs
    	* } with the given {@link RemoteFileStorage} and is expected to be connected
    	* using the system {@link java.net.InetSocketAddress}.
    	*/
   	static RemoteFileStorage createInetLocalFileStorage() {
    		rfs=new RemoteFileStorage();
    		
    		try {
    			InetSocketAddress addr = new InetSocketAddress("localhost", 1);
			rfs.connect(addr);
    			return rfs;
    		} 
    		catch (Exception e) {
    			assert (e instanceof FileNotFoundException);
    		}
    	
            return rfs;
    	}
    	
    	/**
    	* Delete the given FileStorage
    	*
    	* @param f storage to delete
    	*/
    	static void deleteInetLocalFileStorage(FileStorage f) throws Exception {
   			f.delete();
    	}
    	
    	@Test
    	void test() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException, IOException {
    		RemoteFileStorage rfs=createInetLocalFileStorage();
    		
    		assertEquals(rfs.name().length(), 3);
    		assertEquals(rfs.name(), "RemoteFileStorage");
    		RemoteFileStorage fs=rfs.clone();
    		assertEquals(fs.name().length(), 3 && rfs.name().length()==fs.name().length());
    		assertNotNull(Fs.open(rfs.name(), FsMode.CREAT));
    	}
}

/**
* Test class of {@link SSHFileStorage}.
* It contains one unit test case for the {@link SSHFileStorage#createFile(String)} method.
*/
class FsFileStorageTest extends SSHFileStorageTest {
	
    	/**
	   * Create a remote FileStorage using the given {@link RemoteFileStorage}
	   * and the name of a remote FileStorage.
	*/
		void createFileRemote(RemoteFileStorage rfs) throws FileNotFoundException {
			File f = new File(rfs.name());
			assertTrue(f.exists());
			assertEquals(rfs.name(),rfs.createFile(f),rfs.toString());
		}
}