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
		* Test of store method, of class ${@link FTPClient}.
		*/
	@Test
    void testStore_1() throws IOException {
		assertEquals("Content should be stored correctly.",
		    new String(new byte[] {6, 13, 4, 0, 13, 1, 13, 2, 6, 6, 4, 2, 36, 4, 0, 36, 4, 2, 36, 2, 36, 4, 0, 36, 4, 0, 37, 4, 1 }), this.store("/"));
    }
}

// end of class ${@link FTPClient_0Test}.java