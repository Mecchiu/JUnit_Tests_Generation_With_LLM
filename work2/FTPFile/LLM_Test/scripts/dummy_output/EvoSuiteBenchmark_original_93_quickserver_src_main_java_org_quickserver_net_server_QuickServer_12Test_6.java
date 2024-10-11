// QuickServer_12Test.java
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
* It contains one unit test case for the {@link QuickServer#getSSLSocketFactory(String)} method.
*/
class QuickServer_12Test {
		/**
	 * The only required method from {@link QuickServer} is
	 * {@link #getSSLSocketFactory(String)} which sets
	 * the {@link #secureSslSocketFactory} property when the
	 * server is started and sets it to the default
	 * SSL.
	 * @throws Exception 
	 */
	@Test
	public void getSSLSocketFactory_Ssl_SSLException() throws Exception {
		SSLServerSocketFactory servSocketFactory = (SSLServerSocketFactory)getSSLSocketFactory("SSLException");
		assertNotNull(sslSocketFactory);
		assertEquals(SSLServerSocketFactory.getDefault(), servSocketFactory);

		try {
			getSSLSocketFactory("SSLException");
			assertFalse(true);
		}
		catch(Exception e) {
			assertNotNull(sslSocketFactory);
			assertEquals(SSLServerSocketFactory.getDefault(), servSocketFactory);
		}
	}
		/**
	 * The only optional method from {@link QuickServer} is
	 * {@link #getSSLSocketFactory(String)} which sets
	 * the {@link #secureSslSocketFactory} property when the
	 * server is started and does not set it to the default
	 * SSL.
	 * @throws Exception 
	 */
	@Test
	public void getSSLSocketFactory_Ssl_Normal_NoDefaultSSL() throws Exception {
		SSLContext context = SSLContext.getInstance("TLSv1.2");
		assertNotNull(context);
		//context.init(null, null, null);
		context.init(null, null, null, null, null);
		SSLServerSocketFactory servSocketFactory = (SSLServerSocketFactory)getSSLSocketFactory("Ssl_normal_noDefaultSSL", "HelloSSL", context);
		assertNotNull(servSocketFactory);
}
}