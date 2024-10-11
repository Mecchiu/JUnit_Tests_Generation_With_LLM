// QuickServer_5Test.java
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
* It contains one unit test case for the {@link QuickServer#startService()} method.
*/
class QuickServer_5Test {
		
	/**
	 * Test method for {@link QuickServer#startService()}.
	 * @since	 1.2
	 */

    @Test
    public void testStartService() {
	quickServer = null;
	quickServer = null;
	quickServer = new QuickServer();
	assertTrue((Boolean)quickServer.startService());
	assertTrue((Boolean)quickServer.startService());
	quickServer = new QuickServer();
	assertTrue((Boolean)quickServer.startService());
	try {
		Class.forName("org.quickserver.net.server.ClinicAdapter");
	} catch (Exception e) {
	}
	quickServer = null;
    }
	
	/**
	 * Test method for {@link QuickServer#startService()}.
	 * @since	 1.2
	 */
	@Test
    public void testSimpleStartService() {
	quickServer = null;
	quickServer = null;
	quickServer = new QuickServer();
	quickServer.startService();
	assertTrue((Boolean)quickServer.startService());
	quickServer = null;
	}
	
	/**
	 * Test method for {@link QuickServer#startService()}.
	 * @since	 1.2
	 */
	@Test
    public void testStartServiceWithMapping() {
	quickServer = null;
	quickServer = null;
//	quickServer = new QuickServer();
//	quickServer = new QuickServer();
//	quickServer = new QuickServer();
//	quickServer = null;
//	quickServer = new QuickServer();
//	quickServer = new QuickServer();
//	quickServer = null;
//	quickServer = null;
//	quickServer = null;
//	quickServer = new QuickServer();
//	quickServer = null;
	quickServer = new QuickServer("/MyCredentials", 10);
//	quickServer = new QuickServer("MyCredentials", 10);
	quickServer = null;
	assertTrue((Boolean)quickServer.startService());
	Class.forName("javax.management.remote.http.spi.ProxyTrustManagerFactory");
	Class.forName("javax.security.auth.x500");
//	runThroughPoolAndCheck();
	
	runThroughPoolAndCheck();
	}

}