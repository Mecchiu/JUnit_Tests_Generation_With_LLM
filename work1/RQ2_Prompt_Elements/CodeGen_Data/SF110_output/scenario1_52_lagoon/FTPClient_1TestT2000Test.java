// FTPClient_1Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#store(String, boolean)} method.
*/
class FTPClient_1Test {
/**
		 * Tests the method {@link FTPClient#store(String, boolean)}.
		 */
    @Test
    void testStore() throws Exception {
         FTPClient client;
         client = new FTPClient();
         client.changeDir("/");

         client.store("test/test", false);
         client.close();
    }
}
