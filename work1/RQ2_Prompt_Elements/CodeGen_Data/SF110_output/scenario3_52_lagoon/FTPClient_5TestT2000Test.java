// FTPClient_5Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#storeUnique(String, boolean)} method.
*/
class FTPClient_5Test {
@Test
	    public void test() throws java.lang.Exception {
                assertNotNull(new FTPClient());

    	}
	
	/**
	 * Test constructor of class {@link FTPClient} and its parent.
	 * <em>Not</em> thread-safe, i.e. you cannot start a new file while another one is in
	 * progress.
	 */
    private static class FTPClient_5TestParent extends FTPClient {
	}

    /**
     * File server test.
     */
    @Test
    public void test() throws java.lang.Exception {
	OutputStream os;

	try {
	    // create a connection to the FTP server
	    ServerSocket ss = new ServerSocket (5000);

	    // connect the server to a client
	    InetAddress addr = ss.getInetAddress();
	    int port = ss.getLocalPort();

	    // create a FileServer
	    FTPClient ftp = new FTPClient(false);

	    // make sure it runs properly
	    ftp.listPaths().write("Test_server.lnk");

	    // make a connection to a local server
	    ConnectionImpl conn = new ConnectionImpl(addr, port);

	    // connect a new FTP connection to it
	    conn.connect();

	    // write some path's content
	    OutputStream os = conn.exec("mkdir", "-m", "file");
	    os.write("test_server.lnk");

	    // close the connection
	    conn.close();

	    // open new FTP client to the server
	    FTPClient ftp = new FTPClient(false);

	    // make sure it runs properly
	    os = ftp.getOutputStream();

	    // get path of connection
	    os.write("test_client.lnk");

	    // read the connection
	    InputStream is = conn.readInputStream();

	    // make sure it runs properly
	    is.read();

	    // close connection
	    conn.close();

	} finally {
	    ServerSocket ss = new ServerSocket(5000);

	    while (true) {
		assertTrue("FTP Client is not connected to a server", ss.isBound());
		ss.close();
		break;
	    }
	}
    }
}

