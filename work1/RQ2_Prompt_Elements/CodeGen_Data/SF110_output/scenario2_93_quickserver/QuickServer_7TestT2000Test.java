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

	{ // init
		
		// v1.1
		
		/**
		* Test of {@link QuickServer#suspendService()} method, of class com.sun.jini.test.qa.util.TestServerUtil.
		*/
		
		String name = "SuspendService";
		String expectedErrorMessage = "/home/susame@suntanshaw.com/software/test-framework/TestServerUtil/SuspendServiceTest_Sig";
		System.out.println("#TEST: "+name+" -- "+expectedErrorMessage);
		try {
			String testMessage = name + " - " + name + " - SUSPEND";
			
			System.out.println("#TEST: "+testMessage);
			String message = System.out.println(System.out.println(testMessage)+" ");
			
			if (testMessage == expectedErrorMessage) {
				System.out.println("Exception was expected.");
				System.out.println("  Error message = "+(System.getProperty("Exception.error.stacktrace")!= null? Integer.parseInt(System.getProperty("Exception.error.stacktrace")) : 0));
				System.out.println();
			} else {
				assertTrue(testMessage.indexOf(expectedErrorMessage)!= -1);
			}
			
		} catch (Exception e) {
			fail(e.toString());
		}
		
	}
	/**
	* Test of {@link QuickServer#suspendService()} method, of class org.quickserver.util.pool.ThreadPoolUtil.
	*/
	
	public void testSuspendService() {
		// TODO: to be implemented.
	}

}

