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
		private String FTP_URI;
		private String ftpClientData;
		private FTPClient ftpClient;
		
		public String getFTP_URI() {
			return FTP_URI;
		}
		public void setFTP_URI(String FTP_URI) {
			this.FTP_URI = FTP_URI;
		}
		public String getFtpClientData() throws Exception {
			return ftpClientData;
		}
		
		public void setFtpClientData(String ftpClientData) throws Exception {
			this.ftpClientData = ftpClientData;
		}
		public FTPClient _getInstance() throws Exception {
			return new FTPClient();
		}
		
		@Test public void test_init_set_passive() throws Exception {
			ftpClient = new FTPClient();
			ftpClient.setPassiveMode(true);
			
			OutputStream out = ftpClient(_getInstance().append("foo.txt"));
			assertTrue("FTP client has passed in passive mode", out!= null);
			try {
				out.close();
			} catch (Exception ex) {}
			
			System.out.println(ftpClient._getInstance().getFtpClientData());
		}
		
		@Test public void test_init_set_passive_2() throws Exception {
			ftpClient = new FTPClient();
			ftpClient.setPassiveMode(true);
			ftpClient.setPassiveMode(true);
			
			OutputStream out = ftpClient(_getInstance().append("foo.txt"));
			assertTrue("FTP client has passed in passive mode", out!= null);
			try {
				out.close();
			} catch (Exception ex) {}
			System.out.println(ftpClient.getFtpClientData());
		}
				
		@Test public void test_append() throws Exception {
			ftpClient = new FTPClient();
			OutputStream out = ftpClient("add", "/foo/bar/baz/foobar");
			assertNotNull("OutputStream has not been created", out);
			assertTrue("FTP client has passed in passive mode while FTP should return null", ftpClient.getFtpClientData()!= null);
			assertNotNull("FTP client output stream", out);
			assertEquals("FTP client getFtpClientData()", ftpClientData, ftpClient.getFtpClientData());
			
			out.close();
		}
		
		@Test public void test_append_single() throws Exception {
			ftpClient = new FTPClient();
			OutputStream out = ftpClient("add", "/foo/bar/baz/ooxxx");
			assertNotNull("OutputStream has not been created", out);
			assertTrue("FTP client has passed in passive mode while FTP should return null", ftpClient.getFtpClientData()!= null);
			assertNotNull("FTP client output stream", out);
			assertEquals("FTP client getFtpClientData()", ftpClientData, ftpClient.getFtpClientData());
			
			out.close();
		}
		
		@Test public void test_append_single_2() throws Exception {
			ftpClient = new FTPClient();
			OutputStream out = ftpClient("add", "/foo/bar/baz/oox");
			assertNotNull("OutputStream has not been created", out);
			assertTrue("FTP client has passed in passive mode while FTP should return null", ftpClient.getFtpClientData()!= null);
			assertNotNull("FTP client output stream", out);
			assertEquals("FTP client getFtpClientData()", ftpClientData, ftpClient.getFtpClientData());
			
			out.close();
		}
		
		@Test public void test_append_single_3() throws Exception {
			ftpClient = new FTPClient();
			ftpClient.setPassiveMode(true);
			ftpClient.setPassiveMode(true);
			//
			// This test is not tested while FTP is active (default is passive)
			//
			//
			OutputStream out = ftpClient(_getInstance().append("/foo/bar/baz/ooxxe"));
			assertTrue("FTP client has passed in passive mode while FTP should return null", out==null || out.close() == false);		
			try {
				out.close();
			} catch (Exception ex) {}
			System.out.println(ftpClient.getFtpClientData());
			
		}
		
		/**
		* Test of append(InputStream) method, of class {@link FTPClient}.
		*/
		@Test public void test_append_InputStream_2() throws Exception {
			System.out.println("append(InputStream)");
			ftpClient.setPassiveMode(true);
			ftpClient.setPassiveMode(true);
			OutputStream out = ftpClient("add", "/foo/bar/baz/foobar");
			assertNotNull("OutputStream has not been created", out);
			assertTrue("FTP client has passed in passive mode while FTP should return null", ftpClient.getFtpClientData()!= null);
			assertNotNull("FTP client output stream", out);
			assertEquals("FTP client getFtpClientData()", ftpClientData, ftpClient.getFtpClientData());
			assertTrue("FTP client passive mode", out.getClass().getName()!=null);
			assertEquals("FTP client is active", FTPClient.class, out.getClass().getName());
			
		}
		
}