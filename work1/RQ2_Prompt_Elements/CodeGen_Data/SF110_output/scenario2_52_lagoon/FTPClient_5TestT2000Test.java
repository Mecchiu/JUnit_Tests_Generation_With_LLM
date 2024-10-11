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
private static final boolean ISDIR = false;
		private static final String SEP = File.separator;

		@Test
		public void test1_FtpInjection() throws IOException, FTPException {
			OutputStream out = newOutput();

			// Create the ftp client
			ftpClient test(null);

			test.storeUnique("//a/b/c/d/*/ef", false);
			assertFile(out, "/a/b/c/d", 1L, "/ef", 1L, "/");

			test.storeUnique("/", null, false); // test2
		}

		private OutputStream newOutput() throws IOException {
			if (System.getProperty("os.name").equalsIgnoreCase("Windows")) {
				return new FileOutputStream(tempFile("ftpClient_5test.out", ISDIR), true);
			} else {
				return new FileOutputStream(tempFile("ftpClient-test.out", ISDIR), true);
			}
		}

		private void assertFile(OutputStream out,
		        String expectedPath, long expectedSize, String expectedExtension,
                String expectedDirpath, long expectedMTime) throws IOException, FTPException {
			assertEquals(expectedPath, out.toString());
			long actualSize = out.size();
			assertTrue("Incorrect file size.\nExpected: " + expectedSize
					+ "\nActual Path: " + out, actualSize == expectedSize);
			OutputStream expected = newOutput();

			ftpClient test = new FTPClient();

			// FTP will return empty file at start, check for that
			InputStream expectedFileInput = expected;
			inputFile = new FileInputStream(expectedPath);
			int read = 0;
			for (read = 0; read < actualSize; read += read(expectedFileInput, read)) {
				assertReadLength(read, expectedFileInput.read(read), read == actualSize);
			}
			assertEquals("Wrong file size.", actualSize, expected.size());
			System.out.println("Actual dirpath: " + expectedDirpath);
			assertEquals("Wrong file path.", expectedPath, expectedDirpath);
			System.out.println("Actual size: " + actualSize);

			// FTP will upload file in dir, check on output stream
			out = new OutputStream() {

				@Override
				public void close() throws IOException {
				}

				@Override
				public int write(byte b[], int off, int len) throws IOException {
					return len;
				}

			};
			// expectedFileInput = new FileInputStream(expectedPath);
			/*
			 InputStream expectedFileInput = new FileInputStream(tempFile("ftpClient-test.in"));
					ftpClient test = new FTPClient(expectedDirpath, expectedMTime);

					if (expectedFileInput.available() > 0) {
					ftpClient test(expectedFileInput);
					}
					*/
			outputFile = new FileOutputStream(tempFile("ftpClient-test2.out", ISDIR), true);
			ftpClient test = new FTPClient();
			test.storeUnique("/", expectedDirpath);
			test.storeUnique("/" + expectedDirpath, expectedDirpath, true);
			ftpClient test2 = new FTPClient();
			assertFilesEqual(expectedFileInput, read(outputFile, outputFile), actualSize, read(outputFile, outputFile));

			// test2 will not upload any file at this time
			assertEquals("Wrong output size from both tests.", expectedSize, outputFile.size());

			// test2 only writes all but one folder
			ftpClient test3 = new FTPClient();
			test3.storeUnique("//a/b/c/d*", false);
			output = new FileOutputStream(tempFile("ftpClient-test1.out", ISDIR));
			test3.storeUnique("/b/c/d/*", false);
			test3.storeUnique("/b/c/d/*", false, true);
			/*
			InputStream expectedFileInput = new FileInputStream(expectedPath);
			test3.storeUnique("b/c/d/*/*", false);
					output = new FileOutputStream(tempFile("ftpClient-test3.out", ISDIR), false);
					ftpClient test4 = new FTPClient();
					assertFilesEqual(expectedFileInput, read(output, output), expectedSize, read(output, output));
			*/
		}
}
