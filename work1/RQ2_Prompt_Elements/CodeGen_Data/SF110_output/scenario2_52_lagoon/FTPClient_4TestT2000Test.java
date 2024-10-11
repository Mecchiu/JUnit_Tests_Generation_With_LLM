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

    /** Test code template. */
	private static final String TEST_CODE_template =
        "Failed sending command '%s'";
    
	/**
	 * Run the code where the test code takes place.
	 *
	 * @param testCode the code to run
	 */
	private static void runTest(String testCode) {
		runTest("FTPClient", testCode, null);
	}
	
    /**
     * Run the test.
     *
     * @param testCodeTemplate the code template
     * @param testCode the code to run
     * @param testParameters the parameters for the test
     */
	private static void runTest(String testCodeTemplate, 
			     String testCode, 
			     Object... testParameters) {

		assertNotNull("FTPClient.storeUnique(String) is NULL", 
		            getFTPClient(testCode, testParameters));
		assertEquals("FTPClient.storeUnique(String) failed for test code.",
			testCodeTemplate, testCode);

	}
		
	/**
	 * Get the FTP client.
	 *
	 * @param testCodeTemplate the code template
	 * @param testParameters the parameters for the test
	 * @return the FTP client
	 */
	private static FTPClient getFTPClient(String testCode, 
			       Object... testParameters) {

		String url   = "ftp://a.blah:5000";
		String file  = "test.txt";
		String result = null;
		
		if (testCode.indexOf(':')!= -1) {
			url  = "ftp://" + testCode + "@" + testCode.substring(2);
			file = testCode.substring(0, testCode.indexOf(':') + 2);
		}
		
		if (testParameters!= null) {
			for (int i = 0; i < testParameters.length; i++) {
				if (testParameters[i] == null)
					throw new NullPointerException("Test parameters cannot be null");
			}
		}

		FTPClient client;

		try (FTPClient ftp = new FTPClient())
			{
				if (testCode.indexOf(':')!= -1)
					return new FTPClient_4(client, url, file, testParameters);
			}
		catch (IOException e) {
			e.printStackTrace();
		}
		return client;
	}

	/**
	 * Failed sending command.
	 *
	 * @param testCode the code to run
	 *
	 * @throws IOException if a network error occurs
	 */
	private static void failed(String testCode) throws IOException {
		failed("FTPClient", testCode);
	}
	
	/**
	 * Failed sending command.
	 *
	 * @param testCode the code to run
	 * @param testParameters the parameters for the test
	 *
	 * @throws IOException if a network error occurs
	 *
	 * @since 9.0
	 */
	private static void failed(String testCode, 
			       Object... testParameters) throws IOException {
		
		InputStream is = getFTPClient(testCode, testParameters).getInputStream(); 
		String message = readInputStream(is);
		
		assertTrue("Failed sending command '" + testCode + 
		        "'.", message.indexOf("Failed")!= -1);
	}
	
	/**
	 * Get the input stream.
	 *
	 * @param is the input stream
	 *
	 * @return the input stream
	 *
	 * @throws IOException if an I/O error occurs while reading the input
	 * stream or if the connection is dead
	 * @throws NullPointerException thrown if the argument is null
	 * @throws IllegalArgumentException thrown if reading the input stream fails
	 */
	private static String readInputStream(InputStream is) throws IOException {
		StringBuilder buffer = new StringBuilder();

		byte[] data = new byte[8192];
			
		int read = 0;
			
		while ((read = is.read(data))!= -1) {
			buffer.append(new String(data, 0, read));
		}
		
		return buffer.toString();
	}

}
