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
		 * Create a new file, or append to an existing file.
		 * Will create directories as nessesary.
		 *
		 * @param pathname path to the file
		 * @param last close the FTPClient after transferring this file
		 * @return an OutputStream to write to, close() it when finished
		 * @throws FTPException if any FTP protocol error occurs
		 * @throws IOException if any other IO error occurs
		 */
		public OutputStream append(String pathname, boolean last)
			throws FTPException, IOException;

		/**
         * Unit test for {@link FTPClient#append(String, boolean)}
         *
         * @throws IOException if any other IO error occurs
         */
        @Test
        void testAppend()
            throws IOException;

		/**
		 * Unit test for {@link FTPClient#append(String)}
         *
         * @throws IOException if any other IO error occurs
         */
        @Test
        void testAppend_2()
            throws IOException;

		/**
         * Unit test for {@link FTPClient#append(File)}
         *
         * @throws IOException if any other IO error occurs
         */
        @Test
        void testAppend_3()
            throws IOException;
}

// Test case of #3.
class FTPClient_3Test_v0_2FTPClient extends AbstractFTPClientV0 {

    /**
     * Construct an <em>empty</em> FTPClient object.
     * Initialize it with the host name, port number and local user directory.
     * This will make the file handle of the stream opened by FTPClient open()
     * a stream of the correct mode, with I/O semantics as in FTP.
     *
     * <strong>Warning:</strong> You shouldn't use <strong>(fileName, last)</strong>
     * as a string argument in the first place. However, you can just cast
     * that to the other type. This is a <i>trivial hack.</i>
     *
     * @param hostname hostname of FTP server
     * @param port port number of FTP server
     * @param localpath local directory of the file
     * @param localname local file name of the file
     * @param localflag flag for local file
     * @throws UnknownHostException if hostname or any of its components is an
     * invalid IP address
     * @throws IOException if any other I/O error occurs
     */
    public FTPClient_3Test_v0_2FTPClient(String hostname,
                                        int port,
                                        String localpath,
                                        String localname,
                                        long localflag) throws UnknownHostException, IOException {
}
}