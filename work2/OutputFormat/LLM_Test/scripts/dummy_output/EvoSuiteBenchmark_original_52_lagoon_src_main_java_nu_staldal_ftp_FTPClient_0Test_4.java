// FTPClient_0Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#store(String)} method.
*/
class FTPClient_0Test {
		/**
		* Creates a new FTPClient which will NOT use any passive mode.
		*
		* @throws IOException if problems creating a new FTPClient
		*/
	@Test void testStorePassiveFalse() throws IOException   {
		try {
			new FTPClient().store("/dev/null");

			fail();
		} catch (IOException e) {
			FileSystemException fe = new FileSystemException("FTP cannot create directory path /dev/null: Does not exist");
			fe.setFtpError();

			assertEquals("FTP.java", e.getMessage());
		}
	}

	/**
	 * Test store with file with directory.
	 *
	 *  @throws FileSystemException FileSystemException
	 *  @throws InvalidProtocolBufferException InvalidProtocolBufferException
	 *  @throws IOException IOException
	 *  @throws MalformedURIException MalformedURIException
	 */
	@Test void testStore() throws IOException, FileSystemException, InvalidProtocolBufferException, InvalidOptionsException, MalformedURIException, URISyntaxException, UnknownHostException {
	
		// Check invalid pathnames
		// TODO use something else with valid pathnames
		checkInvalid("/invalid");
	}

	/**
	 * Test store with new File instance.
	 *
	 * @throws IOException if some problem is encountered during instantiation
	 */
	@Test void testStoreNewFile() throws IOException {
		String pathname = "/invalid.txt";
		File file = File.createTempFile(pathname, ".txt");
		new FileOutputStream(file).close();

		String content = null;
		InputStream is = null;

		// Store on a new file, passing it the specified content to the constructor
		try {
			store(file);

			content = readFile(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		assertEquals("/invalid.txt", pathname);
		assertEquals(content, "/invalid.txt");

		// Store on a previously file
		FileInputStream fstream = new FileInputStream(file);
		store(file);

		// Check content of the file
		content = readFile(file);
		// check content is correct of the previously store

		assertEquals(pathname, content);

		// Check content again (not possible after new file creation)
		// This happens when trying to get content of a directory on its own

		content = readFile(file);
		// and this time check what content is already in it
		assertEquals(content, readFile(file));

		assertEquals("", readFile(file));
		assertEquals(null, readFile(file));
		// TODO more testing here

	}

	/**
	 * Test readFile.
	 *
	 * @param pathname path name where file was found
	 * @return the content of the file, if available.
	 * @throws IOException if some problem is encountered during instantiation
	 */
	private String readFile(String pathname) throws IOException {
		URI uri;
		try {
			uri = new URI("ftp://"+System.getProperty("user.name")+"@localhost:"+System.getProperty("ftpPort"), null, null, null);
		}
		catch (URISyntaxException e) {
			throw new IOException();
		}

		try (URLConnection connection = uri.toURL().openConnection()) {
			InputStream is = null;
			try {
				is = connection.getInputStream();

				int data = connection.getContentLength();
				if (data < 0) {
					throw new UnknownHostException();
				}
			}
			finally {
				if (connection!= null) {
					connection.disconnect();
				}
			}
			try (ByteArrayOutputStream bout = new ByteArrayOutputStream()) {
				byte[] data = new byte[data];
				while (true) {
					int numbytes = is.read(data);
					if (numbytes < data.length) {
						bout.write(data, 0, numbytes);
					} else {
						break;
					}
				}
				return new String(bout.toByteArray(), "UTF8");
			}
		} catch (UnknownHostException e) {
			throw new IOException();
		}
	}
}