// FTPClient_3Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#append(String, boolean)} method.
*/
class FTPClient_3Test {
/**
		 * Test class.
		 */
	@Test
	void isAppend() {
		FTPClient a1 = new FTPClient();
		assertTrue(a1.isAppend("a\ndesc2"));
	}
}

