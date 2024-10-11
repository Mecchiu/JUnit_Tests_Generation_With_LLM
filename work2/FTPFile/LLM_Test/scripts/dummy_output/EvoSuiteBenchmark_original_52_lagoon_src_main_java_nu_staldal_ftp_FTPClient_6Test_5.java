// FTPClient_6Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#deleteFile(String)} method.
*/
class FTPClient_6Test {
		private final String passPwd = "pwd";
		private final String dir = "/tmp/deleted";
		private final String file = "/tmp/file";
		private final String host = "192.168.1.1";
	
	// -------------------------------------------------------------------------
	//  Test cases
	// -------------------------------------------------------------------------

	private void checkEquality(FTPClient client1, FTPClient client2) {
		assertNotNull(client1);
		assertEquals(client1.getHostConfiguration(), client2.getHostConfiguration());
		assertTrue(client1.equals(client1));
		assertTrue(client1.hashCode() == client1.hashCode());
		assertNotNull(client1.deleteFile(dir));
		assertEquals(client1.deleteFile(dir), true);
		assertTrue(client1.deleteFile(dir) == false);
		assertNotNull(client1.getFile(dir));
	}
	
	private void checkNotEquality(FTPClient client1, FTPClient client2) {
		assertNotEquals(client2, client1);
	}
	
	@Test
	public final void testFtp() throws IOException, InterruptedException {
		final String ftpFile = "/tmp/ftpfile";
		final String host = "239.20.2.20";
		final int port = 21;
		final String ftpDirectory = "/tmp";
		final String ftpDirectorySeparator = "/";
		FTPClient client = new FTPClient();
		client.setHostConfiguration(host);
		client.connect(port);
		byte[] cmdPwd = new byte[] {12, (byte) 0, 0, passPwd.getBytes().length };
		sendCmd(cmdPwd);
		String pathname = readUntil(ftpDirectorySeparator + (ftpDirectory + "/" + ftpDirectorySeparator));
		assertEquals("ftp",pathname);
		client.setPath(pathname);
		assertTrue(ftpDirectory.equals(pathname));
		client.enterLocalPassiveMode();
		ftpDirectory = "/";
		pathname = readUntil(ftpDirectorySeparator + (ftpDirectory + "/" + ftpDirectorySeparator));
		assertEquals("ftp",pathname);
		client.changeDir(ftpDirectory);
		client.connect();
		String pathname2 = readUntil(ftpDirectorySeparator + (ftpDirectory + "/" + ftpDirectorySeparator));
		client.disconnect();
		client.setPath(ftpFile);
		pathname2 = readUntil(ftpFile);
		assertEquals(ftpFile,pathname2);
		assertEquals(passPwd, new String(((DataInput) outputStream).readByteArray()));
		checkEquality(client, client);
    }

	@Test
	public final void testFile() throws IOException, InterruptedException {
		final String localFile = "/tmp/myfile";
		final String file = "/tmp/myfile";
		String ftpFile = "/tmp/myfile";
		String host = "239.20.2.20";
		int port = 21;
		final String fileDirectory = "/tmp";
		final String ftpPathSeparator = "/";
		FTPClient client = new FTPClient();
		client.connect(port);
		String cmdDir = "CWD " + fileDirectory;
		sendCmd(client, cmdDir, ftpFile, localFile);
		client.disconnect();
		client.setFile(ftpFile, localFile);
		String pathname = readUntil(ftpFile + "/" + localFile);
		assertEquals("local file",pathname);
		client.setPath(ftpFile);
		pathname = readUntil(file + "/" + ftpFile);
		assertEquals("remote file",pathname);
    }

	@Test
	public final void testFileBulk() throws IOException, InterruptedException {
		final String remoteFile = "/tmp/myfile";
		final String remoteDirectory = "/tmp/mydirectory";
		final String ftpDirectory = "/tmp";
		final String localFile = "/tmp/myfile";
		String ftpFile = "/tmp/myFile";
		String host = "239.20.2.20:21";
		final int port = 21;
		final String ftpPathSeparator = "/";
		FTPClient client = new FTPClient();
		client.setHostConfiguration(host);
		client.connect(port);
		byte[] cmdDir = new byte[] {12, (byte) 0, 0, passPwd.getBytes().length };
		sendCmd(client, "CWD " + ftpDirectory, ftpFile, remoteFile);
		client.disconnect();
		client.setPath(ftpFile);
		client.enterLocalPassiveMode();
		String pathname = "";
		ftpDirectory = "/";
		readUntil(ftpDirectorySeparator + (ftpDirectory + "/" + ftpDirectorySeparator));
		client.changeDir(ftpDirectory);
		pathname = readUntil(ftpDirectorySeparator + (ftpDirectory + "/" + ftpDirectorySeparator));
		assertEquals("ftp",pathname);
		client.disconnect();
		client.setPath(ftpFile);
		readUntil(ftpFile);
		client.changeDir(remoteDirectory);
		client.connect();
		pathname = "";
		readUntil(ftpFile + "/" + localFile);
		assertEquals(localFile, pathname);
		client.setPath(remoteFile);
		ftpFile = "/tmp/myfile";
		readUntil(ftpFile + "/" + remoteFile);
		assertEquals(remoteFile, pathname);
    }

	/**
	 * Reads the binary data in from the given string.
	 *
	 * @param bin input data
	 * @return the given data as a string
	 */
	private final String readUntil(final String bin) {
		final InputStream inputStream = new ByteArrayInputStream(bin.getBytes());
		return byteBuffer().on(inputStream).asString();
	}

	private static DataOutputStream outputStream = null;
    private static ByteBuffer byteBuffer = null;
	private static DataInputStream inputStream = null;
	@Test
	public final void testFtpByteBufferOn() throws IOException {
		final String localFile = "/tmp/myfile";
		final String remoteFile = "/tmp/myfile";
		final String ftpFile = "/tmp/myfile";
		final String host = "239.20.2.20";
		int port = 21; // defaults to FTP port 21
		final String ftpDirectory = "/tmp";
		byteBuffer = ByteBuffer.wrap(new byte[0]);
		inputStream = new ByteArrayInputStream(ftpDirectory.getBytes());
		byteBuffer.position(0);
		client.enterLocalPassiveMode();
		byteBuffer.clear();
		ftpDirectory = "/";
		writeUntil(ftpDirectorySeparator + (ftpDirectory + "/" + ftpDirectorySeparator));
		ftpDirectory = "";
}
}