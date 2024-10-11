// QuickServer_7Test.java
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
* It contains one unit test case for the {@link QuickServer#suspendService()} method.
*/
class QuickServer_7Test {
		
    // Create QuickServer instance
	public static final QuickServer INSTANCE = new QuickServer();
	
	// Create a connection and handle it.
	public static final String CMD = QueryServerUtil.HOST + "2323"; // PORT
	public static final String CMD1 = "TestCMD";
	public static final String CMD2 = "TestCMD";
	public static final String CMD_START = "StartCMD";
	public static final String CMD_STOP = "StopCMD";
	
	// Create a session and start it.
	public static final String SESSION = QueryServerUtil.getSession(CMD);
	
	String cmdHandle1 = QueryServerUtil.readCMD(SESSION,CMD).trim();
	
	public final static String EMPTY  = "";

	/**
	* Constructor.
	*/
    public QuickServer_7Test(){
	}

	/**
	* Initialize the QuickServers.
	* @since v2.0.4
	*/
	public void initialize() throws Throwable {
		if ( INSTANCE!= null) {
			try {
				INSTANCE.init();
			} catch ( Exception e) {
			}
			INSTANCE.suspendService();
		}
	}
	
	/**
	* Starts a QuickServer.
	* @since v2.0.4
	*/
	public void start() throws Exception {
}
}