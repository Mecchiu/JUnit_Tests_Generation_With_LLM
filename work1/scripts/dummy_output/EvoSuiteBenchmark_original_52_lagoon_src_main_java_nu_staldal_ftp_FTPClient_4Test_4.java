// FTPClient_4Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#storeUnique(String)} method.
*/
class FTPClient_4Test {
		/**
		 * Create a new file with an unique name.
		 * @param path path to the file, must end with '/' or be empty
		 * @throws FTPException if protocol error occurs
		 */
            @Test
    int fileStoreUniqueTest(String path) throws FTPException;

				/**
		 * Create a new file with an unique name.
		 * @param path path to the file, must end with '/' or be empty
		 *             if passing true
		 * @param if true then store will use the server's host
		 *             configuration, false then store will use a port
		 * @throws FTPException if protocol error occurs
		 */
    int fileStoreUniqueTest(String path, boolean if) throws FTPException;
}