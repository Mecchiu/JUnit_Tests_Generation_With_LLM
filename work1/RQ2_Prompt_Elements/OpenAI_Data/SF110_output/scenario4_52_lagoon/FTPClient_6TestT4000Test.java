// FTPClient_6Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#deleteFile(String)} method.
*/
class FTPClient_6Test {

	@Test
	void test_1() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		assertTrue(ftp.deleteFile("rfc959.txt"));
		ftp.close();
	}
	
	@Test
	void test_2() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		assertTrue(ftp.deleteFile("rfc959.txt"));
		ftp.close();
	}
	
	@Test
	void test_3() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		assertTrue(ftp.deleteFile("rfc959.txt"));
		ftp.close();
	}
	
	@Test
	void test_4() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		assertTrue(ftp.deleteFile("rfc959.txt"));
		ftp.close();
	}
	
	@Test
	void test_5() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		assertTrue(ftp.deleteFile("rfc959.txt"));
		ftp.close();
	}
	
	@Test
	void test_6() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		assertTrue(ftp.deleteFile("rfc959.txt"));
		ftp.close();
	}
	
	@Test
	void test_7() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		assertTrue(ftp.deleteFile("rfc959.txt"));
		ftp.close();
	}
	
	@Test
	void test_8() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		assertTrue(ftp.deleteFile("rfc959.txt"));
		ftp.close();
	}
	
	@Test
	void test_9() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		assertTrue(ftp.deleteFile("rfc959.txt"));
		ftp.close();
	}
	
	@Test
	void test_10() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		assertTrue(ftp.deleteFile("rfc959.txt"));
		ftp.close();
	}
}