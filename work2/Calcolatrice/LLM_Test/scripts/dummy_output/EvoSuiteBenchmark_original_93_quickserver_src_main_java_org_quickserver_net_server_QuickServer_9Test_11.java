// QuickServer_9Test.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains one unit test case for the {@link QuickServer#info()} method.
*/
class QuickServer_9Test {
		final static int SERVER_PORT = 4222;
		final static String TEST_PASSWORD = "";
		final static int TIMEOUT = 5000;
	
	public final static String CMD_INVALID_CMD = "invalid cmd";
	public final static String CMD_EQUAL = "equal";
	public final static String CMD_NOT_EQUAL = "difference";
	public final static String CMD_TRUE = "true";
	public final static String CMD_FALSE = "false";

	/**
	 * @since 1.2
	 */
	@Test
    public void test() throws Exception {
        /*
         * Note: a quick server does not require an authentication
         * server, if no authentication is present, it will work without
         * anything
        */
        QuickServer server = new QuickServer();

        /*
         * Note that the QuickServer has different data models which could affect
         * the service output result
         */
        server.setDataMode(DataMode.STRING);

        /*
         * Test the basic functions of the service
         */
        assertEquals("", server.info());

        // Test that the default port is specified as expected
        assertNotNull(server);
        assertEquals(SERVER_PORT, server.getPort());

			// Test that the default Timeout is specified as expected
			assertNotNull(server);
			assertEquals(TIMEOUT, server.getClientTimeout());
		}
}