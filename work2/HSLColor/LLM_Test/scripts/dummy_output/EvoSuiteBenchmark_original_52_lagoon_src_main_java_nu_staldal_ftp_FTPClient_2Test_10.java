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
		 * Append a test file: FileName1 with extension.
		* Will create directories as nessesary.
		* Pass a null String for pathname, will append a file name only.
		* @throws IOException if it failed
		*/
	@Test
	void appendString() throws IOException {
		Append testCase = new Append();
		OutputStream os = testCase.append("./1.txt");
		assertFalse(os.getClass().getName().endsWith("OutputStream"));
		os.close();
		return;
	}
}

// Append_2Test.java