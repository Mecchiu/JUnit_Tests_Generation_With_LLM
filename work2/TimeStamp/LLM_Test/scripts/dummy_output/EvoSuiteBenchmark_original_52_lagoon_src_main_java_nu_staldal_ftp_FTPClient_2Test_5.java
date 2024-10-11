// FTPClient_2Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#append(String)} method.
*/
class FTPClient_2Test {
		private final String host;
		private final String port;
		private final String username;
		private final String password;
		private final int timeout;
		private boolean aborted;
		private boolean connected;

		/**
		* A new FTPClient_2Test.
		*
		* @param host the host name or IP address of the server.
		* @param port the port number of the server, in the range 0-65535
		* @param username the user name used for all ftp commands
		* @param password the password required to connect to the server.
		* @param timeout the timeout (in milliseconds), in case the local or remote machine is unavailable for some time.
		*/
		public FTPClient_2Test(URL url, String host, String port, String username, String password, final int timeout) throws IOException, UnknownHostException {
			this.host = host;
			this.port = port;
			this.username = username;
			this.password = password;
			this.timeout = timeout;
			try {
				this.connected = false;
			} catch (Exception e) {
				// can't happen
			}
			this.aborted = false;
		}

		//------------------------------------------------------------------------------------------------------------------

		private void assertConnected() throws Exception {
				if (!connected)
					assertTrue(ftpTimeout);
		}

		//------------------------------------------------------------------------------------------------------------------

		private void assertAborted() throws Exception {
				if (connected)
					assertFalse(ftpTimeout);
				assertTrue(ftpTimeout);
		}

		//------------------------------------------------------------------------------------------------------------------

		/**
		 * Close the connection with FTP.
		 */
		public void close() {
			aborted = true;
			try {
				if (!connected)
					return;
				try {
					ftp.logout();
				}
				catch (IOException e) {
				}

			}
			finally {
				connected = false;
			}
		}
}