// FTPClient_5Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#storeUnique(String, boolean)} method.
*/
class FTPClient_5Test {
		@Test
		public void testStoreUnique() throws Exception {
			FTPClient client = new FTPClient();
			client.storeUnique("/");
			assertEquals("/", client.getDirectory());
			assertEquals(0, client.getCurrentDirCount());
		}
		@Test
		public void testExists() throws Exception {
			FTPClient client = new FTPClient();
			assertTrue(client.exists("."));
			client.store("file");
			assertFalse(client.exists("."));
			client.mkdir("file");
		}
		@Test
		public void testExistsLocal() throws Exception {
			FTPClient client = new FTPClient();
			client.exists("/file");
			assertFalse(client.exists("/file"));
		}
		@Test
		public void testCreate() throws Exception {
			FTPClient client = new FTPClient();
			assertTrue(client.create("/file"));
			assertFalse(client.create("/file"));
			assertEquals(300, client.getFileSize("/"));
		}
		@Test
		public void testCreate(boolean noclose) throws Exception {
			FTPClient client = new FTPClient();
			client.create("/file");
			assertFalse(client.create("/file"));
			assertEquals(300, client.getFileSize("/"));
		}
}