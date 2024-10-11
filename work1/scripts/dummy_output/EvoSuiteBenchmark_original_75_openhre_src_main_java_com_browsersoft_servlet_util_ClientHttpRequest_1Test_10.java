// ClientHttpRequest_1Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains one unit test case for the {@link ClientHttpRequest#post(Map)} method.
*/
class ClientHttpRequest_1Test {
		/**
		 * The "testParameters" map is parameter set for the request.
		 * It contains parameters of the method. They can include
		 * the "GET", "POST" or "PUT" parameters, so you can check them in the test.
		 */
	private Map testParameters;

		/**
		 * Creates a test "testParameters" with several parameters.
		 * @param parameters test parameters
		 */
	private void createTestParameters(Map parameters) {
		testParameters = new HashMap(parameters);
	}

	/**
	 * Creates test "testParameters" with only GET, POST and PUT parameters.
	 * @return parameter set
	 */
	private Map createTestParameters() {
		return createTestParameters(new HashMap());
	}

	/**
	 * test "TestParameters_1.java"
	 * @throws Exception
	 */
	@Test
	public void TestParameters_1() throws Exception {
		// init the test parameters
		createTestParameters(createTestParameters());
		Random r = new Random();
		String seed = "this is test parameter " + r.nextInt();
		// create a list - with multiple instances of the same key
		testParameters.put(seed, seed);
		// add test parameter
		testParameters.put(seed + "KEY", seed + "VALUE");
		// check
		assertEquals(1, testParameters.size());
	}

	/**
	 * test "TestParameters_2"
	 * @throws Exception
	 */
	@Test
	public void TestParameters_2() throws Exception {
        // http://docs.oracle.com/javase/1.3/docs/api/java/net/URL.html
		URLConnection conn = new URL("http://foo:bar@FooBar.FooBar.FooBar%3B123").openConnection();
		// add "POST" parameters
		conn.setRequestProperty("FOO", "foo");
		conn.setRequestProperty("BAR", "bar");
		conn.addRequestProperty("KEY", "value");
		// create the "testParameters" with the parameters that we want to set
		createTestParameters(testParameters);
		// add test parameters
		conn.setRequestProperty("KEY", "value2");
		// try all three methods
		try (OutputStream os = conn.getOutputStream()) {
			os.write("POST".getBytes("utf-8"));
			os.write("POST".getBytes("utf-8"));
			os.write("POST".getBytes("utf-8"));
			os.write("POST";
		} catch (IOException e) {
			fail("Unexpected IOException encountered");
		}
		// now read "POST" request and assert
		// it is correct
		try (InputStream is = conn.getInputStream()) {
			assertEquals("POST".getBytes("utf-8"), is.readLine());
			assertEquals("POST".getBytes("utf-8"), is.readLine());
			assertEquals("POST".getBytes("utf-8"), is.readLine());
			is.read();
			is.read();
			is.read();
		} catch (IOException we) {
			fail("Unexpected IOException encountered");
		}
        assertEmpty(testParameters);
	}
}