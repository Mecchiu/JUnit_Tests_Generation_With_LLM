// QuickServerTest.java
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
* It contains ten unit test cases for the {@link QuickServer#suspendService()} method.
*/
class QuickServerTest {
		
	@Test
	void testSuspendService() {
		QuickServer myServer = new QuickServer();
		myServer.setServiceState(Service.RUNNING);
		myServer.setName("Test Server");
		assertTrue(myServer.suspendService());
		assertEquals(Service.SUSPENDED, myServer.getServiceState());
		assertEquals(0, myServer.getMaxConnection());
		assertEquals("Service is suspended.", myServer.getMaxConnectionMsg());
	}
	
	@Test
	void testSuspendService_NotRunning() {
		QuickServer myServer = new QuickServer();
		myServer.setServiceState(Service.STOPPED);
		myServer.setName("Test Server");
		assertFalse(myServer.suspendService());
		assertEquals(Service.STOPPED, myServer.getServiceState());
	}
}