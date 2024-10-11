// QuickServer_11Test.java
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
* It contains one unit test case for the {@link QuickServer#getSSLContext(String)} method.
*/
class QuickServer_11Test {
		private static void serverTest(String protocol) throws IOException, IOException, URISyntaxException {
			quickServer(protocol);
			quickServer(protocol);
			quickServer(protocol);
			quickServer("ssl");
		}
		
		@Test
		public void testDefault() throws IOException, URISyntaxException {
			quickTest(true, false);
		}
		@Test
		public void testOpenSSL() throws IOException, URISyntaxException, NoSuchAlgorithmException {
			serverTest("ssl");
		}
		@Test
		public void testOpenSSL2() throws IOException, URISyntaxException, NoSuchAlgorithmException {
			quickTest("sslv2");
		}
		@Test
		public void testOpenSSL3() throws IOException, URISyntaxException, NoSuchAlgorithmException {
			quickTest("sslv3");
		}
		@Test
		public void testSSLLogin() throws IOException, URISyntaxException {
			quickTest(false,"SSLLogin");
		}
		@Test
		public void testAuthenticationLogin() throws IOException, URISyntaxException {
			quickTest("AuthenticationLogin");
		}
		@Test
		public void testSSLLogin_ssl2() throws IOException, URISyntaxException {
			quickTest("SSLLogin_ssl2");
		}
		@Test
		public void testAuthenticationLogin_ssl3() throws IOException, URISyntaxException {
			quickTest("AuthenticationLogin_ssl3");
		}
		@Test
		public void testSSLLogin_openSSL() throws IOException, URISyntaxException, NoSuchAlgorithmException {
			quickTest("SSLLogin_openSSL");
		}
		@Test
		public void testAuthenticationLogin_ssl() throws IOException, URISyntaxException, NoSuchAlgorithmException {
}
}