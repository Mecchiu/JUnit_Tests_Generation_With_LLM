// QuickServer_0Test.java
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
* It contains one unit test case for the {@link QuickServer#getVersion()} method.
*/
class QuickServer_0Test {
		private TestCommandHandler testCmdHandle = new TestCommandHandler();
		private QuickServer testInstance;
		
		public boolean testStartServer(){
			return (testCmdHandle.setDebug(true));
		}
		/**
		* Test main method of {@link QuickServer} with default settings.  The default
		* test settings are set in the config.p file.
		*/
		@Test
		public void testMainWithDefaultSettings() {
			try {
				testInstance = new QuickServer();
			} catch (IOException e) {
				fail("Unable to initialize QuickServer : " + e);
			}

			try {
				testInstance.startServer();
			} catch (Exception e) {
				fail("Server started unexpectedly : " + e);
			}
		}
		/**
		* Test main method of {@link QuickServer} with client config setting passed
		* in the config.p file.
		* The client config settings will override default settings unless the test
		* is executed in an already configured client.
		*/
		@Test
		public void testMainWithConfig() {
			try {
				testInstance = new QuickServer();
				String clientConfigLocation = System.getProperty("clientConfigFile");
				if(clientConfigLocation == null) {
					fail("Unable to find client config file in environment");
				}
				ConfigFile config = new ConfigFile(clientConfigLocation, "default", "properties");
				new ConfigFile(null, "client", "properties", config).setProperty("default.properties", "default");
				ConfigFile config2 = new ConfigFile("cluster", "admin", "properties");
				new ConfigFile(null, "client", "properties", config2).setProperty("default.properties", "default");
				testInstance.startServer();
			} catch (Exception e) {
				fail("Server started unexpectedly : " + e);
			}
		}


///// Private Classes
//////  To be done by the server side:
//////  - Implement the handler interface for client/server communication
//////  - Provide a "TestCommandHandler" implementation of start()
//////  - Implement "TestProtocolHandler" as well which also runs the communication
//////  - Implement ClientCommandHandler which runs the process of command
//////  - Implement HandlerBinaryHandler which handles binary data
//////  - Run a client event listener in the listener queue
//////  - Implement ListenerCommandHandler which processes the commands from the listener queue
//////  - Provide CommandHandlerFactory
}