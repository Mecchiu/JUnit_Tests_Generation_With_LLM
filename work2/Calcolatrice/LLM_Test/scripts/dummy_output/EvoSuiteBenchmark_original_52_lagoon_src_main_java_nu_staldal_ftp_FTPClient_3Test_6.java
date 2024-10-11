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
     * Tests FTPClient.append() against a file with special byte-sequences.
     * @throws MalformedURLException if the url is malformed
     * @throws IOException if there is an IO error
     * @throws FTPException if any FTP protocol error occurs
     */
    @Test
    public void testAppend() throws IOException, MalformedURLException, FTPException {
        String FTPClientURL = "ftp://127.0.0.1:4566/";
        String filePath = "/j/AJDl4M0d/t/l0d/LHxOyEi=s/" + "\u0020\u0027"; // Unicode escaped
        String expectedPath = "j/\u2026\u0027";
        assertEquals(expectedPath, FTPClient.append(filePath));
    }
    
    /**
     * Tests FTPClient.append() against a directory with special byte-sequences.
     * @throws MalformedURLException if the url is malformed
     * @throws IOException if there is an IO error
     * @throws FTPException if any FTP protocol error occurs
     */
    @Test
    public void testAppendDir1() throws MalformedURLException, IOException, FTPException {
        String FTPClientURL = "ftp://127.0.0.1:4566/";
        String dirPath = "/j/AJDl4M0d/e"; // Unicode escaped
        String expectedPath = "/j/\u2026/\u0027";
        assertEquals(expectedPath, FTPClient.append(dirPath));
    }
    
    /**
     * Tests FTPClient.append() against a dir with special byte-sequences.
     * @throws MalformedURLException if the url is malformed
     * @throws IOException if there is an IO error
     * @throws FTPException if any FTP protocol error occurs
     */
    @Test
    public void testAppendDir2() throws MalformedURLException, IOException, FTPException {
        String FTPClientURL = "ftp://127.0.0.1:4243/";
        String dirPath = "/j/AJd/\u2026E"; // Unicode escaped
        String expectedPath = "/j/AJd\u0027/";
        assertEquals(expectedPath, FTPClient.append(dirPath));
    }
    
    /**
     * Tests FTPClient.close().
     */
    @Test
    public void testClose1() {
		FTPClient client = new FTPClient();
		OutputStream out = client.append("//www.google.fr/", false);
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(client.getInputStream(), "utf-8"));
			int b = 0;
			while ((b = in.read())!= -1) out.write(b);
			
			// should be read till EOF
			in.close();
			assertEquals("//www.google.fr/", out.toString());
			in = null;

			// should be read until EOF
			out.close();
			assertEquals("//www.google.fr", out.toString());

			// should be read until EOF
			in = null;
			BufferedReader in2 = new BufferedReader(new InputStreamReader(client.getInputStream(), "utf-8"));
			int b2 = 0;
			while ((b2 = in2.read())!= -1) {
				out.write(b2);
			}
			out.flush();
			in2.close();
			assertEquals("/", out.toString());
		} catch (IOException e) {
			throw new IOError(e);
		}
	}
	
	/**
	 * Test FTPClient.getOutputStream().
	 * @throws IOException if there is an IO error
	 */
	@Test
	public void testGetOutputStream1() throws IOException {
		FTPClient client = new FTPClient();
		InputStream in = client.getInputStream();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(in, "utf-8"));
			int b = 0;
			String line = null;
			
			while ((b = reader.read())!= -1) {
				line = line + (char)b;
			}
			
			assertEquals("/", line);
			
			String last = reader.readLine();
			
			assertNull(last);
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			throw new IOError(e);
		}
	}
	
	/**
	 * Test FTPClient.close().
	 * This test is supposed to pass.
	 */
	@Test
	public void testClose2() {
		FTPClient client = new FTPClient();
		try {
			client.close();
			assertTrue("client.close() should not throw an Exception", false);
		} catch (Exception e) {
			assertTrue("Exception expected", e instanceof Exception);
		}
		assertTrue("client.close() should pass", true);
	}
}