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
private static final String serverName = "staldalagoon.fr";
	private static final int port = 80;
	private static final String password = "password1243";
	private static final String url = "ftp://" + serverName + ":" + port + "/";
	private final static String FILE = "samplefile";
	@Test
	void testCreateFile() throws IOException {
		OutputHandler fo = createFile(FILE);
		assertTrue(fo.isClosed());
	}

	private FTPClient createClient(String url) throws MalformedURLException {
		System.out.println("Trying to connect to " + url);
		FTPClient client = new FTPClient();
		client.setConnectTimeout(2);
		client.setSoTimeout(1000);
		client.connect(url);
		return client;
	}

	@Test
	void testCreateDir() throws IOException {
		OutputHandler fo = createFile(FILE + "/");
		assertTrue(fo.isClosed());
        boolean isDir = ftp.cwd(FILE + "/");
		assertTrue(isDir);
	}

	@Test
	void testPutFile() throws IOException {
		FTPClient client = createClient(url);
		OutputHandler fo = createFile(FILE);
		assertTrue(fo.isClosed());
		isFile = client.cwd(FILE) == null;
		fo.putFile(FILE, isFile);
        assertTrue(isFile);
	}

	@Test
	void testPutDir() throws IOException {
		FTPClient client = createClient(url);
		
		OutputHandler fo = createFile(FILE + "/");
        boolean isDir = ftp.cwd(FILE + "/") == null;
		fo.putDir(FILE + "/");
        assertTrue(isDir);
        boolean isFile = client.cwd(FILE) == null;
        fo.putFile(FILE, isFile);
        assertTrue(isFile);
	}

	@Test
	void testRemoveDir() throws IOException {
		FTPClient client = createClient(url);
		
		OutputHandler fo = createFile(FILE);
		assertTrue(fo.isClosed());
		isFile = client.cwd(FILE) == null;
		fo.removeDir(FILE, true);
        isDir = client.cwd(FILE) == null;
        fo.removeFile(FILE, false);
        assertTrue(isDir);
    }

	@Test
	void testRemoveFile() throws IOException {
		FTPClient client = createClient(url);
		
		OutputHandler fo = createFile(FILE);
		assertTrue(fo.isClosed());
		isFile = client.cwd(FILE) == null;
		fo.removeFile(FILE, true);
        isDir = client.cwd(FILE) == null;
        fo.removeDir(FILE);
        assertFalse(isDir);
        isFile = client.cwd(FILE) == null;
        fo.removeFile(FILE, false);
        assertTrue(isFile);
	}

	@Test
	void testCWD() throws IOException {
        OutputHandler fo = createFile(FILE);
        boolean isDir = ftp.cwd(FILE) == null;
        fo.putFile(FILE, isFile);
        assertTrue(isDir);
        fo.getStoD();
        assertFalse(isDir);
    }

	private boolean isFile(OutputHandler fo) {
	    return fo.isFile();
	}

	private boolean isDir(OutputHandler fo) {
	    return fo.isDir();
	}

	private boolean isFile(OutputHandler fo, String name) {
	    return fo.isFile() && fo.getName().equals(name);
	}

	private boolean isDir(OutputHandler fo, String name) {
	    return fst(fo).isDir() && fo.getName().equals(name) == null;
	}

}