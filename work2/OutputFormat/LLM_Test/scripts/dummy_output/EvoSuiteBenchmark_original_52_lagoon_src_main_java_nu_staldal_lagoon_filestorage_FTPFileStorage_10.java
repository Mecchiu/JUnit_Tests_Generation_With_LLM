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
		 * Simple constructor to create test.
		 */
	public FTPFileStorageTest() { }

	/**
	* This method will transmits the password to connect to
	* the remote host to the target site.
	* @param serverServerURI the target URL
	* @param localPasswd the test password
	*/
	@Test
	void testCreateFile(String serverURI, String localPasswd) throws Exception {
					
		String serverHost;
		String serverPassword;
		String sourcePath = "src/test/resources/files/test.txt";

		FTPFileStorage ftpFileStorage = new FTPFileStorage();

		try {
			serverHost = InetAddress.getByName(serverURI).getCanonicalHostName();
			serverPassword = localPasswd;
		} catch (UnknownHostException e) {
			e.printStackTrace();
			assertEquals("Hostname not defined", e.getMessage());
			return;
		}

		FileLocal remoteFile = ftpFileStorage.createFile(sourcePath);

		assertNotNull(remoteFile);
		assertEquals(sourcePath, remoteFile.getPath());

		String remoteFilePath = remoteFile.getPath();
		assertNotNull(remoteFilePath);
		
		FileOutputHandler remoteFileOutputHandler = (FileOutputHandler) ftpFileStorage.createFile(remoteFilePath);
		assertNotNull(remoteFileOutputHandler);

		remoteFileOutputHandler.writeString(serverHost + ":" + serverPassword + ":localhost:" + serverPort + "/" + sourcePath);

		assertEquals(serverHost + ":" + serverPassword + ":localhost:" + serverPort + "/" + sourcePath, remoteFilePath);
	}

	/**
	* This method will transmits password in clear text to connect
	* to the port to the target host via FTP.
	*/
	@Test
	void testFTP() throws Exception {
				
		FileLocal remoteFile = new FileLocal("remoteTestDir");

		// Ftp file will send password in clear text to the remote host to port 1099
		String ftpPassword = "password;";

		remoteFile.setPath(ftpPassword);

		String remoteFilePath = remoteFile.getPath();

		FileOutputHandler remoteFtpFileOutputHandler = (FileOutputHandler) remoteFile.getRemoteFileOutputHandler();
		remoteFtpFileOutputHandler.writeString(ftpPassword);
		assertEquals(ftpPassword, remoteFtpFileOutputHandler.readString());

		assertEquals(remoteFilePath, remoteFtpFileOutputHandler.readString());
	}

	/**
	* This method will creates a {@link RemoteServer} instance which will 
	* handle incoming connections.
	*/
	@Test
	public void testFTP() throws Exception {
					
		FileLocal netDir = new FileLocal("netDir");

		String localIPAddress = InetAddress.getLocalHost().getHostAddress();
		String localIPPort = InetAddress.getLocalHost().getHostAddress() + ":" + port;
		
		netDir.addChild(localIPAddress);
		netDir.addChild(localIPPassword);
		netDir.addChild(localIPPort);

		FileLocal netLocalDir = new FileLocal("netDir") {"localDir";};

		netLocalDir.addChild(localIPAddress);
		netLocalDir.addChild(localIPPort);
				
		String serverIPAddress = netLocalDir.getHost();

		int serverPort = netLocalDir.getPort();

		FTPFileStorage ftpFileStorage = new FTPFileStorage(serverIPAddress, serverPort);

		assertEquals(localIPAddress, ftpFileStorage.getLocalIPAddress());
		assertEquals(localIPPort, ftpFileStorage.getLocalPort());
		
		FTPFileHandle remoteFTPAbort = ftpFileStorage.connectFTP();
		assertNotNull(remoteFTPAbort);
		
		assertEquals(ftpPassword, remoteFTPAbort.readPassword());
		try {
			String remoteFile = remoteFTPAbort.readString();
			remoteFTPAbort.abort();

			String remoteFilePath = remoteFile.substring(remoteFTPAbort.getRemoteFilePath().length());

			assertTrue((remoteFilePath).contains(ftpPassword));

			// verify the string which contains the password
			assertEquals(ftpLocalIPAddress + ":" + ftpLocalPort, remoteFTPAbort.getLocalIPAddress());
			assertEquals(ftpLocalPort, remoteFTPAbort.getLocalPort());

			// verify the string which starts with the network
			assertEquals(netLocalIPAddress + ":" + netLocalPort, remoteFTPAbort.getLocalIPAddress());
			assertEquals(netLocalPort, remoteFTPAbort.getLocalPort());

			remoteFTPAbort.close();

		} catch (Exception e) {
			assertEquals("Unable to establish connection", e.getMessage());
			ftpFileStorage.close();
		}
	}

	// -------------------------------------------------------------------------

	/**
	* The main function
	* @param args args[0]
	* @throws IOException ioException
	*/
	public static void main(String args[]) throws Exception {

		for (int i = 0; i < args.length; i++) {
			if (args[i].equals( "-f" )) {
				System.exit(0);
			}
			if (args[i].equals("-r") ) {
				serverURI = args[++i];
			} else if (args[i].equals("-p") ) {
				localPort = Integer.parseInt(args[++i]);
			} else if (args[i].equals("-d") ) {
				localDir = args[++i];
			} else if (args[i].equals("-nc") ) {
				networkDirectory = args[++i];
			} else if (args[i].equals("-a") ) {
				localIPAddress = InetAddress.getLocalHost().getHostAddress();
			} else {
				System.err.println("Unknown argument: " + args[i]);
				System.exit(1);
			}
		}
	}
}