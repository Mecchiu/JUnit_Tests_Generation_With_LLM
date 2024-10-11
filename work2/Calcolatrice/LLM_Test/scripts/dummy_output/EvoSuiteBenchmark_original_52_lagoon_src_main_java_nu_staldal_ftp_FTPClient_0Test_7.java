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
		/**
		* Test store method.
		* <em>Not</em> thread-safe, i.e. you cannot start a new file while another one in
		* progress.
		*
		* @throws IOException if any other IO error occurs
		* @throws FTPException if any FTP protocol error occurs
		*/
		@Test
		void store() throws IOException, FTPException {
			String path = "example.txt";
			OutputStream f = store(path);
			assertNotNull("f should not be null", f);
			f.close();
		}
}