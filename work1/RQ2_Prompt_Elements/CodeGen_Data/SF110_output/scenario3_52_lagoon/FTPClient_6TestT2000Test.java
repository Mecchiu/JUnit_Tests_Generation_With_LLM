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
private String host = FtpServer.getInstance().getConfiguration("FTPS_HOST");
        private int port = FtpServer.getInstance().getConfiguration("FTPS_PORT").intValue();

	private FtpClient ftpClient = new FtpClient();

	private String path;	
	private String remoteDest = "";
	private String localDest = "";

	private boolean passiveMode, passivePW;
	
	/**
	 * @param passwd can be null
	 */
		private void SetUp(String passwd) throws Exception {
			passiveMode = false;			
			passivePW = false;
			remoteDest = "/";
			localDest = FtpServer.getInstance().getConfiguration("FTPS_REMOTE_DESTINATION")
								     .toString();
			ftpClient.initializeServer();
		}

	/**
	 * Test of deleteFile function with argument string.
	 * @param pathname
	 * @return true if successful, false otherwise (file wasn't deleted)
	 * @throws FTPException 
	 * @throws IOException 
	 */
		@Test  
		public void testDeleteFile(String pathname) throws FTPSException, IOException {

			SetUp(passwd);
			ftpClient.deleteFile(pathname);

			assertTrue("file didn't exist", FtpServer.getInstance().exists(path));
			assertTrue("file didn't exist", FtpServer.getInstance().isFile(path));			
		}

    /**
     * Tests that the remote dest is set by default.
     * @throws Exception any exception
     */
    @Test
    public void testSetsDefaultDest() throws Exception {

        remoteDest = FtpServer.getInstance().getConfiguration("DEFAULT_REMOTE_DEST")
                                                  .toString();
        SetUp(passwd);
        assertEquals("default remote dest not set", "/", remoteDest);
    }

    /**
     * Tests that a local dest is set by default.
     * @throws Exception any exception
     */
    @Test
    public void testSetsDefaultDest0() throws Exception {

        localDest = FtpServer.getInstance().getConfiguration("DEFAULT_LOCAL_DEST")
                                                   .toString();
        SetUp(passwd);
        assertEquals("default local dest not set", FtpUtil.PATH_PREFIX, localDest);
    }

    /**
     * Tests that a local dest is set by value.
     * @throws Exception any exception
     */
    @Test
    public void testSetsDestination() throws Exception {

        localDest = FtpServer.getInstance().getConfiguration("LOCAL_DEST")
                                                   .toString();
        SetUp(passwd);
        assertEquals("local dest not set", FtpUtil.PATH_PREFIX, localDest);
    }

    /**
     * Tests that a remote dest is set by value.
     * @throws Exception any exception
     */
    @Test
    public void testSetsDestination0() throws Exception {

        remoteDest = FtpServer.getInstance().getConfiguration("REMOTE_DEST")
                                                   .toString();
        SetUp(passwd);
        assertEquals("remote dest not set", FtpUtil.PATH_PREFIX, remoteDest);
    }
}
