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
		public static String clientIp;
		public static InetSocketAddress clientAddr;
		public static ClientCommandHandler cmdHandler;
		public static ClientBinaryHandler binaryHandler;
    private static int port=54321; 

    /** This static constructor should be used to create an instance of {@link QuickServer}
    * which is using all clients with default port. */
	public QuickServer_8Test() {
		try { clientIp=System.getProperty("java.host");
			
		} catch (java.security.SecurityException se) {
			clientIp="ERROR=ClientIP not set";
		}
		try { clientAddr=new InetSocketAddress(clientIp, port);
		} 
		catch (UnknownHostException ue) { clientIp=""
				+ "error=ClientIP not assigned, try: " + "java.net.ServerSocket#port";
	}
		
	
	}
	
	/** Test if the service was resumed from suspended state.
    * @see #QuickServer_8Test()
    * @throws Exception
    */
	@Test
    public void testResumeService() throws Exception {

        cmdHandler = null;
        binaryHandler = null;
		
        int timeout=2000;

	/** This method try to load Client Commands  as XML.
    * @throws Exception
    */
}
}