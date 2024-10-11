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
		/**
		 * Make sure we work well with unicode filenames.
		 * @throws IOException
		 * @throws FTPException if network problems, or other file operation problems
		 */

		@Test void make() throws IOException, FTPException {
			// Try with unicode filenames
			OutputStream err = new ByteArrayOutputStream();
			try {
				FTPClient.append(new File("C:/tmp/test.dat").toString().replace("\\", "/"));
			} catch (FTPException x) {
				try {
					FTPClient.append(new ByteArrayOutputStream());
				} catch (IOException x2) {
					System.err.printf("test failed with non-fatal error code %d / %s / %s\n", x.getErrorCode(), StringUtil.stringFromException(x2), x.getMessage());
					throw x;
				}
			}
		}

		@Test void append() throws Exception {
			// Append a file
			File input = new File("C:\\temp\\test.dat");
			OutputStream err = new ByteArrayOutputStream();
			OutputStream output = null;
			try {
				output = open(input, "wb");
				FTPClient.append(FileOutputStream(output));
				err.close();
				output.close();
			} catch (Exception x) {
				System.err.printf("FTP test failed with non-fatal error code %d / %s / %s \n", x.getErrorCode(), StringUtil.stringFromException(x), x.getMessage());
				throw x;
			} finally {
				FileOutputStream fout = (FileOutputStream)output;
				try {
					fout.delete();
				} catch (IOException x2) {
					System.err.printf("FTP test failed with non-fatal error code %d / %s / %s \n", x.getErrorCode(), StringUtil.stringFromException(x2), x.getMessage());
					throw x2;
				}
			}
		}

		@Test void open() throws Exception {
			// Open an output stream on a file in the directory C
			File input = new File("C:\\temp\\test.dat");
			OutputStream err = new ByteArrayOutputStream();
			OutputStream output = null;
			try {
				output = open(input, "wb");
				FTPClient.append(FileOutputStream(output));
			} catch (Exception x) {
				System.err.printf("FTP test failed with non-fatal error code %d / %s / %s\n", x.getErrorCode(), StringUtil.stringFromException(x), x.getMessage());
				throw x;
			} finally {
				FileOutputStream fout = (FileOutputStream)output;
				try {
					fout.delete();
				} catch (IOException x2) {
					System.err.printf("FTP test failed with non-fatal error code %d / %s / %s\n", x.getErrorCode(), StringUtil.stringFromException(x2), x.getMessage());
					throw x2;
				}
			}

			// Open an output stream on a file in the directory C
			try {
				output = open(input, "wb");
				System.out.println("FTP append: " + output.toString());
			} catch (Exception x3) {
				System.err.printf("FTP test failed with non-fatal error code %d / %s / %s\n", x.getErrorCode(), StringUtil.stringFromException(x3), x3.getMessage());
				throw x3;
			} finally {
				System.out.println("FTP append: " + output.toString());
			}

		}

		private static FileOutputStream open(File file, String mode) throws java.io.IOException {
			return new FileOutputStream(file, mode);
		}
}