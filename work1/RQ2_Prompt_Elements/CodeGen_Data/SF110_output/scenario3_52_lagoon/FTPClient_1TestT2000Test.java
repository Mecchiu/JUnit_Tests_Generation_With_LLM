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
		* Test method for {@link FTPClient#store(String, boolean)}.  Tests correct behavior for normal operation.
		*
		* @throws IOException if any non-IO-specific error occurs
		*/
		@Test
		public void testStore() throws Exception {
			// create the client for both (normal) and passive mode (passive=true)
			FTPClient f = new FTPClient();
			f.connect("localhost", 21);
	        // create a temporary name for the file
	        String name = f.store("Test", true);
						// read the file
	        String fileContents = FileUtils.readFileContents(new File(name));
	        System.err.println("FileContents: "+fileContents);
	        
	        // disconnect, make sure all clients can't write to file
	        f.disconnect();
	        try {
	        // read the file using it's buffer
	        	fileContents = FileUtils.readFileContents(new File(name));
	        	assert (fileContents.length()!= f.bytesAvailable());
	        	assert (fileContents.length()!= 0);//assert (!fileContents.endsWith("\r\n") &&!fileContents.endsWith("\n"));
	        	assert (fileContents.length()!= 0);
	        	assert (f.bytesAvailable() == 0);
	        } catch (Exception e) {
	        	e.printStackTrace();
	        	fail();
	        }
	       
	        // disconnect, make sure all clients can't close a file
	        f.disconnect();
	        try {
	        // read the file using it's buffer
	        	fileContents = FileUtils.readFileContents(new File(name));
	        	assert (fileContents.length()!= 0);
	        	System.err.println("FileContents: "+fileContents);
	        	assert (f.bytesAvailable() == 0);
	        } catch (Exception e) {
	        	e.printStackTrace();
	        	fail();
	        }
		}
		
		/**
		 * Create a new test file.
		 *
		* @param name path to file
		* @throws IOException if an I/O error occurs
		*/
		public void createFile(String name) throws IOException {
			FTPClient f = new FTPClient();
			boolean error = false;
			OutputStream out = f.store(name, false);
			out.close();// close the stream
			try {
				out.close();// close the file
			} catch (IOException e) {
				System.err.println("Exception: "+e.getMessage());
				error = true;
			}
			assert (error);
		}
}
