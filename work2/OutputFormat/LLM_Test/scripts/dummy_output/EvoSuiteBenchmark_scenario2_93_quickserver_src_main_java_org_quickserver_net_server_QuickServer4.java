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
* It contains ten unit test cases for the {@link QuickServer#initService(QuickServerConfig)} method.
*/
class QuickServerTest {
		
	/**
	* Test case for {@link QuickServer#initService(QuickServerConfig)} method.
	* It tests the case when the {@link QuickServerConfig} object is null.
	*/
	@Test
	public void testInitService_NullConfig() {
		QuickServer quickServer = new QuickServer();
		assertFalse(quickServer.initService(null));
		assertNotNull(quickServer.getServiceError());
	}
	
	/**
	* Test case for {@link QuickServer#initService(QuickServerConfig)} method.
	* It tests the case when the {@link QuickServerConfig} object is not null.
	*/
	@Test
	public void testInitService_NotNullConfig() {
		QuickServer quickServer = new QuickServer();
		QuickServerConfig quickServerConfig = new QuickServerConfig();
		assertTrue(quickServer.initService(quickServerConfig));
		assertNull(quickServer.getServiceError());
	}
}