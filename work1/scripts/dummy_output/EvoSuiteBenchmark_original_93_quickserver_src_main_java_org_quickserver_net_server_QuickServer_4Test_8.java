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
		
	private final int  PORT;
	private final String IP;
	private final int  PORT1;
	private final int  PORT2;
	private final String NAME;
	private final TestMode TEST = TestMode.STANDARD;

	public QuickServer_4Test (String ip) throws IOException {
		this(ip, 50000, null);
	}

	public QuickServer_4Test (String ip, int port, boolean portOn) throws IOException {
		IP = ip;
		PORT = port;
		if (portOn) {
			PORT1 = PORT;
			PORT2 = PORT;
			NAME = "EchoServer";
		} else {
			PORT1 = PORT;
			PORT2 = PORT;
			NAME = "EchoServer1";
		}

		// create and start the server thread with this port.
		SSLServerSocket ssl = null;
		SSLServerSocketFactory sslsf = null;
		SSLServerContext sslservercontext = null;
		SSLServerConnection serverconnection = null;
		try {
			sslsf = SSLServerSocketFactory.getDefault();
			if (TEST.USE_CLIENT_EXTENDED_EITHER) {
				ssl =  (SSLServerSocket) sslsf.createServerSocket(PORT);
				SSLServerContext sslservercontext = sslsf.createServerContext(SSLParameters.getDefault(), new java.lang.Boolean(true), SSLParameters.getDefault());
				sslservercontext.setUseClientMode(true);
				serverconnection = (SSLServerConnection) ssl.bind(sslservercontext);
			} else {
				ssl = (SSLServerSocket) sslsf.createServerSocket(PORT);
				ssl.setUseClientMode(true);
				serverconnection = (SSLServerConnection) ssl.bind(ssl);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		/**
		 * Test is that the client has accepted a connection
		 * 
		 * @throws Exception
		 */
	@Test
	public void testClient() throws Exception {
		
		boolean useXMLReader=true, useBasicSocket=(!useBasicSocket);
}
}