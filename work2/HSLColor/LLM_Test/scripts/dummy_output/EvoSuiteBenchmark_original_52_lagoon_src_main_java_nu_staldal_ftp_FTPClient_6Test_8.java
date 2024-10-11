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
		  
	private final String host = "ftp://localhost.nl/path";
	  
	  // FTPClient_6Test.java
	/**
	* Delete a file using an FTP client.
	*
	* @param path the local or remote file to be deleted
	* @throws IOException if any other IO error occurs
	* @throws UnsupportedOperationException if the system does not support
	* the delete operation
	* @throws FTPException if it is not an FTP error
	*/
	@Test
	void test_deleteFile() throws IOException, UnsupportedOperationException, FTPException {
		  
		  // Use a thread for testing.
		  new Thread(new Runnable() {
				  public boolean isAlive() {
					return true;
				  }
				  public void run() {
					  try {
						  boolean result = FTPClient_6Test.this.deleteFile(FTPClient_6Test.this.host);

						  // Some of tests use this. (test/run/output test files are in this class)
						  assertTrue(isAlive() == false || result);
					  } catch (IOException e) {
						  e.printStackTrace();
					  } catch (UnsupportedOperationException e) {
						  e.printStackTrace();
					  } catch (FTPException e) {
						  e.printStackTrace();
					  }
				  }
			  }).start();
	  }
}