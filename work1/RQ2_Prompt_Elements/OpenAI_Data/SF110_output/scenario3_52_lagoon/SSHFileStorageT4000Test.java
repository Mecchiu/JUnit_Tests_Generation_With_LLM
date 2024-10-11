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
* It contains ten unit test cases for the {@link SSHFileStorage#createFile(String)} method.
*/
class SSHFileStorageTest {

	/**
	* Test case 1 for {@link SSHFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile1() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 2 for {@link SSHFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile2() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 3 for {@link SSHFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile3() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 4 for {@link SSHFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile4() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 5 for {@link SSHFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile5() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 6 for {@link SSHFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile6() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 7 for {@link SSHFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile7() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 8 for {@link SSHFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile8() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 9 for {@link SSHFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile9() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case 10 for {@link SSHFileStorage#createFile(String)}
	* @throws IOException
	*/
	@Test
	void testCreateFile10() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test");
		assertNotNull(outputHandler);
	}
}