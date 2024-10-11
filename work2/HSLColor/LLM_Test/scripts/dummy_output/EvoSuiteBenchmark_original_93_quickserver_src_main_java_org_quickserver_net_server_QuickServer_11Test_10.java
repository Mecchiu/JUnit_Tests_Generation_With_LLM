// QuickServer_11Test.java
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
* It contains one unit test case for the {@link QuickServer#getSSLContext(String)} method.
*/
class QuickServer_11Test {
		
	
	QuickServer_11Test() {
		throw new UnsupportedOperationException("");
	}
	
    @Test
	public void test() {
		System.out.println("QuickServer_11Test started");
		try {
			//System.out.println(">Starting server with Port 3120");
			QuickServer myServer = new QuickServer();
			myServer.setName("Echo Server v1.1");
			myServer.setPort(43123);
			myServer.startServer();

			
			System.out.println("Waiting on the server...");

			Thread.sleep(20000);
			
			//String defaultClientSSL = myServer.getSSLContext("Default");
			//String defaultClientSSHCert = myServer.getSSHCert("Default");
			String defaultSSLcontext = myServer.getSSLContext("Default");
			//myServer.setClientSSL(defaultClientSSL);
//			myServer.setSSLConfig(defaultSSLclientcert);
//			myServer.setHostSSLContext(defaultSSLcontext);
			String defaultSSLcontextStr = myServer.getSSLContext("Default");
			System.out.println("<Closing the server");
			//myServer.shutDown();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("<Stopping the server");
		}
		System.out.println("QuickServer_11Test stopped");
    }

}