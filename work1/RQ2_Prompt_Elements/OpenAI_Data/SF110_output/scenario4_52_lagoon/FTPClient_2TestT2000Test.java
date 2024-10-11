// FTPClient_2Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#append(String)} method.
*/
class FTPClient_2Test {

	@Test
	void test_1() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		OutputStream out = ftp.append("/pub/standards/RFC/rfc959.txt");
		out.write(new byte[0]);
		out.close();
		ftp.close();
	}
	
	@Test
	void test_2() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		OutputStream out = ftp.append("/pub/standards/RFC/rfc959.txt", true);
		out.write(new byte[0]);
		out.close();
	}
	
	@Test
	void test_3() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		OutputStream out = ftp.append("/pub/standards/RFC/rfc959.txt", false);
		out.write(new byte[0]);
		out.close();
		ftp.close();
	}
	
	@Test
	void test_4() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		OutputStream out = ftp.append("/pub/standards/RFC/rfc959.txt", true);
		out.write(new byte[0]);
		out.close();
		ftp.close();
	}
	
	@Test
	void test_5() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		OutputStream out = ftp.append("/pub/standards/RFC/rfc959.txt", false);
		out.write(new byte[0]);
		out.close();
	}
	
	@Test
	void test_6() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		OutputStream out = ftp.append("/pub/standards/RFC/rfc959.txt", true);
		out.write(new byte[0]);
		out.close();
	}
	
	@Test
	void test_7() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		OutputStream out = ftp.append("/pub/standards/RFC/rfc959.txt", false);
		out.write(new byte[0]);
		out.close();
		ftp.close();
	}
	
	@Test
	void test_8() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		OutputStream out = ftp.append("/pub/standards/RFC/rfc959.txt", true);
		out.write(new byte[0]);
		out.close();
		ftp.close();
	}
	
	@Test
	void test_9() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		OutputStream out = ftp.append("/pub/standards/RFC/rfc959.txt", false);
		out.write(new byte[0]);
		out.close();
	}
	
	@Test
	void test_10() throws IOException {
		FTPClient ftp = new FTPClient("ftp://ftp.funet.fi/pub/standards/RFC/rfc959.txt", "anonymous");
		OutputStream out = ftp.append("/pub/standards/RFC/rfc959.txt", true);
		out.write(new byte[0]);
		out.close();
		ftp.close();
	}
}