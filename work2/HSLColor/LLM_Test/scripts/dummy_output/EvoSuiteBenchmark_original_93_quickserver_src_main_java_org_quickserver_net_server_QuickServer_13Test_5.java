// QuickServer_13Test.java
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
* It contains one unit test case for the {@link QuickServer#getPID()} method.
*/
class QuickServer_13Test {
		static final int DEFAULT_THREAD_POOL_SIZE = 1000;
		static final int MAXIMUM_THREADS = 100;
		static final int DEFAULT_TIME_INTERVAL = 100;
		static File outputFile;
		static String[] inputFile;
		static String serverName;
		static String serverIP;
		static Integer port;
		static File tmpDir;
		static String hostName;
		static String password;
		static Boolean testMode;

    public QuickServer_13Test(){
		inputFile = new String[MAXIMUM_THREADS];
		serverName = "Test Server";
		serverIP = "127.0.0.1";
		port = Integer.parseInt(System.getProperty("port"));
		hostName = System.getProperty("hostName");
		client = new ClientHandler(inputFile);
		String dataMode = System.getProperty("dataMode");
		if(dataMode == null){
			testMode = false;
			System.out.println("DataMode not in property - Set false for input data mode");
		}
		else {
			testMode = true;
			System.out.println("DataMode set in property - Set to true for input data mode");
		}
		client.setDataMode(dataMode);
		password = System.getProperty("password");
		tmpDir = File.createTempFile("tmpDir", null);
    }

    @Test
    public void testRun(){
}
}