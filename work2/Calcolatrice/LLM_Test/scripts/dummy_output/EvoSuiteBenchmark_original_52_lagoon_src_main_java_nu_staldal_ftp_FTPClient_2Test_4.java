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
		/**
		 * Test append().
		 */
		@Test
		public void testAppend() throws Exception {
				// Test case can be run without a password:
				OutputStream os = new FileOutputStream(new File("src/FTPClient_testAppend.bin"));
				byte[] buffer = new byte[os.available()];
				os.write(buffer);
				os.close();
				FTPClient client = new FTPClient();
				OutputStream os1 = client.append("src/FTPClient_testAppend.bin");
				String out = new String(buffer);
				os1.write(out.getBytes("utf-8"));
				os1.close();
				
				assertTrue(os1.toByteArray().length>buffer.length+20);
				
				// Pass a password:
				client = new FTPClient();
				os1 = client.append("src/FTPClient_testAppend.bin", "abcdefg".toCharArray());
				String out1 = new String(buffer);
				client.login();
				os1.write(out1.getBytes("utf-8"));
				os1.close();
				
				// Now try to append a different password:
				os1 = client.append("src/FTPClient_testAppend.bin", "password".toCharArray());
				String out2 = new String(buffer);
				client.logout();
				
				assertTrue(os1.toByteArray().length > buffer.length + 20);
		}
		
		/**
		 * Test append(). For password.
		 */
		@Test
		public void testAppendPass() throws Exception {
				// Test case can be run without a password:
				OutputStream os = new FileOutputStream(new File("src/FTPClient_testPass.bin"));
				byte[] buffer = new byte[os.available()];
				os.write(buffer);
				os.close();
				FTPClient client = new FTPClient();
				OutputStream os1 = client.append("src/FTPClient_testPass.bin");
				String out = new String(buffer);
				os1.write(out.getBytes("utf-8"));
				os1.close();
				
				assertTrue(os1.toByteArray().length > 20);
		}

		/**
		 * Test isConnected().
		 */
		@Test
		public void testIsConnected() throws Exception {
				// Test case can be run without a password:
				InputStream is = new FileInputStream("src/FTPClient_testIsConnected.bin");
				
				FTPClient client = new FTPClient();
				OutputStream os = client.login();
				
				assertTrue(os.toByteArray().length > 20);
				
				os.close();
				
				client.close();
		}

		/**
		 * Test isConnected().
		 */
		@Test
		public void testIsConnected2() throws Exception {
				// Test case can be run without a password:
				InputStream is = new FileInputStream("src/FTPClient_testIsConnected2.bin");
				
				FTPClient client = new FTPClient();
				OutputStream os = client.login();
				
				assertTrue(os.toByteArray().length > 20);
				
				os.close();
				
				client.close();
		}
}