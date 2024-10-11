// QuickServer_6Test.java
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
* It contains one unit test case for the {@link QuickServer#stopService()} method.
*/
class QuickServer_6Test {
		
	/**
	* Test method for {@link QuickServer#stopService()}.
	*/
			@AfterAll
			public static void afterEach() {
				quickServer.stopService();
			}
		
	/**
	* Test method for {@link QuickServer#testClientEventHandler()}.
	*/
			@Test
			public void testClientEventHandler() {
		// We test client event handling using the same connection
					// as other classes
							ClientEventHandler.testHandler(
									"ClientEventHandler", new EchoClientHandler()
								);
		}
		
	/** Test method for {@link QuickServer#setName(String)}. */
			@Test
			public void setName() {
		// Setup and execute the test
			quickServer.setName("QuickServer");
		}
		
		/** Test method for {@link QuickServer#getClientCommandHandler()}. */
			@Test
			public void getClientCommandHandler() throws IOException {
		try (
				ClientEventHandler.Executor exECHandler =
				new ClientEventHandler.Executor(true)
				) {
			// Setup and execute the test
			String clientCmdHandler = "ClientCommandHandler";
					ClientEventHandler.testHandler(clientCmdHandler, exECHandler);
		}
		}
		
		/** Test method for {@link QuickServer#getClientCommandHandler(java.lang.String)}. */
			@Test
			public void getClientCommandHandler() throws IOException {
		try (
				ClientEventHandler.Executor exECHandler =
				new ClientEventHandler.Executor(true)
				) {
			// Setup and execute the test
			String clientCmdHandler = "ClientCommandHandler";
					ClientEventHandler.testHandler(clientCmdHandler, exECHandler);
		}
		}
		
		/** Test method for {@link QuickServer#getClientCommandHandler(java.io.InputStream)}. */
			@Test
			public void getClientCommandHandler() throws IOException {
}
}