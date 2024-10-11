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
		File f;

		/**
		 * A constructor for a freshly created file.
		 *
		 * @param pathname path to the file
		 */
		FTPFileStorageTest(String pathname) throws IOException;

		@Test
		void test() throws IOException;
}