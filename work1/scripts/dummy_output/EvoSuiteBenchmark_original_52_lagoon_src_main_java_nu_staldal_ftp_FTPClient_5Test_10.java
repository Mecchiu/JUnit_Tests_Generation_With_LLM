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
		public void test() throws IOException {
			// given
            String path = "/home/admin/finance_banking/data/01.xm";
			// when
            OutputStream out = testObject.storeUnique(path, true);
            // then
            assertNotNull(out);
			// close stream
            out.close();

			// then, the string should now be the same
            String st = new Scanner(new File(out.toString())).useDelimiter("/").next();
            assertTrue(st == path);
		}
}