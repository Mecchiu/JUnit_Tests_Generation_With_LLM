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
		* The first unit test, used to create the client connection.
		*/
        @Test
    public void create_Connection_NoTargets() throws IOException {
// The first case where the destination folder may be removed.
        File folder = new File("/tmp/folder/");
        folder.mkdirs();

        // create client connection
		FTPClient client = new FTPClient();

        // start transfer
		client.connect();

		client.setDirectory(folder.getAbsolutePath());
        client.setFileName(folder.getAbsolutePath() + "/file1.txt");
        client.setUseCpProxy(false);

		try {
			// send command
			client.login();
			try {
				client.store(folder.getAbsolutePath() + "/file2.txt", false);
				fail("Should not successfully store in deleted folder");
			} catch(IOException bad) {
				assertEquals("Folder not deleted after sending command:  " + folder.getAbsolutePath(), bad.getMessage());
			}
		} finally {
			client.logout();
		}
    }

    /**
     * Unit test of the getLastUsedTime method.
     */
    @Test
    public void getLastUsedTime() throws IOException {
    	// create client connection
    	FTPClient client = new FTPClient();
    	try {
    		// initiate fetch
            client.connect();
            client.login();

    		if (client.getLastUsedTime() == -1L) {
    			// the client is not connected
    			fail("Should not successfully connect: " + client.toString());
    			client.logout();
    			return;
    		}

			client.setFileName("test.txt");
    		// set "last used time" option if it is present
			client.setUseGetLastChecked(true);
			client.setFileType(2);

			// start transfer
			Object outputData = null;
			try {
				outputData = client.retrieve();
			} finally {
				if (outputData!= null)
					client.disconnect();
			}

    		long useTime = ((Number)outputData).longValue();

			assertNotNull("Should have send a \"Last used time\" header", outputData);
    		assertEquals("Should be the last used time sent by the client", outputData.toString(), "25220.3");

    		// stop transfer
			client.disconnect();
		} finally {
			client.connect();
		}

    }
}