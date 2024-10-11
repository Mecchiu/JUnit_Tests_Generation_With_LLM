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
private static final byte[] passwd = {'y', 'r', 'e', 'a', 'b', 'a'};
		private static final byte[] pluseg = {'y', '=', 'e', 'a', 'b', 'a'};
		private static final String passwdstr = "'y'=y 'r'=r; 'e'=e; 'a'=a; 'b'=b; 'a'=a'";
		private static final String plusegstr = "'y'=y '='; 'e'=e; 'a'=a; 'b'=b; 'a'=a'";

		@Test
		void create() throws IOException {
			// create new file / /
			FTPClient.append("/");
			assertEquals("/", System.getProperty("user.dir"));
		}
		@Test
		void setPass() throws IOException {
			// set password to plaintext
			FTPClient.append("/");
			assertEquals("/", System.getProperty("user.dir"));
		}
		@Test
		void setPassEncoded() throws IOException {
			// set password to encoded
			FTPClient.append("/");
			assertEquals("/", System.getProperty("user.dir"));
		}
		@Test
		void setPassUnicode() throws IOException {
			// set password to unicode
			FTPClient.append("/");
			assertEquals("/", System.getProperty("user.dir"));
		}
		@Test
		void setPassUnicodeEncoded() throws IOException {
			// set password to unicode
			FTPClient.append("/");
			assertEquals("/", System.getProperty("user.dir"));
		}
		@Test
		void close() throws IOException {
			// set password to plaintext
			FTPClient.append("/");
			FTPClient.append(" ");
			assertEquals("/", System.getProperty("user.dir"));
			FTPClient.append(" ");
			assertEquals("/", System.getProperty("user.dir"));
		}
		// ---------------------------
		@Test
		void setPassReopen() throws IOException, SecurityException {
			// set password to plaintext
			FTPClient.append("/");
			assertEquals("/", System.getProperty("user.dir"));
			FTPClient.append(" ");
			assertEquals("/", System.getProperty("user.dir"));
			FTPClient.append(" ");
			assertEquals("/" + passwdstr, System.getProperty("user.dir"));
		}
		// ---------------------------
		@Test
		void setPassReopenEncoded() throws IOException {
			// set password to encoded
			FTPClient.append("/");
			assertEquals("/", System.getProperty("user.dir"));
			FTPClient.append(" ");
			assertEquals("/", System.getProperty("user.dir"));
			FTPClient.append(" ");
			assertEquals("/" + passwdstr, System.getProperty("user.dir"));
		}
		// ---------------------------
		@Test
		void setPassRefuse() throws IOException {
			// set password to plaintext
			FTPClient.append("/");
			assertEquals("/", System.getProperty("user.dir"));
			FTPClient.append(" ");
			assertEquals("/" + passwdstr, System.getProperty("user.dir"));
			// check only one connection
			FTPClient.append("X");
			assertEquals("/" + passwdstr, System.getProperty("user.dir"));
		}
		// ---------------------------
		@Test
		void setPassNoReopen() throws IOException {
			// set password to plaintext
			FTPClient.append("/");
			assertEquals("/", System.getProperty("user.dir"));
			// check if connection reset occurs
			FTPClient.append("X");
			assertEquals("/", System.getProperty("user.dir"));
		}
		// ---------------------------
		@Test
		void setPlusegEncoded() throws IOException {
			// set password to encoded
			FTPClient.append("/");
			assertEquals("/", System.getProperty("user.dir"));
			FTPClient.append(" ");
			assertEquals("/" + plusegstr, System.getProperty("user.dir"));
		}
		// ---------------------------
		@Test
		void setPlusegUnicodeEncoded() throws IOException {
			// set password to encoded
			FTPClient.append("/");
			assertEquals("/", System.getProperty("user.dir"));
			FTPClient.append(" ");
			assertEquals("/" + plusegstr, System.getProperty("user.dir"));
		}
		// ---------------------------
		@Test
		void setPlusegUnicodeEncodedNoReopen() throws IOException {
			// set password to encoded
			FTPClient.append("/");
			assertEquals("/", System.getProperty("user.dir"));
			// check if connection reset occurs
			FTPClient.append("X");
			assertEquals("/", System.getProperty("user.dir"));
		}
}
