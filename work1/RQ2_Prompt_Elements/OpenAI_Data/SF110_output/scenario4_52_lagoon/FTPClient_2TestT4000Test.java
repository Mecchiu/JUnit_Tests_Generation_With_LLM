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
		public void testCase1() throws Exception {
				FTPClient client = new FTPClient("ftp://localhost:21/", "password");
				client.append("/home/user/file.txt");
		}
		
		@Test
		public void testCase2() throws Exception {
				FTPClient client = new FTPClient("ftp://localhost:21/", "password");
				client.append("/home/user/file.txt", true);
		}
		
		@Test
		public void testCase3() throws Exception {
				FTPClient client = new FTPClient("ftp://localhost:21/", "password");
				client.append("/home/user/file.txt", false);
		}
		
		@Test
		public void testCase4() throws Exception {
				FTPClient client = new FTPClient("ftp://localhost:21/", "password");
				client.append("/home/user/file.txt", true);
		}
		
		@Test
		public void testCase5() throws Exception {
				FTPClient client = new FTPClient("ftp://localhost:21/", "password");
				client.append("/home/user/file.txt", false);
		}
		
		@Test
		public void testCase6() throws Exception {
				FTPClient client = new FTPClient("ftp://localhost:21/", "password");
				client.append("/home/user/file.txt", true);
		}
		
		@Test
		public void testCase7() throws Exception {
				FTPClient client = new FTPClient("ftp://localhost:21/", "password");
				client.append("/home/user/file.txt", false);
		}
		
		@Test
		public void testCase8() throws Exception {
				FTPClient client = new FTPClient("ftp://localhost:21/", "password");
				client.append("/home/user/file.txt", true);
		}
		
		@Test
		public void testCase9() throws Exception {
				FTPClient client = new FTPClient("ftp://localhost:21/", "password");
				client.append("/home/user/file.txt", false);
		}
		
		@Test
		public void testCase10() throws Exception {
				FTPClient client = new FTPClient("ftp://localhost:21/", "password");
				client.append("/home/user/file.txt", true);
		}
}