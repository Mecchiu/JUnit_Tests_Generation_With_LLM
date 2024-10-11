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
	* Test case 1 for method {@link SSHFileStorage#createFile(String)}.
	*
	* @throws MalformedURLException
	* @throws IOException
	*/
	@Test
	void testCreateFile1() throws MalformedURLException, IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		sshFileStorage.open("ssh://localhost:22/home/user/", null, null);
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		outputHandler.commit();
		sshFileStorage.close();
	}
	
	/**
	* Test case 2 for method {@link SSHFileStorage#createFile(String)}.
	*
	* @throws MalformedURLException
	* @throws IOException
	*/
	@Test
	void testCreateFile2() throws MalformedURLException, IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		sshFileStorage.open("ssh://localhost:22/home/user/", null, null);
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		outputHandler.discard();
		sshFileStorage.close();
	}
	
	/**
	* Test case 3 for method {@link SSHFileStorage#createFile(String)}.
	*
	* @throws MalformedURLException
	* @throws IOException
	*/
	@Test
	void testCreateFile3() throws MalformedURLException, IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		sshFileStorage.open("ssh://localhost:22/home/user/", null, null);
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		outputHandler.commit();
		sshFileStorage.close();
	}
	
	/**
	* Test case 4 for method {@link SSHFileStorage#createFile(String)}.
	*
	* @throws MalformedURLException
	* @throws IOException
	*/
	@Test
	void testCreateFile4() throws MalformedURLException, IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		sshFileStorage.open("ssh://localhost:22/home/user/", null, null);
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		outputHandler.discard();
		sshFileStorage.close();
	}
	
	/**
	* Test case 5 for method {@link SSHFileStorage#createFile(String)}.
	*
	* @throws MalformedURLException
	* @throws IOException
	*/
	@Test
	void testCreateFile5() throws MalformedURLException, IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		sshFileStorage.open("ssh://localhost:22/home/user/", null, null);
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		outputHandler.commit();
		sshFileStorage.close();
	}
	
	/**
	* Test case 6 for method {@link SSHFileStorage#createFile(String)}.
	*
	* @throws MalformedURLException
	* @throws IOException
	*/
	@Test
	void testCreateFile6() throws MalformedURLException, IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		sshFileStorage.open("ssh://localhost:22/home/user/", null, null);
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		outputHandler.discard();
		sshFileStorage.close();
	}
	
	/**
	* Test case 7 for method {@link SSHFileStorage#createFile(String)}.
	*
	* @throws MalformedURLException
	* @throws IOException
	*/
	@Test
	void testCreateFile7() throws MalformedURLException, IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		sshFileStorage.open("ssh://localhost:22/home/user/", null, null);
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		outputHandler.commit();
		sshFileStorage.close();
	}
	
	/**
	* Test case 8 for method {@link SSHFileStorage#createFile(String)}.
	*
	* @throws MalformedURLException
	* @throws IOException
	*/
	@Test
	void testCreateFile8() throws MalformedURLException, IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		sshFileStorage.open("ssh://localhost:22/home/user/", null, null);
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		outputHandler.discard();
		sshFileStorage.close();
	}
	
	/**
	* Test case 9 for method {@link SSHFileStorage#createFile(String)}.
	*
	* @throws MalformedURLException
	* @throws IOException
	*/
	@Test
	void testCreateFile9() throws MalformedURLException, IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		sshFileStorage.open("ssh://localhost:22/home/user/", null, null);
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		outputHandler.commit();
		sshFileStorage.close();
	}
	
	/**
	* Test case 10 for method {@link SSHFileStorage#createFile(String)}.
	*
	* @throws MalformedURLException
	* @throws IOException
	*/
	@Test
	void testCreateFile10() throws MalformedURLException, IOException {
		SSHFileStorage sshFileStorage = new SSHFileStorage();
		sshFileStorage.open("ssh://localhost:22/home/user/", null, null);
		OutputHandler outputHandler = sshFileStorage.createFile("test.txt");
		outputHandler.discard();
		sshFileStorage.close();
	}
}