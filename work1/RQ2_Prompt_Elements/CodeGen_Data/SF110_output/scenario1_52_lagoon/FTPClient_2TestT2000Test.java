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
	 * Test case.
	 * @throws MalformedURLException The URL for the test case is malformed.
	 * @throws UnknownHostException An unknown host exception occured.
	 * @throws IOException An I/O exception occured.
	 * @throws FTPException A FTPException occured.
	 * @throws UnknownUserException The user could not be seen in the network.
	 */
	@Test
	void test() throws MalformedURLException, UnknownHostException, IOException, FTPException, UnknownUserException {
		assertNotNull("The user could not be seen in the network.", "no_user");

        String userName = "user_2\n";
        String passWrd = "1.blorta.woo\n";
        FTPClient client = new FTPClient();

        URL u1;
        u1 = new URL("ftp://no_user/dir"); // test 1
        FTPClient client2 = new FTPClient();

        /* Try append the file */
        client2.append(u1.toString() + "/" + userName + "/" + passWrd);

        assertTrue("The output stream was not closed.", client2.getOutputStream()!= null);

        File dir = new File("testfolder", "subdir");
        if (dir.exists()) dir.delete();
        assertEquals(0, dir.list().length);
        dir.mkdir();
        System.out.println("Creating test directory: " + dir.getPath());

        TestMode tm = new TestMode();
        client2.setTestMode(tm);
        client2.append(u1.toString() + "/" + userName + "/" + passWrd);
        client2.close();

        /* Get output stream */
        Object outputStream = client2.getOutputStream();
        assertNull(outputStream);

        for (int i=0; i<tm.dataArray.length; i++) {
                assertEquals(tm.dataArray[i], outputStream.toString());
        }

        assertEquals(0, client2.getDataMode());

        TestMode tm2 = new TestMode();
        client2.setTestMode(tm2);
        client2.append("testfolder/testfileserver");

        /* Verify that file was created */
        Object outputStream2 = client2.getOutputStream();
        assertNotNull("The output stream is null.", outputStream2);

        assertEquals(2, client2.getServerReplyCode());
        assertEquals(2, client2.getDataMode());
        assertEquals(2048, client2.getServerReplyData().length);
        assertEquals("text/plain", client2.getServerReplyData(0));
        assertEquals("user_2", client2.getServerReplyData(1));
        assertEquals("1.blorta.woo", client2.getServerReplyData(10));
        client2.close();

    }
}

// This tests the {@link FTPClient#getOutputStream()} functionality.

//@Test
public class FTPClient_1TestOutputStream extends FtpClient_UtilsMethods {

    public static void main(String[] args) throws UnsupportedEncodingException {
        new FTPClient_1TestOutputStream().start();
    }
}
