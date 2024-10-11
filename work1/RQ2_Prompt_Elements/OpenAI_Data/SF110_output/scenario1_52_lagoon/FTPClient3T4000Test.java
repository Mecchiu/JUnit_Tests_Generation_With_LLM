// FTPClientTest.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#append(String, boolean)} method.
*/
class FTPClientTest {

	@Test
	public void testAppend1() throws FTPException, IOException {
		FTPClient ftp = new FTPClient();
		ftp.connect("localhost", 21);
		ftp.login("anonymous", "anonymous");
		ftp.setType(FTPClient.TYPE_ASCII);
		ftp.append("/home/anonymous/test.txt", true);
		ftp.disconnect();
	}
	
	@Test
	public void testAppend2() throws FTPException, IOException {
		FTPClient ftp = new FTPClient();
		ftp.connect("localhost", 21);
		ftp.login("anonymous", "anonymous");
		ftp.setType(FTPClient.TYPE_ASCII);
		ftp.append("/home/anonymous/test.txt", false);
		ftp.disconnect();
	}
	
	@Test
	public void testAppend3() throws FTPException, IOException {
		FTPClient ftp = new FTPClient();
		ftp.connect("localhost", 21);
		ftp.login("anonymous", "anonymous");
		ftp.setType(FTPClient.TYPE_ASCII);
		ftp.append("/home/anonymous/test.txt", true);
		ftp.disconnect();
	}
	
	@Test
	public void testAppend4() throws FTPException, IOException {
		FTPClient ftp = new FTPClient();
		ftp.connect("localhost", 21);
		ftp.login("anonymous", "anonymous");
		ftp.setType(FTPClient.TYPE_ASCII);
		ftp.append("/home/anonymous/test.txt", false);
		ftp.disconnect();
	}
	
	@Test
	public void testAppend5() throws FTPException, IOException {
		FTPClient ftp = new FTPClient();
		ftp.connect("localhost", 21);
		ftp.login("anonymous", "anonymous");
		ftp.setType(FTPClient.TYPE_ASCII);
		ftp.append("/home/anonymous/test.txt", true);
		ftp.disconnect();
	}
	
	@Test
	public void testAppend6() throws FTPException, IOException {
		FTPClient ftp = new FTPClient();
		ftp.connect("localhost", 21);
		ftp.login("anonymous", "anonymous");
		ftp.setType(FTPClient.TYPE_ASCII);
		ftp.append("/home/anonymous/test.txt", false);
		ftp.disconnect();
	}
	
	@Test
	public void testAppend7() throws FTPException, IOException {
		FTPClient ftp = new FTPClient();
		ftp.connect("localhost", 21);
		ftp.login("anonymous", "anonymous");
		ftp.setType(FTPClient.TYPE_ASCII);
		ftp.append("/home/anonymous/test.txt", true);
		ftp.disconnect();
	}
	
	@Test
	public void testAppend8() throws FTPException, IOException {
		FTPClient ftp = new FTPClient();
		ftp.connect("localhost", 21);
		ftp.login("anonymous", "anonymous");
		ftp.setType(FTPClient.TYPE_ASCII);
		ftp.append("/home/anonymous/test.txt", false);
		ftp.disconnect();
	}
	
	@Test
	public void testAppend9() throws FTPException, IOException {
		FTPClient ftp = new FTPClient();
		ftp.connect("localhost", 21);
		ftp.login("anonymous", "anonymous");
		ftp.setType(FTPClient.TYPE_ASCII);
		ftp.append("/home/anonymous/test.txt", true);
		ftp.disconnect();
	}
	
	@Test
	public void testAppend10() throws FTPException, IOException {
		FTPClient ftp = new FTPClient();
		ftp.connect("localhost", 21);
		ftp.login("anonymous", "anonymous");
		ftp.setType(FTPClient.TYPE_ASCII);
		ftp.append("/home/anonymous/test.txt", false);
		ftp.disconnect();
	}
}