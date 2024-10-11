// QuickServer_4Test.java
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
* It contains one unit test case for the {@link QuickServer#initService(QuickServerConfig)} method.
*/
class QuickServer_4Test {
		/**
		 * Unit tests of {@link QuickServer#initService()}.
		 */
			@Test
		public void testStartServerImpl() {
				QuickServerImpl newQuickServer = new QuickServerImpl_4Test();
			}

			/**
			 * Tests the ClientBinaryHandler.binaryDataAvailable_ method.
			 */
			@Test
			public void testClientBinaryHandlerTest() {
				QuickServerImpl newQuickServer = new QuickServerImpl();
				String testCmdHandle = "testClientBinaryHandlerTest";

				try {
					newQuickServer.setClientCommandHandler(testCmdHandle);
				} catch(AppException e) {
					System.out.println("Error while sending test batch (client side): "+e);
					e.printStackTrace();
				}
				newQuickServer.initService();
				newQuickServer.startServer();
				try {
					newQuickServer.waitUntilServerSucceeds();
				} catch(AppException e) {
					System.out.println("Server terminated.");
					e.printStackTrace();
				}
				assertEquals("Server received the following batch from the client :",  "1", newQuickServer.getClientCommandHandler(new String[]{"cmd_1"}));
			}

			/**
			 * Tests {@link ClientCommandHandler#getClientBinaryDataAvailable()} method.
			 * It is to be sure that the {@link ClientBinaryHandler} is initialized properly.
			 */
			@Test
			public void testClientBinaryHandlerGetterTest() {
				QuickServerImpl newQuickServer = new QuickServerImpl_4Test();
				ClientBinaryHandler newClientBinaryHandler = new ClientBinaryHandlerTest();
				QuickServerImpl.setClientBinaryHandler(newClientBinaryHandler);
			}

			/**
			 * Tests {@link ClientCommandHandler#getClientData()} method.
			 * It is to be sure that the {@link ClientData} is initialized properly.
			 */
			@Test
			public void testClientBinaryHandlerGetterTest_1() {
				QuickServerImpl newQuickServer = new QuickServerImpl_4Test();
				ClientData newClientData = new ClientDataTest();
			}

			/**
			 * Tests {@link ClientCommandHandler#getClientSession()} method.
			 */
}