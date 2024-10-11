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
		
    /*
    This test class is just a helper class for QuickServer. Each
    of the testing classes above must have a static int
    variable and the int variable is incremented in the end.
    */
    //    public static QuickServer TESTSERVER;
    
    /*
    When testing a connection with a SSL enabled cluster then a timeout
    in the client may cause a server in SSL mode to be shut down. To be
    safe, all we did here was create a timeout connection that acts as a
    pool of client threads. As long as the application shuts down when the
    timeout is triggered all clients will be allowed to connect again.
    When a connect request expires then a thread will be able to connect
    again. A connection timeout of -1 causes the connection to stay open
    until it is closed or its timeout expires. The test cases below assume
    no connection timeout and are based on the assumption that the time
    in milliseconds is in milliseconds since Jan 1 1970.
    An alternative could be, say the timeout between two requests is one
    minute.
    */
    
    public static QuickServer QUICKSERVER;
    static int CLIENT_TIMEOUT = 90000;
    static int CLIENT_MAX_PERSISTENCE = 1000;
    static int CLIENT_MAX_SESSION = 1;
    
	/**
	* Get a server running on a certain port. If there is more than
	* a single port in the pool of running servers get one by cloning so
	* that it does not get the existing one, but does not modify the pool
	* of running servers
	*/
	public static QuickServer getProxy() throws IOException, ClassNotFoundException, InterruptedException {
		if(getPort() == null){
			getPort(8091);
		}
		return QUICKSERVER;
	}
	
	static void getPort(int port) throws IOException, InterruptedException {
		if (PORT_ALIVE.containsKey(port)) {
			PORT_ALIVE.remove(port);
		}

		int lastPort;
		do {
			lastPort = getPort();
		} while(!PORT_ALIVE.containsValue(lastPort));

		PORT_ALIVE.put(port, lastPort+1);
	}

}