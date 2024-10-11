// FTPClient_0Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#store(String)} method.
*/
class FTPClient_0Test {
		private String directoryName;
		private String string;
		private FTPClient _ftpClient;

		/**
		 * Create a new FTPClient instance.
		 *
		 * @throws IOException if some network operation stops the connection
		 * @see com.stevpet.jymfony.jmtest.BasicTests#createFile()
		 * @throws IOException if some network operation stops the connection
		 */
		
		public FTPClient_0Test() throws IOException, FTPClientException{
			_ftpClient = new FTPClient();
			Directory dir = newDirectory(String.format("%s/Test", directoryName));
			FTPClient._ftpClient.login();
			_ftpClient.setDirectory(dir.getName());
			directoryName = String.format("%s/FTP_Client/%s/", String.format("%s/Test", directoryName),
					String.valueOf(TestUtil.nextInt()));
			assertFalse(directoryName == null);
		}
}