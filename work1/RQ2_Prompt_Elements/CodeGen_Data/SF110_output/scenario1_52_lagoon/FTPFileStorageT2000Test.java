// FTPFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.*;
import nu.staldal.lagoon.core.*;
import nu.staldal.ftp.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFileStorage}.
* It contains one unit test case for the {@link FTPFileStorage#createFile(String)} method.
*/
class FTPFileStorageTest {
private FileStore fileStore;
		private FTPClient ftpClient;

		@BeforeEach
		public void setup() throws IOException {
			fileStore = new FTPSingleFileStore();
		}
		
		@Test
		public void testFile_path() throws URISyntaxException, IOException {
			URL url = new URL("ftp://nobody.s3.amazonaws.com");
			URLConnection connection = url.openConnection();
			assertEquals("ftp://nobody.s3.amazonaws.com:21/", connection.getURL().getPath());
		}
		
		@Test
		public void testFile_invalid_url() throws IOException {
			try {
				ftpClient = new FtpClient();
				ftpClient.parseURI("http://localhost:1111");
				fail();
			} catch (FtpException e) {
				assertTrue(e.getStatusCode() == HttpURLConnection.HTTP_NOT_FOUND);
				assertEquals("ftp://localhost:1111", e.getURL().getPath());
			} catch (InvalidProtocolException e) {
			}
				
		}
		
		@Test
		public void testFile_invalid_location() throws IOException {
				// Note that this test does use a URI which is not a path name
				URL invalidLocation = new URL("ftp://localhost:0");
				
				// Create a fake location URL
				try {
					ftpClient = new FtpClient(invalidLocation, "password");
					ftpClient.parseURI("http://localhost:0");
					fail();
				} catch (FtpException e) {
					assertEquals(HttpURLConnection.HTTP_UNAVAILABLE, e.getStatusCode());
					assertTrue(e.getMessage().startsWith("Invalid location"));
				}
		}
		
		@Test
		public void testFile_path_prefix() throws Exception {
			String expected = "remoteFtp: ";
			
			// Test a path prefix
			URL url = new URL("ftp://localhost:80:20");
			ftpClient = new FtpClient(url, expected);

			assertEquals(expected,
					ftpClient.readStream(new ByteArrayInputStream("remoteFtp: remoteFtp: \r".getBytes())).toString());
			
			// Test a path with a trailing slash
			// Note that if you use the URI directly from the URL, it will be the "localhost" URI, not
			// as it is in a URI. This may change in the future, in which case we can just test a path
			// without a trailing slash
			url = new URL("ftp://localhost:80:20/");
			ftpClient = new FtpClient(url, expected);

			assertEquals(expected,
					ftpClient.readStream(new ByteArrayInputStream("remoteFtp: remoteFtp: \r".getBytes())).toString());
			
			// Test a path without a trailing slash
			url = new URL("ftp://localhost:80:20/");
			ftpClient = new FtpClient(url, expected);

			assertEquals(expected,
					ftpClient.readStream(new ByteArrayInputStream("remoteFtp: remoteFtp: \r".getBytes())).toString());
		}
		
		// This test case is duplicated from above
		@Test
		public void testFile_location() throws Exception {

			URL url = new URL("ftp://localhost:8080/");
			ftpClient = new FtpClient(url, "password");
			assertEquals("ftp://localhost:8080/", ftpClient.currentLocation().getPath());
			assertEquals("ftp://localhost:8080", ftpClient.currentLocation().openNewConnection().toString());
			if (DEBUG) {
				System.out.println("Current connection to " + url.getHost() + ":" + url.getPort());
				System.out.println("Current location = " + url.getPath());
			}
			assertNotNull(ftpClient.readStream(new ByteArrayInputStream("localFtp: localFtp: \"remoteFtp: remoteFtp:\"\r\n").getBytes()));
			assertNotNull(ftpClient.readStream(new ByteArrayInputStream("remoteFtp: remoteFtp: \r\n").getBytes()));
			assertNotNull(ftpClient.readStream(new ByteArrayInputStream("localFtp: localFtp: remoteFtp: \" \r\n".getBytes())));
			assertNull(ftpClient.readStream(new ByteArrayInputStream("remoteFtp: remoteFtp ")).read());
			assertEquals("remoteFtp: remoteFtp: \" \r\n\"\r\n", new String(ftpClient.readStream(new ByteArrayInputStream("remoteFtp: localFtp: remoteFtp ").getBytes()).toString()));

			url = new URL("ftp://localhost:808080");
			ftpClient = new FtpClient(url, "password");
			if (DEBUG) {
				System.out.println("Current connection to " + url.getHost() + ":" + url.getPort());
				System.out.println("Current location = " + url.getPath());
			}
			assertNotNull(ftpClient.readStream(new ByteArrayInputStream("localFtp: localFtp: \"remoteFtp: remoteFtp:\"\r\n").getBytes()));
			assertEquals("localFtp: remoteFtp: remoteFtp: \" \r\n\"\r\n", new String(ftpClient.readStream(new ByteArrayInputStream("localFtp: localFtp: remoteFtp: \" \r\n".getBytes()))));
		}

}
