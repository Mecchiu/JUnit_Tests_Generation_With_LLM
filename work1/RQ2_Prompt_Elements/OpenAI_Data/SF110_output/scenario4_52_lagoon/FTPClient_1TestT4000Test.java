// FTPClient_1Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#store(String, boolean)} method.
*/
class FTPClient_1Test {

	@Test
	void test1() throws Exception {
		FTPClient ftp = new FTPClient("ftp://localhost:21/", "password");
		OutputStream out = ftp.store("/test.txt", true);
		out.write("Hello world".getBytes());
		out.close();
	}
	
	@Test
	void test2() throws Exception {
		FTPClient ftp = new FTPClient("ftp://localhost:21/", "password");
		OutputStream out = ftp.store("/test.txt", true);
		out.write("Hello world".getBytes());
		out.close();
	}
	
	@Test
	void test3() throws Exception {
		FTPClient ftp = new FTPClient("ftp://localhost:21/", "password");
		OutputStream out = ftp.store("/test.txt", true);
		out.write("Hello world".getBytes());
		out.close();
	}
	
	@Test
	void test4() throws Exception {
		FTPClient ftp = new FTPClient("ftp://localhost:21/", "password");
		OutputStream out = ftp.store("/test.txt", true);
		out.write("Hello world".getBytes());
		out.close();
	}
	
	@Test
	void test5() throws Exception {
		FTPClient ftp = new FTPClient("ftp://localhost:21/", "password");
		OutputStream out = ftp.store("/test.txt", true);
		out.write("Hello world".getBytes());
		out.close();
	}
	
	@Test
	void test6() throws Exception {
		FTPClient ftp = new FTPClient("ftp://localhost:21/", "password");
		OutputStream out = ftp.store("/test.txt", true);
		out.write("Hello world".getBytes());
		out.close();
	}
	
	@Test
	void test7() throws Exception {
		FTPClient ftp = new FTPClient("ftp://localhost:21/", "password");
		OutputStream out = ftp.store("/test.txt", true);
		out.write("Hello world".getBytes());
		out.close();
	}
	
	@Test
	void test8() throws Exception {
		FTPClient ftp = new FTPClient("ftp://localhost:21/", "password");
		OutputStream out = ftp.store("/test.txt", true);
		out.write("Hello world".getBytes());
		out.close();
	}
	
	@Test
	void test9() throws Exception {
		FTPClient ftp = new FTPClient("ftp://localhost:21/", "password");
		OutputStream out = ftp.store("/test.txt", true);
		out.write("Hello world".getBytes());
		out.close();
	}
	
	@Test
	void test10() throws Exception {
		FTPClient ftp = new FTPClient("ftp://localhost:21/", "password");
		OutputStream out = ftp.store("/test.txt", true);
		out.write("Hello world".getBytes());
		out.close();
	}
}