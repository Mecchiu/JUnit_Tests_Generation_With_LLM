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
	* Test case for the {@link SSHFileStorage#createFile(String)} method.
	* It tests if the method returns an {@link OutputHandler} object.
	*/
	@Test
	void testCreateFile() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case for the {@link SSHFileStorage#createFile(String)} method.
	* It tests if the method returns an {@link OutputHandler} object.
	*/
	@Test
	void testCreateFile2() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case for the {@link SSHFileStorage#createFile(String)} method.
	* It tests if the method returns an {@link OutputHandler} object.
	*/
	@Test
	void testCreateFile3() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case for the {@link SSHFileStorage#createFile(String)} method.
	* It tests if the method returns an {@link OutputHandler} object.
	*/
	@Test
	void testCreateFile4() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case for the {@link SSHFileStorage#createFile(String)} method.
	* It tests if the method returns an {@link OutputHandler} object.
	*/
	@Test
	void testCreateFile5() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case for the {@link SSHFileStorage#createFile(String)} method.
	* It tests if the method returns an {@link OutputHandler} object.
	*/
	@Test
	void testCreateFile6() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case for the {@link SSHFileStorage#createFile(String)} method.
	* It tests if the method returns an {@link OutputHandler} object.
	*/
	@Test
	void testCreateFile7() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case for the {@link SSHFileStorage#createFile(String)} method.
	* It tests if the method returns an {@link OutputHandler} object.
	*/
	@Test
	void testCreateFile8() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case for the {@link SSHFileStorage#createFile(String)} method.
	* It tests if the method returns an {@link OutputHandler} object.
	*/
	@Test
	void testCreateFile9() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
	
	/**
	* Test case for the {@link SSHFileStorage#createFile(String)} method.
	* It tests if the method returns an {@link OutputHandler} object.
	*/
	@Test
	void testCreateFile10() throws IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		assertNotNull(outputHandler);
	}
}