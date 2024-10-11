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
		private String name;
		private int port;
		private String host;
		private QuickserverServer serverInstance;
		private PoolImpl pool;
		private boolean useSSL;
		private String username;
		private String password;
		private int authTimeout = 10;
		private boolean debug = false;
		{
			Map<String, String[]> attrs = new HashMap<String, String[]>(5);
			attrs.put(ManagementFactory.HOP_MULTI_PATTERN, ".*");
			//attrs.put(ManagementFactory.CLIENT_DOMAIN_NAME, serverName.toLowerCase());
			attrs.put(ManagementFactory.SSL_TRUST_STORE_PROVIDER_URL, "/etc/nginx/ssl/truststore.p11");
			attrs.put(ManagementFactory.SSL_KEYSTORE_PASSWORD_FILE, "test.p12");
			attrs.put(ManagementFactory.SSL_SESSION_PW_FILE_NAME, "ssl.p12");
			attrs.put(ManagementFactory.CLIENT_SESSIONS_RETRY_INTERVAL_CLASS,
					ClientSessionRetryInterval.class.getName());
			serverInstance = new QuickserverServer(new Name(name), new Port(port), "www.localhost", "8080", "", attrs, true, null);
		}

/**
 *
 */
	public void main() {
}
}