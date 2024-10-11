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
		
    /**
     * Test method for {@link nu.staldal.ftp.FTPDrive_6#deleteFile(String)}.
     */
    @Test
    public void testDeleteFile1() {
		String pathname = "/foo/bar.txt";
		boolean res = FTPDrive_6.deleteFile(pathname);
		assertTrue("Failed to delete file", res);
	}

    /**
     * Test method for {@link nu.staldal.ftp.FTPDrive_6#deleteFile(String)}.
     */
    @Test
    public void testDeleteFile2() {
		String pathname = "/foobar";
		boolean res = FTPDrive_6.deleteFile(pathname);
		assertTrue("Failed to delete file", res);
	}

    @Test
    public void testCreateFtpSocketClient_FTPClientError()
        throws java.net.SocketException, java.net.UnknownHostException {
		FTPDrive_6.createFtpClient();
	}
}