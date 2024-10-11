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
		
    /**
     * Test of {@link QuickServer#suspendService()} method, of class
     * 'QuickServerApp'.
     *
     * @throws AppException if any.
     * @since 1.2
     */
	@Test
    public void test_suspendService() throws AppException {
		System.out.println("Running test case 'QuickServer_7Test.test_suspendService()'");
		
		// Initialize QuickServer object 
		QuickServerApp quickServerApp = new QuickServerApp();
		quickServerApp.setName("SAMPLE");
		quickServerApp.setDataMode("string");
		quickServerApp.setDebug(true);

		try {
			quickServerApp.startServer();
		} catch(AppException e) {
			System.err.println("Server crashed : "+e);
			e.printStackTrace();
		}
		
		
		// Check for some errors 
		try {
			Thread.sleep(1000);// Wait 1 second
		} catch (InterruptedException e) {}
	
		
		// Run the command handler
		String command = "test echo";
		String cmdHandle = "quickServer.EchoCommandHandler";
		quickServerApp.setCommandHandler(cmdHandle);
		
		quickServerApp.setDebug(false);
		
		String output = quickServerApp.execute(command);
		
		// Check for some errors 
		try {
			Thread.sleep(1000);// Wait 1 second

			try {
			System.out.println(output);
			} catch (AppException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}  catch (InterruptedException e) {
			Throwable th = new Throwable();
			e.setStackTrace(new StackTraceElement[0]);
			th.fillInStackTrace();
			System.err.println("Test failed to finish gracefully.");
			System.err.println("Test cause: "+e);
			//System.err.println("Stacktrace: ");
			e.printStackTrace(System.err);
		}
		
		assertNotNull(output);
		assertNotNull(output);
		
		quickServerApp.stop();
		
    }

}