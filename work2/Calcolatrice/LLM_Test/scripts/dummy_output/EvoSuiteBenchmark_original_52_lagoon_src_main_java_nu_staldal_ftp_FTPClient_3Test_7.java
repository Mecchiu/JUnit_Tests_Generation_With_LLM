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
		/**
		 * Create a new file, or append to an existing file.
		 * Will create directories as nessesary.
		 *
		 * @param pathname path to the file
		 * @param last close the FTPClient after transferring this file
		 * @return an OutputStream to write to, close() it when finished
		 * @throws FTPException if any FTP protocol error occurs
		 * @throws IOException if any other IO error occurs
		 */
		
	public static void TestAppend (String pathname, boolean last) throws FTPException, IOException
	{
		FTPClient fclient = new FTPClient();
		fclient.setLocalSocketFTP (null);
		OutputStream out = null;
		OutputStream err = null;
		
		OutputStream appendOutput = null;
		byte[] buffer = new byte[8192];
		try {		
			// start the connection
			out = fclient.connect(pathname);
			
			fclient.setDataTimeout (1000);
			fclient.login();
			
			// append the data to the file
			appendOutput = fclient.append("ls /"+ pathname + "\"");
			
			// wait to end the connection
			int res = out.read(buffer);
			
			// close the stream
			appendOutput.close();	

			// check if the data is ok
			assertEquals(204, res);
			
			// stop the connection
			fclient.logout();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			throw new IOException(e.getMessage());	
		}
		fclient.logout();
		fclient.disconnect();
		
		// wait to end the test
		try {
			out.close();
		} catch (IOException e) {
			// should be nothing
			e.printStackTrace();
		}
	}
	//@Test
		public void testAppend() throws Exception {
				FTPClient fclient = new FTPClient();
				fclient.setLocalSocketFTP (null);
				OutputStream out = null;
				OutputStream err = null;
			
				// create new file, as not existing, then delete the file		
				OutputStream appendOutput = fclient.append("ls /"+ "/home/");
				
				// set timeout
				fclient.setDataTimeout(5000);
				
				// set PASSIVE_MODE, then send file that will be used for
				// append
				fclient.setPassiveMode(true);
				fclient.login();
				
				appendOutput = fclient.append("ls /"+ "/home/testfile");
				
				// wait for the connection to close
				try {		
					out = appendOutput.close();
				} catch (IOException e) {
					e.printStackTrace();
					throw new IOException(e.getMessage());
				}
				
				// check if the data is ok
				assertEquals(204, out.read(buffer));
				
				// stop the connection
				fclient.logout();
				
				fclient.disconnect("TestAppend");
				
				// close the file
				appendOutput.close();
		}
		
		

}