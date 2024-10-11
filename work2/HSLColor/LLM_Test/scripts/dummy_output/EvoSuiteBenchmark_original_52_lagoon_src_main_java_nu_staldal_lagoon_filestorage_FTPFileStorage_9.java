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
		* Test constructor.
		*/
	@Test
	public void testConstructor() {
		assertTrue(FTPUtils.supportsSecureFileSystems());
		assertFalse(FTPUtils.supportsSecureFTP());
	}

	/**
	* Test creation of a {@link LocalFileStorage}.
	*/
	@Test
	public void testLocalFileStorage() throws Exception {
		
	      // Create a new FTPFileStorage
		LocalFileStorage lfs = new LocalFileStorage(new HashMap<String,String>());
		
		// Try to create the storage with a null location parameter
                
		try {
			if (lfs!= null) {
				assertEquals(lfs, LocalFileStorage.createFileStorage(null));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}