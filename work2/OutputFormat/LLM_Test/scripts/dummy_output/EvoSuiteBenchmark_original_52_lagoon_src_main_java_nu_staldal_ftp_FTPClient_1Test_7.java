// FTPClient_1Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#store(String, boolean)} method.
*/
class FTPClient_1Test {
		
    /**
     * Empty string, which will be sent as the first command to an FTPClient.
     * It is used when the protocol is not known.
     */
    public static final String UNKNOWN_PROTOCOL = "";
	
    /**
     * The first command sent by an ftp server.
     * Use null for unknown protocol.
     * @see FTPClient.UNKNOWN_PROTOCOL
     */
    public static final String NO_PROTOCOL = null;
	
    /**
     * The FTP protocol version number.
     * This number must be 7 for "".
     */
    public static final int PROTOCOL_VERSION = 7;

    /**
     * Empty string, which will be used as an empty filename as parameter of the
     * store(String, boolean).
     */
    public static final String UNKNOWN_FILENAME = "";

    /**
     * This will be printed as a message if authentication fails.
     */
    public static final String UNKNOWN_CREDIT_STATUS = "";
	
    /**
     * The protocol used to communicate with a server.
     */
    public static final String FTP_PROTOCOL_1 = "FTP";

    /**
     * The protocol used to communicate with a server in passive mode.
     */
    public static final String FTP_PROTOCOL_2 = "FTP4";

    /**
     * The hostname of the host that will receive this connection.
     * If null, an unknown host will be used.
     */
    public static final String FTP_PROTOCOL_HOST_0 = "ftp.0";

    /**
     * The hostname of the host that will receive this connection.
     * If null, an unknown host will be used.
     */
    public static final String FTP_PROTOCOL_HOST_1 = "ftp.1";

    /**
     * The port number that will be used for this ftp connection.
     * If null, it will be set to 21.
     */
    public static final int FTP_PROTOCOL_PORT_0 = 21;

    /**
     * The port number that will be used for this ftp connection.
     * If null, it will be set to 21.
     */
    public static final int FTP_PROTOCOL_PORT_1 = 21;

    /**
     * The port number that will be used for this ftp connection.
     * If null, it will be set to 21.
     */
    public static final int FTP_PROTOCOL_PORT_2 = 21;

    /**
     * The password (if any) to be sent with the transfer of this file.
     */
    public static final String FTP_PROTOCOL_PASSPHRASE = "";

    /**
     * @see FTPClient#store(String, boolean)
     */
    @Test
    void store() throws IOException, FTPException, ClassNotFoundException  {
		FTPClient ftp = new FTPClient();
		ftp.setProtocolVersion(PROTOCOL_VERSION);
		assertNull(ftp.setProtocol(FTP_PROTOCOL_1));
		ftp.setExpectedProtocolVersion(PROTOCOL_VERSION);
		String path = FTP_PROTOCOL_HOST_0;
		assertNull(ftp.setHost(path));
		assertEquals(FTP_PROTOCOL_HOST_0, ftp.getHost());
		String username = FTP_PROTOCOL_HOST_0;
		String username2 = "";
		assertNull(ftp.setUsername(username));
		assertEquals(FTP_PROTOCOL_HOST_0, ftp.getHost());
		assertNull(ftp.setPassword(FTP_PROTOCOL_PASSPHRASE));
		assertEquals("null", ftp.getPassword());
		assertNull(ftp.setRemoteAddr(FTP_PROTOCOL_HOST_1));
		assertEquals(FTP_PROTOCOL_HOST_1, ftp.getHost());
		ftp.setRemoteAddr(FTP_PROTOCOL_HOST_1);
		assertEquals(FTP_PROTOCOL_HOST_1, ftp.getHost());
		boolean connected = ftp.connect();
		// should be false
	}
    
	/**
     * This will be printed as a message at the exit of this program.
     */
    public static final String LOG_TIMEOUT_2 = "timeout";

    /**
     * The last command sent by an ftp server.
     * This value is null if all commands have been send.
     */
    public void checkAllSent() throws IOException {
        assertTrue(ftp.isConnected());
        
		assertNull(username);
		assertNull(password);
		// must be true anyway
		assertTrue(ftp.isAuthenticated());

		assertEquals(LOG_TIMEOUT_2, ftp.getLogTimeOut());

        // test set remote address now
        String host = ftp.getHost();
        assertEquals(FTP_PROTOCOL_HOST_0, host);
        assertNotNull(ftp.getRemoteAddr());
        
		FTPClient ftp2 = new FTPClient();
		try {
			ftp2.setRemoteAddr(null);
			fail("IllegalStateException expected");
		} catch (IllegalStateException e) {
			// expected
		}
        assertFalse(ftp2.isConnected());
        assertTrue(ftp2.isAuthenticated());
		
		assertEquals(FTP_PROTOCOL_HOST_1, ftp2.getHost());
		assertNotNull(ftp2.getRemoteAddr());

        // test read from and write to a null pathname
        assertEquals("", ftp2.getPassiveMode());

		ftp2.setRemoteAddr("/");
		assertEquals(FTP_PROTOCOL_HOST_1, ftp2.getHost());

		String path = ftp2.getPassiveMode();
		Path dir = new Path(path.replace('?', '/'));
		assertEquals("/", dir.toUri().getPath());
        
		try {
			ftp2.abort();
			// if protocol is used for passive mode
			// should be true, should be false
			assertTrue(ftp2.isConnected());
			assertTrue(ftp2.isAuthenticated());

			assertFalse(ftp2.isPassiveMode());
		} catch (ConnectException e) {
			// if passive mode is used
			// assertTrue won't help!
			// assertFalse won't help!
		}
	}

    /**
	 * Creates a new FTPClient instance with default protocol version.
	 * @see FTPClient#store()
	 */
    public static FTPClient getDefaultFTPClient() {
		FTPClient ftp = new FTPClient();
}
}