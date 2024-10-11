// QuickServer_6Test.java
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
* It contains one unit test case for the {@link QuickServer#stopService()} method.
*/
class QuickServer_6Test {
		
	
		
	public static void stopServer() {
		try {
			Class clazz = Class.forName(quickServerVersion);
			Method m = clazz.getDeclaredMethod("stopService");
			m.invoke(null);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String args[])	{
		
		System.setProperty("org.osgi.framework.version", quickServerVersion);
				
		System.setProperty("org.quickserver.port", "4321");
		
		
		// Create Server Pool
		long poolTimeout = 60 * 60;        // 60 minutes
		ClientPool pool = new ClientPool(poolTimeout, ClientPool.RESTART_POLICY, ClientPool.EVENT_DISCARDED);

		boolean authEnabled = true;
		// Connect to server
		pool.setAuthEnabled(authEnabled);
		pool.createConnection("Echo Server", 4321);
		// Create Data Mode.
		DataMode mode = DataMode.STRING;
		String username= null;
		String password= null;
		if (username == null)	username = "guest";
		if (password == null)	password = "guest";
			
		
		// Set Data/Mode:String
		pool.setDataMode(mode);
		// Set User & Password
		pool.setUsername(username);
		pool.setPassword(password);
		
		// Add Client Listener and Client Handler.
		ClientEventHandler ceh = pool.addEventListener();
		ClientHandler cih = ceh.getClient();

		// Register Data Listener
		DataHandler dh = pool.addDataHandler();

		// Register User
		System.setProperty("Echo Server.USERNAME", "guest");
}
}