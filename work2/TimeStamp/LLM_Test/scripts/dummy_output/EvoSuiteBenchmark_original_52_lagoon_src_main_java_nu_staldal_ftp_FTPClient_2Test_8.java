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
    * {@link FTPClient#append(String) Test cases in which append() method is called}
    */
    private static final String[] appendTests;
    static {
        appendTests = new String[1];
        appendTests[0] = "test append";
    }

	/**
	* Test method for {@link FTPClient#append(String)}.
	*/
    @Test
    void test_append() throws IOException {
		String string = "foobar";
        OutStream outstream = new OutStream();
        InStream instream = new InStream();

        FTPClient client = new FTPClient(true, false, null, null);
        InputStream in = new InStream(new ByteArrayInputStream(string.getBytes()));
        if (!client.append(string, in, false, false, instream, outstream)) {
            throw new RuntimeException("append not successful.");
        }
        assertTrue("Stream is closed", outstream.closed);
        assertTrue("InStream is closed", instream.closed);
    }

    /**
     * Test method for {@link FTPClient#append(String)}.
     * @throws IOException if any IOException occurs
     */
    @Test
    void test_append_1() throws IOException {
        String string = "foobar";
        String result = "/foobar";
        OutStream outstream = new OutStream();
        InStream instream = new InStream(new ByteArrayInputStream(string.getBytes()));
        InStream outstreamCopy = null;
        //instream.reset();

        FTPClient client = new FTPClient(true, false, "destdir", null);
        InputStream in = new InStream(new ByteArrayInputStream(string.getBytes()));
        if (!client.append(string, in, result, (boolean)true, outstream, outstreamCopy)) {
            throw new RuntimeException("append not successful.");
        }
        assertTrue("Stream does not match", client.stream().equals(outstream));
        assertTrue("Instream did not close properly", outstreamCopy.closed);
    }

    /**
     * Test method for {@link FTPClient#append(String)}.
     * @throws IOException if any IOException occurs
     * @throws FTPException if any FTP protocol error occurs
     */
    @Test
    void test_append_2() throws IOException, FTPException {
        String string = "foobar";
        String result = "/foobar";
        OutStream outstream = new OutStream();
        InStream instream = new InStream(new ByteArrayInputStream(string.getBytes()));
        InStream outstreamCopy = null;
        //instream.reset();
        String result2 = "/somewhere/";
        if (!client.append(string, result, (boolean)false, true, instream, outstreamCopy, outstream)) {
            throw new RuntimeException("append not successful.");
        }
        assertTrue("Stream  does not match", client.stream().equals(outstream));
        assertTrue("Instream did not close properly", outstreamCopy.closed);
        assertTrue("OutputStream does not contain 'foobar", outstreamCopy.contains("foobar")); //test for 'foobar'
                                                                                     //as a terminator of result
        assertTrue("OutputStream does not contain'somewhere/", outstreamCopy.contains("somewhere/"));
    }
}