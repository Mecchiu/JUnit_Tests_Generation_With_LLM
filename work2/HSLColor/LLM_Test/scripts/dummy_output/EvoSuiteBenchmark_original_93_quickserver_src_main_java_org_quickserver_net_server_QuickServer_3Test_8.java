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
		
	/**
	* Test one main loop.
	*/
	@Test public void 1MainLoop()  {
		//v1.1.1
		String port = "tcp://localhost:8080";
		QuickServer svc = null;
		ServerConfiguration sc = new ServerConfiguration();
		svc = svc.initService(new Object[] {port});

		Thread t = svc.getThread();
                t.join(); // in main thread
            t = null; // as we call shutdownServer() in main thread

		assertNotNull("the Server was not created", svc);
		svc.shutdownServer();
		assertFalse(t!= null);
		assertFalse("there is not any active one", true);
		//v1.1.2
		sc.setServer(null);
		Thread.sleep(500);
		assertEquals(0, t.getCount());
		//v1.2
		sc.setServer(svc);
       	svc.shutdownService();
       	assertFalse(t!= null);
        assertFalse("there is no active one", true);
        t.join(); // in main thread
	}
}