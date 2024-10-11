// FTPClient_4Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#storeUnique(String)} method.
*/
class FTPClient_4Test {

		@Test
		public void test_1() throws Exception {
				FTPClient client = new FTPClient("localhost", 21, "anonymous", "anonymous", null);
				OutputStream out = client.storeUnique("");
				out.close();
				client.close();
		}
		
		@Test
		public void test_2() throws Exception {
				FTPClient client = new FTPClient("localhost", 21, "anonymous", "anonymous", null);
				OutputStream out = client.storeUnique("");
				out.close();
				client.close();
		}
		
		@Test
		public void test_3() throws Exception {
				FTPClient client = new FTPClient("localhost", 21, "anonymous", "anonymous", null);
				OutputStream out = client.storeUnique("");
				out.close();
				client.close();
		}
		
		@Test
		public void test_4() throws Exception {
				FTPClient client = new FTPClient("localhost", 21, "anonymous", "anonymous", null);
				OutputStream out = client.storeUnique("");
				out.close();
				client.close();
		}
		
		@Test
		public void test_5() throws Exception {
				FTPClient client = new FTPClient("localhost", 21, "anonymous", "anonymous", null);
				OutputStream out = client.storeUnique("");
				out.close();
				client.close();
		}
		
		@Test
		public void test_6() throws Exception {
				FTPClient client = new FTPClient("localhost", 21, "anonymous", "anonymous", null);
				OutputStream out = client.storeUnique("");
				out.close();
				client.close();
		}
		
		@Test
		public void test_7() throws Exception {
				FTPClient client = new FTPClient("localhost", 21, "anonymous", "anonymous", null);
				OutputStream out = client.storeUnique("");
				out.close();
				client.close();
		}
		
		@Test
		public void test_8() throws Exception {
				FTPClient client = new FTPClient("localhost", 21, "anonymous", "anonymous", null);
				OutputStream out = client.storeUnique("");
				out.close();
				client.close();
		}
		
		@Test
		public void test_9() throws Exception {
				FTPClient client = new FTPClient("localhost", 21, "anonymous", "anonymous", null);
				OutputStream out = client.storeUnique("");
				out.close();
				client.close();
		}
		
		@Test
		public void test_10() throws Exception {
				FTPClient client = new FTPClient("localhost", 21, "anonymous", "anonymous", null);
				OutputStream out = client.storeUnique("");
				out.close();
				client.close();
		}
}