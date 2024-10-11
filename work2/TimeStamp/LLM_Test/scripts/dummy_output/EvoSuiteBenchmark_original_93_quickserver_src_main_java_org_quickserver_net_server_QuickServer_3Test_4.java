// QuickServer_3Test.java
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
* It contains one unit test case for the {@link QuickServer#initService(Object[])} method.
*/
class QuickServer_3Test {
		
	final int port;
	//private String name;
	final String serverName;
	final String serverName2;
	final String serverName3;
	final int a;
	final int b;
	private final  SocketAddress myhost;
	protected long lastHeartBeat = System.currentTimeMillis();

	/**
	 * Construct a test object to test the service.
	 *
	 * @param a is the name of the test server
	 * @param b is the number of client (connections)
	 * @param test is the name of test (the test is specific to the server
	 *      and does nothing for other test)
	 * @param serverName the name of the server
	 * @param serverName2 the name of the server
	 * @param serverName3 the name of the server
	 * @param port the server's local port
     * @since 1.2
     */
	QuickServer_3Test(String a, int b,
	                   String test,
		                 String serverName,
                           String serverName2,
                           String serverName3,
                           int port) {
		this.name = a;
		this.serverName = serverName;
		this.serverName2 = serverName2;
		this.serverName3 = serverName3;
		this.a = a.length()>0? Integer.parseInt(a, 16):0;
        this.b = b;
		this.port = 2*port;
 		
		HashSet listeners = new HashSet();

    //this.add(new EchoCommandHandler(this));
		//this.add(new ClientEventHandler());
		this.add(new ClientCommandHandler(this));
		this.add(new ClientObjectHandler(this));
		this.add(new ClientBinaryHandler(this));
		this.add(new ClientWriteHandler(this));
		this.add(new ClientAuthenticationHandler());
		this.add(new ClientData(this));
		this.add(new ClientExtendedEventHandler());
		this.add(new QuickServerCommandHandler());
		
		//this.add(new ClientDataHandler());

}
}