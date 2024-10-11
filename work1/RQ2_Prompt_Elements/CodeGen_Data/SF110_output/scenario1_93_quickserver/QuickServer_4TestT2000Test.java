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

    public volatile static Service instance = null;
    public static QuickServer serverInstance = null;
	Service error = null;
	
	/**
	 * Check if the server has initialized correctly
	 * @throws AppException if any errors are encountered. Throws a {@link AppException}
	 * (as is, most commonly, if there is no server.xml configured)
	 */
	@Test
	void testService() throws AppException {
		try {
			serviceError = null;
			instance = null;
			error = null;
			log("Initialization successfuly");
			serverInstance = QuickServer.initService(QuickServer.getDefaultQuickServerConfig().getConfig());
			if(instance.getState() == null) {
				// Assertion failed : 
				assert (error.getCause()!= null);
				throw (error.getCause());
			}
			assert ((QuickServer)instance).getService().getLogger().isTraceEnabled();
			assert(!(( (QuickServer) instance ).getName().equals("QuickServer.server.Echo") ));	// Server name is "QuickServer"
			assert(!(( (QuickServer) instance ).getName().equals("QuickServer.Echo"))); 					// Server is not Echo
			assert(!(( (QuickServer) instance ).getName().equals("QuickServer.Echo.Echo Server")) );	// Server name is not "QuickServer.server.Echo.Echo Server"
			return;
		}
		catch(Exception e) {
			Throwable t = (Throwable) e.getCause();
			while(t!= null) {
				if(t.getMessage().equals("Could not connect to server")) {
					return;
				}
				t = t.getCause();
			}
			throw e;
		}
	}
	
	private int count = 0;

	private String random_address() 
	{
		if(count == 0)
			return "127.0.0.1:4111";
		return "127.0.0.1:" + new Random().nextInt(2);
	}

	private void serviceError(Throwable e) 
	{
		e.printStackTrace();
		if(e.toString().cont