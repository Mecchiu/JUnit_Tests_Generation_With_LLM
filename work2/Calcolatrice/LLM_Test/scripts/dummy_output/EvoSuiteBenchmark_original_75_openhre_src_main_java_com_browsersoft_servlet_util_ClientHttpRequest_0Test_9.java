// ClientHttpRequest_0Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post()} method.
*/
class ClientHttpRequest_0Test {
		/**
		 * This method test the method of the ClientHttpRequest class which performs the POST HTTP request.
		 * It returns an output stream, that is written to by the test methods of it.
		* If {@link ClientHttpRequest#get()} returns <tt>null</tt> no exception is raised.
		*
		 * @throws Exception
		 */
    @Test
    public void testPost() throws Exception {
        OutputStream outputStream = post();
		assertNotNull(outputStream);
	}
}