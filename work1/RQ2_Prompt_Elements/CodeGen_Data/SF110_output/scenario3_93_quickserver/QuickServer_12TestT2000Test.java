// QuickServer_12Test.java
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
* It contains one unit test case for the {@link QuickServer#getSSLSocketFactory(String)} method.
*/
class QuickServer_12Test {

    public void doTesting() {
        String[] hosts = {"quickserver.chaos.com"};
			SSLServer ssn = null;
		
		try {
			ServerSocket ss = new ServerSocket(0);
          for (int i=0; i<4; ++i) {
            ssn = new SSServer(hosts[i], 80, 10);
            ssn.start();
            assertTrue(true);
		}
			ss.close();
		} catch (SecurityException e) {
			System.out.println("Failed to connect to any port : " + e);
			e.printStackTrace(System.out);
        }
        try {
          ssn = new SSServer(null, 8080, 10);
		} catch(SocketException se) {
			System.out.println("The server didn't seem to start.");
        }
	}

  
    @Test
    public void test_00() throws Exception {
	File f1 = File.createTempFile("quickserver.chaos.com", "server", null);
		f1.deleteOnExit();
		f1.delete();
			
        new File(f1.getPath()).delete();
        
        // Start 4 servers. 
		SSLServer ssn4 = SSLServer.createServer(f1, 80, 10, false);
			SSLServer ssn6 = SSLServer.createServer(f1, 8080, 10, false);
		SSLServer ssn32 = SSLServer.createServer(f1, 9090, 10, false);
			SSLServer ssn64 = SSLServer.createServer(f1, 96990, 10, false);
			SSLServer ssn1 = SSLServer.createServer(f1, 127100, 10, false);
		SSLServer ssn2 = SSLServer.createServer(f1, 120000, 10, false);
		