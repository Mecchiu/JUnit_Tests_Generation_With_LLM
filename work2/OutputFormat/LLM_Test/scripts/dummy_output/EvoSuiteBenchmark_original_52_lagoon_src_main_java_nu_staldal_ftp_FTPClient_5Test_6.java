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
		/**
		* Test case constructor with no pathname
		* @throws IOException is thrown in this case
		* @throws UnsupportedEncodingException if the pathname used for sending file is not encoded with UTF-8 in path
		*/
		@Test public void testStoreUnique_NoPathname() throws IOException, UnsupportedEncodingException {
				OutputStream s = new OutputStream() {
					public void write(int b) {
					}
				};
				s = storeUnique("", false);
				String output = new String(s);
				assertTrue("This is not a text file: "+ output, output.startsWith("This is not a text file: "));
				}
		/**
		* Test case constructor with an empty pathname
		* @throws IOException is thrown in this case
		*/
		@Test public void testStoreUnique_EmptyPath() throws IOException {
				OutputStream s = new OutputStream() {
					public void write(int b) {
					}
				};
				s = storeUnique("", false);
				String output = new String(s);
				assertTrue("This is not a text file: "+ output, output.startsWith("This is not a text file: "));
				}

}