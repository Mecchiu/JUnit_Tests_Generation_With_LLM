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
private String[] filenames = new String[]{"a.txt", "b.txt", "delete.txt"};
		private final FTPClient client = new FTPClient();

		/**
* Test method for
* {@link nu.staldal.ftp.FTPLine#deleteFile(String)};
* Testing if the {@link FTPClient#deleteFile(String)} method correctly returns the path name.
*
*/
	@Test public void testDeleteFile() throws Exception {
		for (String fname: filenames) {
			assertTrue("Cannot delete file `" + fname + "`", client.deleteFile(fname));
		}
	}

	/**
* Test method for
* {@link nu.staldal.ftp.FTPLine#recvResponse()}
* Testing if the return of {@link FTPClient#recvResponse()} is of type 550.
*
* @throws IOException is thrown in case of exception.
* @throws FTPClientException if an exception is thrown while recv operation.
*/
	@Test
    public void testRecvResponse550() throws IOException, FTPClientException {
		int resp = client.recvResponse();
		IOException exc = null;
		switch(resp) {
		case 550:
			throw new FTPException("Unexpected success of FTP status 550");
			default:
			assertEquals("The response code should be 550, but was: " + resp, 550, resp);
			break;
		}
	}

	/**
* Test method for
* {@link nu.staldal.ftp.FTPLine#recvResponse()}
* Testing if the return of {@link FTPClient#recvResponse()} is of type 421.
*
* @throws IOException is thrown in case of exception.
*/
	@Test
    public void testRecvResponse421() throws IOException {
		int resp = client.recvResponse();
		assertEquals("421", resp);
	}

	/**
* Test method for
* {@link nu.staldal.ftp.FTPLine#recvResponse()}
* Testing if the response {@link Number} is an integer.
* 
* @throws IOException is thrown in case of exception.
* @throws FTPClientException if an exception is thrown while recv operation.
*/
	@Test
    public void testRecvResponse() throws IOException, FTPClientException {
		assertEquals(new Integer(250), client.recvResponse());
	}

	/**
* Test method for
* {@link nu.staldal.ftp.FTPLine#recvLine(java.lang.String)}.
* Testing if the response of recvLine method is written in {@link String} format, not in clear text.
*
* @throws IOException is thrown in case of exception.
* @throws FTPClientException if an exception is thrown while recv operation.
*/
	@Test
   public void testRecvLine() throws IOException, FTPClientException {
    	assertEquals("211", client.recvLine("222"));
    }

	/**
* Test method for
* {@link nu.staldal.ftp.FTPLine#recvLine(java.lang.String)}.
* Testing if the response of recvLine method is written in {@link String} format, without password.
*
* @throws IOException is thrown in case of exception.
* @throws FTPClientException if an exception is thrown while recv operation.
*/
	@Test
   public void testRecvLine2() throws IOException, FTPClientException {
    	assertEquals("211", client.recvLine("222"));
    }

	/**
* Test method for
* {@link nu.staldal.ftp.FTPLine#parseLine(java.lang.String, java.lang.String)}
* Testing if the response of parseLine method is parsed from clear text format.
*
* @throws IOException is thrown in case of exception.
* @throws FTPClientException if an exception is thrown while recv operation.
*/
	@Test
   public void testParseLine_2() throws IOException, FTPClientException {
    	assertEquals("211", client.parseLine("2222"));
    }

	/**
* Test method for
* {@link java.lang.StringBuilder#append(java.lang.String)}.
* Testing if the {@link java.lang.StringBuilder#append(java.lang.String)} method correctly inserts arguments.
*
* @throws IOException is thrown in case of exception.
* @throws FTPClientException if an exception is thrown while recv operation.
*/
	@Test
   public void testAppend_1() throws IOException, FTPClientException {
    	StringBuilder sb1 = new StringBuilder("222");
    	sb1.append("222");
    	assertTrue("Cannot append arguments", client.parseLine("2222") == null);
    }

	/**
* Test method for
* {@link java.lang.StringBuilder#append(java.lang.String)}.
* Testing if the {@link java.lang.StringBuilder#append(java.lang.String)} method correctly inserts arguments.
*
* @throws IOException is thrown in case of exception.
*/
	@Test
   public void testAppend_2() throws IOException {
    	StringBuilder sb1 = new StringBuilder("222");
    	sb1.append("222");
    	assertEquals("111 222", client.toString(sb1.toString()));
    }
}

// End FTPClient_6Test.java
