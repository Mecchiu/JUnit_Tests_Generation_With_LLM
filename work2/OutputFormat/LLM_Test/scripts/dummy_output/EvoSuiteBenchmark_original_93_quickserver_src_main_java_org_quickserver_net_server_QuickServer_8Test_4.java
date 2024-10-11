// QuickServer_8Test.java
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
* It contains one unit test case for the {@link QuickServer#resumeService()} method.
*/
class QuickServer_8Test {
		
    /**
	 * Creates a client for testing.
	 */
	public QuickServer(){
		// Set the default DataMode if not defined.
		QuickServer.DataMode.getValue();
		// Set up the JVM options for debugging
		String opt0 = "java.io.tmpdir=target/debug/out";
		Runtime.getRuntime().addShutdownHook(new Thread2() {
			public void run ()	{
				// Remove shutdownHook from class path in order to prevent memory leak or crash.
				Runtime.getRuntime().removeShutdownHook(Thread2.this);
			}
		});
		jmv(opt0);
		// Start a JVM server
		startServer();
	}

	/**
	* Start local testing server.
	*/
	public void startServer(){
		SocketAddress sa = new InetSocketAddress(1);
		try {
			JmvSocketTest.TestServer.startServer(InetSocketAddress.class, sa);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Close the clients and servers.
	*/
	public void stopServer() {
		JmvSocketTest.TestServer.stopServer();
		stopServer();
	}

	/**
	* Gets the clients' DataMode.
	*/
	public Object getDataMode() {
		return QuickServer.DataMode.getValue();
	}

}