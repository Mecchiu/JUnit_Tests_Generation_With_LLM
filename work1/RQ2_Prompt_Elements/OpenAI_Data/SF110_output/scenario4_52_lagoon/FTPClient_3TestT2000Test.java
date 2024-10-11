// FTPClient_3Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#append(String, boolean)} method.
*/
class FTPClient_3Test {

	@Test
	void testCase1() throws IOException {
		FTPClient ftpClient0 = new FTPClient("", 0, "", "", "");
		ftpClient0.append("", true);
	}
	
	@Test
	void testCase2() throws IOException {
		FTPClient ftpClient0 = new FTPClient("", 0, "", "", "");
		ftpClient0.append("", false);
	}
	
	@Test
	void testCase3() throws IOException {
		FTPClient ftpClient0 = new FTPClient("", 0, "", "", "");
		ftpClient0.append("", true);
	}
	
	@Test
	void testCase4() throws IOException {
		FTPClient ftpClient0 = new FTPClient("", 0, "", "", "");
		ftpClient0.append("", true);
	}
	
	@Test
	void testCase5() throws IOException {
		FTPClient ftpClient0 = new FTPClient("", 0, "", "", "");
		ftpClient0.append("", true);
	}
	
	@Test
	void testCase6() throws IOException {
		FTPClient ftpClient0 = new FTPClient("", 0, "", "", "");
		ftpClient0.append("", true);
	}
	
	@Test
	void testCase7() throws IOException {
		FTPClient ftpClient0 = new FTPClient("", 0, "", "", "");
		ftpClient0.append("", true);
	}
	
	@Test
	void testCase8() throws IOException {
		FTPClient ftpClient0 = new FTPClient("", 0, "", "", "");
		ftpClient0.append("", true);
	}
	
	@Test
	void testCase9() throws IOException {
		FTPClient ftpClient0 = new FTPClient("", 0, "", "", "");
		ftpClient0.append("", true);
	}
	
	@Test
	void testCase10() throws IOException {
		FTPClient ftpClient0 = new FTPClient("", 0, "", "", "");
		ftpClient0.append("", true);
	}
}