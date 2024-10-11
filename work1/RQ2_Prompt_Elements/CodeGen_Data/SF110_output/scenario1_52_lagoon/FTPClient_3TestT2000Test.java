// FTPClient_3Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#append(String, boolean)} method.
*/
class FTPClient_3Test {
// Pathnames not specified by default
		public final static File NON_DEFAULT_DIR = new File("/non-default/dir");
		// Server sent special characters after non default directory
		public final static String NON_DEFAULT_PATH = "X";
		// Host name is also sent
		public final static String NON_DEFAULT_HOST = "";
				
		// Pathname used for non default pathnames
		public final static String NON_DEFAULT_PATHNAME = "/non-default/path";
		
		// A new directory is started with a file open command
		public final static String NEW_DIR_FILE =  "mkd" + NON_DEFAULT_DIR.getSimpleName();
				
				
	
		/**
		 * Tests FTPClient.append() method of the FTPClient class.
		 * @throws URLFailed If no FTPClient connection is established. 
		 * @throws IOFailed On remote server failure.
		 * @throws IOException On other local failure.
		 */
	    @Test 
  	  public void testAppend() throws  UrlFailed,IOFailed,IOException {
		FTPClient client = new FTPClient();
		OutputStream outputstream = client.append("/", false);
		// The server sends a "/" at the end of all operations
		assertEquals(NON_DEFAULT_DIR.getName(), outputstream.toString());
		inputStream(NON_DEFAULT_DIR, false);
	}
	
	  /**
   * Test method for {@link FTPClient#getLastModifiedTime(String)}.
   * @throws URLFailed If no connection to server is established.
   * @throws IOFailed The server couldn't be checked or was a timeout.
   * @throws IOException A local failure.
   * @throws IOException When a response sent but not received.
   */
	@Test 
    public void shouldGetLastModifiedTime() throws IOFailed,IOException {

    	final String url = "http://foobar:9999";

		FTPClient client = new FTPClient();
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		assertEquals(client.getLastModifiedTime(url), connection.getLastModifiedTime());
		connection.disconnect();
	}	
}