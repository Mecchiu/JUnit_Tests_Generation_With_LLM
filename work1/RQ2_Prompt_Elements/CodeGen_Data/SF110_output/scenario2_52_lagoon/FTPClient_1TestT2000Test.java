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
@Test
			public void test() throws IOException, TimeoutException, InterruptedException {
                FTPClient client = new FTPClient();
                client.store(".", false);
                check("hello", ClientConnection.BFT_PWD_ONLY.toString());
            }

			private void check(String expected, String result) throws IOException, TimeoutException {
				String result_check = client.fetch(1, false);
                if (expected.equalsIgnoreCase(result_check))
                    return;
				throw new Error("the response " + result_check + " is not expected");
			}
}